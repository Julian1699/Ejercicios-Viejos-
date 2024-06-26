/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package epam;

/**
 *
 * @author julia
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("El volumen del solido es: " +
               area_circulo(5)+area_cubo(10, 5)
                );
    }
    
    public static double area_circulo (double r1){
        return r1*r1*Math.PI;
    }
        public static double area_cubo (double b,double r2){
        return Math.PI * r2 * (r2+b);
    }
}
