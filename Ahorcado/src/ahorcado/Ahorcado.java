package ahorcado;

import static java.lang.Math.random;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ahorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //def_ganar();
        select_aleat();
    }
  
    public static int select_aleat(){
        Scanner input = new Scanner(System.in);
        int palabra_aleat;
        Random aleat = new Random();
        ArrayList <String> list = new ArrayList<String>();
        list.add("darius");
        list.add("garen");
        list.add("jax");
        list.add("nasus");
        list.add("gnar");
        list.add("mundo");
        palabra_aleat = (int)(Math.random()*6);
        String palabraAleatoria = list.get(palabra_aleat);
        System.out.println(palabraAleatoria);
        
        char letras[] = palabraAleatoria.toCharArray();
        char con_guion[]=new char [letras.length];
        for(int i=0; i<letras.length;i++){
            con_guion[i]='-';        
        }
        System.out.println(con_guion);
        
        
       
       // String []letrs = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z"};
       //for(int i = 0; i<letrs.length;i++){
       //if(caracter == letrs){
       //se_acepta=true;
       //};
     
       
       
            boolean se_acepta = false;
            boolean se_acepta2 = false;
            boolean se_acepta3 = false;
            boolean se_acepta4 = false;
            boolean finalizado = false;
            int vidas = 6;
      
         while(finalizado==false){
         System.out.println("Ingrese el caracter que desea: ");
         char caracter = input.nextLine().charAt(0);
           for(int i=0; i<letras.length;i++){
             if(letras[i]==caracter){
                   se_acepta=true;
                   con_guion[i]=caracter;
                   
                }
             
            }
           if(Arrays.equals(letras,con_guion)){
               finalizado = true;
           }
             System.out.println(con_guion);
           
        }
         System.out.println("Finalizo juego");
       /*
         System.out.println("Ingrese el siguiente caracter que desea: ");
         char caracter2 = input.nextLine().charAt(0);
         for(int i=0;i<con_guion.length;i++){
            if(letras[i]==caracter2){
                se_acepta2=true;
                con_guion[i]=caracter2;
                
            }
         }
         
         System.out.println("Ingrese el siguiente caracter que desea: ");
         char caracter3 = input.nextLine().charAt(0);
         for(int i=0;i<con_guion.length;i++){
            if(letras[i]==caracter3){
                se_acepta3=true;
                con_guion[i]=caracter3;
                
            }
         }
         
         System.out.println("Ingrese el siguiente caracter que desea: ");
         char caracter4 = input.nextLine().charAt(0);
         for(int i=0;i<con_guion.length;i++){
            if(letras[i]==caracter4){
                se_acepta4=true;
                con_guion[i]=caracter4;
                
            }
         }
       

        //System.out.println(caracter);*/
        System.out.println(con_guion);
       
        return palabra_aleat;
        
 
       
    }
    
   
}
