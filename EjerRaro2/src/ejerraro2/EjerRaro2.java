/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerraro2;

import java.util.Scanner;

/**
 *
 * @author julia
 */
public class EjerRaro2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] lista = new int [5];
       int sumP,sumN,contP,contN,promP,promN;
       sumN=0;
       sumP=0;
       promN=0;
       promP=0;
       contP=0;
       contN=0;
       System.out.println("Digite los numeros del arreglo: ");
       Scanner input = new Scanner(System.in);
       for(int i =0; i<lista.length;i++){
           lista[i]=input.nextInt();
       if(lista[i]>0){
           sumP += lista[i];
           contP++;
           //promP=sumP/contP;
       }
       else if(lista[i]<0){
           sumN += lista[i];
           contN++;
           //promN=sumN/contN;
           
        }
       }
       promN=sumN/contN;
       promP=sumP/contP;
        System.out.println("Promedio positivos: "+promP);
        System.out.println("Promedio negativos: "+promN);
    }
    
}
