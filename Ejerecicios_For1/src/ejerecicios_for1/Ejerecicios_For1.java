package ejerecicios_for1;
import java.util.Scanner;
public class Ejerecicios_For1 {
    
    

    public static void main(String[] args) {
        
        
    //(1) Imprimir un listado con los numeros del 1 al 100 cada 
    //uno con su respectivo cuadrado.
        for (int i = 1, a = 1; i <= 100 && a <= 100; i++, a++){
    //       System.out.println(i + " " + Math.pow(a, 2));
        }
    //(2) Imprimir un listado con los numeros impares desde 1 hasta 999 y
    //seguidamente otro listado con los numeros pares desde 2 hasta 1000.
        for (int i = 1, a = 2; i<=999 && a <= 1000; i++, a++ ){
            if (i%2 != 0 && a%2==0){
    //          System.out.println(i + " " + a); 
            }
        }
    //(3) Imprimir los numeros pares en forma descendente hasta 2 que son
    //menores o iguales a un numero natural n ≥ 2 dado. 
        for (int a = 100; a >= 2; a--){
            if (a%2==0){
    //       System.out.println(a); 
            }
        }
    //(4) Imprimir los numeros de 1 hasta un numero natural n dado,
    // cada uno con su respectivo factorial.
        int factorial = 1;
        for (int f = 1; f <=5 ; f++ ){
             factorial = factorial * f;
    //        System.out.println(factorial);      
        }
    //(5) Calcular el valor de 2 elevado a la potencia n.
    //    Scanner input = new Scanner(System.in);
    //    double n = input.nextDouble();     
    //    System.out.println(Math.pow(2, n));
        
    //(6) Leer un numero natural n, leer otro dato de tipo real x
    // y calcular x^n     
    //    int natural = input.nextInt();
    //    float real = input.nextFloat();
    //    System.out.println(Math.pow(real, natural));
    
    //(7) Disene un programa que muestre las 
    // tablas de multiplicar del 1 al 9.
             System.out.println("LAS TABLAS DE MULTIPLICAR");
              System.out.println("Tabla del uno");
        for (int prc = 1, sdc = 1; prc<=9 && sdc <= 9; sdc++ ){
              System.out.println(prc + "*" + sdc + "=" + prc*sdc);}
              System.out.println("Tabla del dos");
        for (int prc = 2, sdc = 1; prc<=9 && sdc <= 9; sdc++ ){
              System.out.println(prc + "*" + sdc + "=" + prc*sdc);}
              System.out.println("Tabla del tres");
        for (int prc = 3, sdc = 1; prc<=9 && sdc <= 9; sdc++ ){
              System.out.println(prc + "*" + sdc + "=" + prc*sdc);}
              System.out.println("Tabla del cuatro");
        for (int prc = 4, sdc = 1; prc<=9 && sdc <= 9; sdc++ ){
              System.out.println(prc + "*" + sdc + "=" + prc*sdc);}
              System.out.println("Tabla del cinco");
        for (int prc = 5, sdc = 1; prc<=9 && sdc <= 9; sdc++ ){
              System.out.println(prc + "*" + sdc + "=" + prc*sdc);}
              System.out.println("Tabla del seis");
        for (int prc = 6, sdc = 1; prc<=9 && sdc <= 9; sdc++ ){
              System.out.println(prc + "*" + sdc + "=" + prc*sdc);}
              System.out.println("Tabla del siete");
        for (int prc = 7, sdc = 1; prc<=9 && sdc <= 9; sdc++ ){
              System.out.println(prc + "*" + sdc + "=" + prc*sdc);}
              System.out.println("Tabla del ocho");
        for (int prc = 8, sdc = 1; prc<=9 && sdc <= 9; sdc++ ){
              System.out.println(prc + "*" + sdc + "=" + prc*sdc);}
              System.out.println("Tabla del nueve");
        for (int prc = 9, sdc = 1; prc<=9 && sdc <= 9; sdc++ ){
              System.out.println(prc + "*" + sdc + "=" + prc*sdc);}
    
    }    

}
