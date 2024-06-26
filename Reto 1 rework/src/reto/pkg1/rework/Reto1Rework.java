package reto.pkg1.rework;
import java.util.Scanner;

public class Reto1Rework {

    public static void main(String[] args) {
        System.out.println("Ingrese la distancia a la casa de Goku");
        Scanner nuevo = new Scanner(System.in);
       
        int x = nuevo.nextInt();
        int y = (2*x)+4;
        int z = (x+y)/5;
        
        System.out.println();
        
    }
    
}
