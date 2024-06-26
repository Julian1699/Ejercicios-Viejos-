/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package epam;

/**
 *
 * @author julia
 */
public class NewMain2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int x=0;
        /*
        for (int i = 0; i <= 999; i++) {
            if(i%2 != 0){System.out.println("Impares: " + i);}
        }
        for (int i = 0; i <= 1000; i++) {
            if(i%2 == 0){System.out.println("Pares: " + i);}
        }
        */
        /*
        for (int i = 100; i >= 2; i--) {
            if(i%2==0){
            System.out.println("desc: "+i);
            }
        }*/
    
    
        int[]x= {1,2,3,4,5};
        int suma = 0;
        double promedio = 0;
        for (int i = 0; i<x.length; i++) {
            suma += x[i];
            promedio = suma/x.length;
        }
    
        System.out.println("El prmedio de un arreglo: " + promedio);
        System.out.println("Suma: "+ suma);
        
    }
    
}
