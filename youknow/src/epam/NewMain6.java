/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package epam;
import java.util.Scanner;

/**import java.util.Scanner;
 *
 * @author julia
 */
public class NewMain6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);        
        int i;
        int[] numeros = new int[5];
        for ( i = 0; i < numeros.length; i++) {
            System.out.println("Introduzca numero: ");
            numeros[i] = teclado.nextInt();
        }
        for ( i = 4; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
    
}
