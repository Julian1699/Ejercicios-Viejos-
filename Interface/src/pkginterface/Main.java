/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkginterface;

/**
 *
 * @author julia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado(2);
        System.out.println("El Area del cuadrado: "+ cuadrado.Area() + " y El perimetro del cuadrado es: " + cuadrado.Perimetro());
        
    }

    
}
