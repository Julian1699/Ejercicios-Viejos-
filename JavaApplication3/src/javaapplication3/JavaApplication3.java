/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import java.util.Scanner;
public class JavaApplication3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double reto1, reto2, reto3, reto4, reto5, ingles, habilidades, acumulado = 0,
                promedioGlobal;
        
        System.out.print("Numero de Estudiantes: ");
        int numeroDeEstudiantes = scan.nextInt();
        
        int i;
        for (i =1; i <= numeroDeEstudiantes; i++){
        System.out.print("Nota Reto 1: ");
        reto1 = scan.nextDouble();
        System.out.print("Nota Reto 2: ");
        reto2 = scan.nextDouble();
        System.out.print("Nota Reto 3: ");
        reto3 = scan.nextDouble();
        System.out.print("Nota Reto 4: ");
        reto4 = scan.nextDouble();
        System.out.print("Nota Reto 5: ");
        reto5 = scan.nextDouble();
        System.out.print("Nota Ingles: ");
        ingles = scan.nextDouble();
        System.out.print("Nota Habilidades: ");
        habilidades = scan.nextDouble();
        
        double notaFinal = ((reto1 * 0.1) + (reto2 * 0.1) + (reto3 * 0.2) + 
                (reto4 * 0.2) + (reto5 * 0.2) + (ingles * 0.1) + (habilidades * 0.1));
        System.out.print("Nota final del estudiante" + i + ": " + notaFinal);
        System.out.println();
        System.out.println();
        acumulado += notaFinal;
        }
        
        
        promedioGlobal = acumulado / numeroDeEstudiantes;
        
        if(numeroDeEstudiantes == 1){
         System.out.println();
        } else {
        System.out.println();}
        System.out.println("El promedio de los estudiantes: "+ promedioGlobal);
    }
    
}
