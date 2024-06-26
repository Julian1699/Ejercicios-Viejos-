package tallersophos;
import java.util.Scanner;

public class TallerSophos {

   
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        //1) Algoritmo que determine si es par o impar
        
        System.out.println("Algoritmo para determinar si un numero ingresado por teclado es o no par");
        System.out.println("Escriba el numero aqui: ");
        int entrd = input.nextInt();
        
        if(entrd%2==0){
            System.out.println("Es par");
        }else{ 
            System.out.println("Es impar");
         };
       
        System.out.println("");
        
        //2) Resolver las siguientes expresiones
            // a)	56 * 2 / 4 = 7
            // b)	3 + 5 * (10 - (2 + 4)) = 23
            // c)	400 – 6 * 5 * (4 + 6) = 100
            // d)	3.5 + 5.0 - 20 / 40 = -2
            
        System.out.println("Respuestas correctas de las siguientes expresiones: ");
            
        double a = 56 * 2 / 4;
        double b = 3 + 5 * (10 - (2 + 4));
        double c = 400 - 6 * 5 * (4+6);
        double d = 3.5 + 5.0 -20/40;
        
        System.out.println("Resultado de la operación a = 56 * 2 / 4 = " + a);
        System.out.println("Resultado de la operación b = 3 + 5 * (10 - (2 + 4)) = " + b);
        System.out.println("Resultado de la operación c = 400 - 6 * 5 * (4+6) = " + c);
        System.out.println("Resultaod de la operación d = 3.5 + 5.0 - 20 / 40 = " + d);
        
        System.out.println("");
        //3)Construir un algoritmo que permita leer dos números 
        //distintos para determinar cuál de los 2 números es el mayor o si son iguales. 
        //Se debe mostrar un mensaje en pantalla con el resultado de la comparación.
        
        System.out.println("Algoritmo de comparación");
        System.out.println("Digite el primer numero a comparar: ");
        int num1 = input.nextInt();
        System.out.println("Digite el segundo numero a comparar: ");
        int num2 = input.nextInt();
        
        if(num1>num2){
            System.out.println("El numero 1: "+num1+" es mayor al numero 2: "+num2);
        }else if(num2>num1){System.out.println("El numero 2: "+num2+ " es mayor al numero 1: "+num1);}
        else if(num1==num2){System.out.println("Los dos numeros escritos son iguales");}
       
        // 4)Elabore un algoritmo que permita leer 20 números enteros
        // y determine cuántos de ellos son positivos, cuántos son negativos
        // y la sumatoria de los positivos ; al final se debe mostrar en pantalla 
        // un mensaje con cada uno de los resultados.
        
        int[]arr = new int [20];
        int contP = 0;
        int contN = 0;
        for(int i = 0;i<arr.length;i++ ){
            System.out.println("Introduzca los numeros del arreglo: ");
            arr[i] = input.nextInt();
            if (arr[i]>0){
                contP += arr[i];
            } else if(arr[i]<0){ 
                contN += arr[i];
            };
        }
        System.out.println("Esta es la suma de los positivos del arreglo: "+contP);
        System.out.println("Esta es la suma de los negativos del arreglo: "+contN);
        System.out.println();
         
        //5)Realice un algoritmo que permita conocer dentro de un grupo de 50 números cuales 
        //son los 5 primeros múltiplos de 7. 
        //Los números que sean múltiplos de 7 se deben 
        //imprimir en pantalla y cuando se conozca el séptimo número múltiplo,
        //el programa debe finalizar.
        
        int[] numbers = new int[50];
    
        for(int i = 0; i < numbers.length; i++) { 
        numbers[i] = i+1;
        if(numbers[i]%7==0){
            System.out.println(numbers[i]);
            }
        }     
    } 
}
