package Reto2;

import java.util.Scanner;

public class Registro {
    private String[] estudiantes;
    private int posicion;
    
    public Registro(){
        this.estudiantes = new String[100];
        this.posicion = 0;

    }
    public void agregarEstudiante(String estudiante ){
        this.estudiantes[posicion] = estudiante;
        this.posicion++;
    }
    public void listarEstudiante(){
        System.out.println("***Listado de estudiantes***");
        for(int i =0; i < posicion; i++){
            System.out.println(this.estudiantes[i]);
        }
    }
    //1&Pregrado&Luis Parra&21&Medicina&Raizal&15
   //[0]
    public int procesarComando(String registro){
        String[] comandoArr = registro.split("&");
        int opcion = Integer.parseInt(comandoArr[0]);
        switch(opcion){
            case 1:
                String ubicacion = comandoArr[1];
                String nom = comandoArr[2];
                int ed = Integer.parseInt(comandoArr[3]);
                String pro = comandoArr[4];
                String etnia = comandoArr[5]; 
                
                if(ubicacion.equals("Pregrado")){
                    int cantcre = Integer.parseInt(comandoArr[6]);
                    Pregrado pregrado = new Pregrado(nom, ed, pro, etnia, cantcre);
                    
                    agregarEstudiante(pregrado.toString());
                }
                else{
                    String mod = comandoArr[6];
                    Posgrado posgrado  = new Posgrado(nom, ed, pro, etnia, mod);
                    agregarEstudiante(posgrado.toString());
                }
                break;
            case 2:
                listarEstudiante();
                break;
            default:
                break;

        }
        return opcion;
    }
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        Registro inicio = new Registro();
        int opc; 
        do {
            String registro = input.nextLine();
            opc = inicio.procesarComando(registro);
        } while(opc == 1 || opc == 2);
    }    
}