
package javaapplication64;
import java.util.Scanner;
/**
 *
 * @author julia
 */
public class JavaApplication64 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // realice un algoritmo que permite calcular el valor total de una compra
        // Si la compra es mayor a 25000 pesos realice un descuento de 10%
        Scanner input = new Scanner(System.in);
        
        double x = 0;
        System.out.println("Introduzca el valor de la compra: ");
        double compra = input.nextInt();
        
        if (compra>=25000){
           x = compra - (compra*0.1); 
           };
        System.out.println("El valor total de la compra menos el descuento es: ");
        System.out.println(x);
    }
    
}
