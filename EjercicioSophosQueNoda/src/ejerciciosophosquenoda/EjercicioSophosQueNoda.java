/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosophosquenoda;

/**
 *
 * @author julia
 */
public class EjercicioSophosQueNoda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
    int[] numbers = new int[50];
    
    for(int i = 0; i < numbers.length; i++) { 
        numbers[i] = i+1;
        if(numbers[i]%7==0){
            System.out.println(numbers[i]);
        }
    }

    
    }
    
}
