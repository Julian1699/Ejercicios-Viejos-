/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicer5;
import java.util.Scanner;

/**
 *
 * @author julia
 */
public class PracticeR5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int slmm = 1000;
        int comision = 150;
        double vvcarro = 0.05;
        
        
        //pedir los carros que vendio al mes 
        
        System.out.println("Programa para calcular el salario de un empleado");
        System.out.println();
        System.out.println("Digite el numero de Carros que vendio el empleado: ");
        int carros_vendidos = input.nextInt();
        System.out.println("Digite el valor del Carro Estatico: ");
        int valor_carro = input.nextInt();
        double salario_empleado = (slmm)+(comision*carros_vendidos + (valor_carro*vvcarro));
        System.out.println("Lo que se gana el empleado al mes es= "+salario_empleado);
    }   
    
}
