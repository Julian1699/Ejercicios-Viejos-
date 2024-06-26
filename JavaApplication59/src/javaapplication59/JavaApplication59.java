
package javaapplication59;
import java.util.Scanner;

public class JavaApplication59 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean repetido = false;
        int anterior = -1;
        
        int[]numeros = new int[4];
        for(int i = 0; i<numeros.length;i++){
            System.out.println("Introduzca los numeros del arreglo: ");
            numeros[i] = input.nextInt();
        }
        
        for (Integer i : numeros){
            if (i==0 && anterior == 0){
                repetido = true;
            }
            anterior = i;
        }
        System.out.println(repetido);
        System.out.println();
    }
   /* public static void def(){
        Scanner input = new Scanner(System.in);
        
        int[]numeros = new int[8];
        for(int i = 0; i<numeros.length;i++){
            System.out.println("Introduzca los numeros del arreglo");
            numeros[i] = input.nextInt();
        }
        for (int i = 0; i<numeros.length;i++){
            System.out.println(numeros[i]);
        }
    }
   */
}
