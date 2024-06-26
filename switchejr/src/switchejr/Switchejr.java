/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchejr;

import java.util.Scanner;

/**
 *
 * @author julia
 */
public class Switchejr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       /* int a = 20;
        int b = 0;
        while(b!=20){ 
            b = b+1;
            System.out.println(b);
        }
        
       int c = 0;
       do{
           c = c+1;
           System.out.println(c);
       }
       while(c!=10);
        System.out.println(c);
        
        
        for (int i=0;i<=10;i++){
            System.out.println(5+" * "+ i + " = "+ 5*i);
        }
        
       ------------------------------------------------------------------------   
       */ 
       
       
       
       
       /*
       //1) While
       
       int limit = 0;
       int iteracion = 0;
       int suma = 0;
       System.out.println("Ingrese el límite numerico de la suma: ");
       limit = input.nextInt();
       while(iteracion != limit){
           iteracion = iteracion + 1;
           suma += iteracion;
       }
       System.out.println("La suma de los numeros antes de llegar al límite es: "+suma);
       
       //2) Do - While 
       
       int limite = 0;
       int itrcn = 0;
       int sum = 0;
       System.out.println("Ingrese el límite numerico de la suma: ");
       limite = input.nextInt();
       do{
           itrcn = itrcn + 1;
           sum += itrcn;
       }
       while(itrcn != limite);
       System.out.println("La suma de los numeros antes de llegar al límite es: "+sum);
       
       //3) For
       
       int limita = 0;
       int itn = 0;
       int summ = 0;
       System.out.println("Ingrese el límite numerico de la suma:  ");
       limita = input.nextInt();
       for(int i = 0; i<limita; i++){
           itn = itn + 1;
           summ += itn;
       };
       System.out.println("La suma de los numeros antes de llegar al límite es: "+summ);
 */ 
       
       //2) Realice un programa que verifique si un número ingresado por el usuario es primo.
       
       int numero = 0;
       System.out.println("Ingrese el numero pa ver si es primo o no: ");
       numero = input.nextInt();
       //for(int i = numero; i<numero;i++){
       //if(numero%numero != 0 && numero%1 != 0){
       //  System.out.println("El numero ingresado "+numero+" es primo");
       //}
       //   System.out.println("El numero " + numero + " es primo.");
          
       //}//else{System.out.println("El numero " + numero + " no es primo");}
       //System.out.println("El numero " + numero + " es primo.");
       //else if(numero%numero == 0){System.out.println("El numero " + numero + " no es primo.");}
       //}
       //System.out.println("El numero " + numero + " es primo.");
       //while(numero/numero == 1 && numero/1 == numero){
           //System.out.println("El numero ingresado"+numero+" es primo");
       //} 
       //System.out.println("El numero ingresado"+numero+" es primo");
       int contD=0;
       for(int i = 1;i<=numero;i++){        
           if(numero%i == 0){
                contD++;            
            }
       }
       if (contD==2){
           System.out.println("Es primo");
       }else {System.out.println("No es primo");}
       /*
       while(numero/numero > 0 && numero/1 > 0){
          System.out.println("El numero ingresado "+numero+" es primo");
           break;
       } 
       
       */
    }
}
