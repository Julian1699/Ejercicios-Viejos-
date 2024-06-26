package ejersophos;
import java.util.Scanner;

public class Ejersophos {

    public static void main(String[] args) {
        
      Scanner input = new Scanner(System.in);
      int x[] = new int[3];
      System.out.println("Introduzca los numeros papi: ");
      for(int i = 0; i<x.length;i++){
         
          x[i] = input.nextInt();
           if (x[1]>x[2]){
            System.out.println("Los numeros estan en orden creciente.");
           }
           else if(x[1]!=x[2]){
                System.out.println("Estan en desorden todos.");
           }
           else if(x[1] < x[2]){
                System.out.println("Los numeros estan en orden decreciente");
            }
        }   
    }
}
