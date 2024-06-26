/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package epam;

/**
 *
 * @author julia
 */
public class NewMain3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[]x = {1,2,3};
        int[]y = {2,3,4};
        double pos1 = 0; 
        double pos2 = 0; 
        double pos3 = 0; 
        double pos4 = 0;
       //144  2+6+12
       

        for (int i = 0; i < x.length; i++) {
        //for (int j = 1; j < y.length; j++) {
            pos1 += x[i]*y[i];
        //    pos4 *= x[i]+y[j];
        //    pos2 = x[j]*y[i];
         //   pos3 = x[j]+y[i];
        //}
        }
        
              
        System.out.println("El producto punto es: " + pos1);
        System.out.println("El producto punto es: " + pos4);
        System.out.println("El producto punto es: " + pos2);
        System.out.println("El producto punto es: " + pos3);
        /*
        int[] x = {1, 2, 3};
        int[] y = {2, 3, 4};
        double productoPunto = 0; // Sólo necesitamos una variable para el resultado

        for (int i = 0; i < x.length; i++) { // Debe comenzar en 0 y no en 1
            productoPunto += x[i] * y[i];
        }
         System.out.println("El producto punto es: " + productoPunto);
         */
    }
    
}
