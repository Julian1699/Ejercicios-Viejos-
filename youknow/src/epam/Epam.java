
package epam;

import java.util.Scanner;

public class Epam {

    public static void main(String[] args) {
        
        System.out.println("El area del rectangulo 1 es: "+ area_rectangulo(5, 6));
        
        Scanner sc = new Scanner (System.in);
        System.out.print("Ingrese el lado: ");
        int l = sc.nextInt();
        System.out.print("Ingrese el ancho: ");
        int a = sc.nextInt();
        System.out.println("El area del rectangulo 2 es: " + area_rectangulo(l, a));

           
    }
    public static double area_rectangulo (double l, double a){
    
        return l*a;
    }
    
}
