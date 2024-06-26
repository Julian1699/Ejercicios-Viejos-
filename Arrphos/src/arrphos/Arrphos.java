package arrphos;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Arrphos {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
/*
        //1)Escribe un programa que realice lo siguiente: declarar una variable E de tipo int, una variable
        //D de tipo double y una variable C de tipo char y asigna a cada una un valor.			
	int E = 1;
	double D = 1.1;
	char C = 'J';
        
        //2)Mostrar el promedio de 6 notas de un alumno y que se ordene de Mayor a menor.
        Integer [] notas = {3,2,6,4,7,8};
        Arrays.sort(notas, Collections.reverseOrder());
        int sumatoria = 0;
        double promedio = 0;    
        
        for(int i = 0; i<notas.length;i++){
           sumatoria += notas[i];
        }
        promedio = sumatoria/notas.length;
        System.out.println("Este es el promedio de las 6 notas de un alumno: "+promedio);
        System.out.print("Estas son las notas del alumno ordenadas de mayor a menor: ");
        for(int i : notas){
            System.out.print(i);
        }
        System.out.println();

 */       
        //3)Escribe un Programa Java que lea por teclado 10 números enteros y los guarde en un Array.
        //A continuación, calcula y muestra por separado la media de los valores positivos y la de los
        //valores negativos			
	double[]arrayL = new double [5];
        double sumP = 0;
        double divisorP = 0;
        double promP = 0;
        double sumN = 0;
        double divisorN = 0;
        double promN = 0;
        double numNeg=0;
      
        System.out.println("Introduzca los numeros del arreglo: ");
        for(int i = 0;i<arrayL.length;i++ ){
            arrayL[i] = input.nextInt();
        if(arrayL[i]>0){
            sumP += arrayL[i];
            divisorP = 1 + i;
            //promP = sumP/divisorP;                    
        }
        else if(arrayL[i]<0){
            sumN += arrayL[i];
            numNeg++;
        }
	}; 
        promP = sumP/divisorP;
        promN = sumN/numNeg;
        
        System.out.println("La suma de los positivos es: "+sumP);
        System.out.println("El promedio de los positivos es: "+promP);
        System.out.println("La suma de los negativos es: "+sumN);
        System.out.println("El promedio de los negativos es: "+promN);

 /*       
        //4) Crea un Array de números con 100 posiciones, que contendrá los números del 1 al 100.
        //Obtén la suma de todos ellos y la media.
        double[] nums = new double[100];
        double sum = 0;
        double prom = 0;
               
        for(int i = 0; i < nums.length; i++) {
        nums[i] = i+1;
            //System.out.println(i);        
        }
        
        for(int i = 0; i<nums.length;i++){
           sum += nums[i];
        }
        prom = sum/nums.length;
        System.out.println(sum);
        System.out.println(prom);

 */       

    }
}
