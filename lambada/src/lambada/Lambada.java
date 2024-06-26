package lambada;

import static lambada.Lambda.lista;

public class Lambada extends Alumno{

    //static ArrayList<Alum> Alum = new ArrayList();
    public static void main(String[] args) {
        /*
        Alumno lista[] = {new Alumno(1,"123","Camilo","Mamian","C#",5.0,24),
        new Alumno(2,"456","Stiven","Alvear","Python",4.0,28),
        new Alumno(3,"789","Ricardo","Milos","Java",3.0,24),
        new Alumno(4,"987","Aldemar","Bernal","Kotlin",1.0,23),
        new Alumno(5,"789","Juan","Potes","C++",4.5,18),
        new Alumno(6,"654","Nicolas","Olave","C",4.2,23),
        new Alumno(7,"321","Viviana","Cangrejo","Ruby",3.5,23),
        new Alumno(8,"012","Ing","Moster","Angular",4.0,20),
        new Alumno(9,"023","Cristian","Avendaño","JavaScript",4.0,20),
        new Alumno(10,"034","Cristian","Montoya","PHP",4.3,28)
        };  
        for(Alumno i : lista){
            System.out.println(i);
        }
        */
        //Imprime la lista de estudiantes:
        for(Alumno i : lista){
            System.out.println(i);
        }
        int arr = 0;
        //Imprime la longitud de la lista:
        for(int i = 0; i<lista.length;i++){
           arr = lista.length;
        }
        System.out.println("La longitud del lista es de: "+arr);
        //Obtenga 5 alumnos con mayor nota:
        int cont = 0;
        /*
        int []arr1;
         for(int j = 0; j<lista.length;j++){
             cont = Alumno[i];
           if (Alumno.nota[j]>Alumno.nota){
               
           } 
        }
        */
        /*
         for(Alumno j : lista){
             while(cont <= 5){
                        if(lista.Consumer(Alumno -> Alumno.getNota()>Alumno.getNota()+1));{
                        }
                }
            }
         System.out.println(lista);
         
         //lista.forEach(lis -> System.out.println("Listado "+lis))
        
        
        
        
        Lambda intento = ()-> System.out.println("Hola Mundo");
        intento.mensaje();
        */
    }
    
}
