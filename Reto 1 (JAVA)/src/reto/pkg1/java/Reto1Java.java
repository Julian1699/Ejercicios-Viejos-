package reto.pkg1.java;
import java.util.Scanner;
public class Reto1Java {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.print("Ingrese la distancia a la casa de Goku: ");
        int x = input.nextInt();
        int y = (x * 2) + 4;
        int z = (x + y) / 5;
        
        System.out.println(x + " " + y + " " + z);
        
         if (z <= 20){ 
        System.out.println("uno");
         }
         else if (21 <= z && z <= 30){
         System.out.println("dos");
        }
         else if (31 <= z && z <= 50){
         System.out.println("tres");
        }
         else if (z > 50){
         System.out.println("cuatro");
         
    }
    }
}
