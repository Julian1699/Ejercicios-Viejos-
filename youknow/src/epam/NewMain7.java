/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package epam;

import java.util.Scanner;

/**
 *
 * @author julia
 */
public class NewMain7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);        
        int i;
        int contadorCeros=0;
        int sumaPos = 0;
        int medianaPos = 0;
        int[]numeros = new int[5];
        
         for ( i = 0; i < numeros.length; i++) {
            System.out.println("Introduzca numero: ");
            numeros[i] = teclado.nextInt();
            if(numeros[i]==0){contadorCeros++;}
        }
         
         for ( i = 0; i < numeros.length; i++) {
             
             sumaPos += numeros[i];
             medianaPos = sumaPos/numeros.length;
            
        }
        System.out.println("ceros: "+contadorCeros);
        System.out.println("La mediana de los positivos del vector es: "+ medianaPos);        
    }
    
}
