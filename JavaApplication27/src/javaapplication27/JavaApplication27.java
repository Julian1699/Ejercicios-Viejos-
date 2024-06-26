package javaapplication27;
import java.util.Scanner;
public class JavaApplication27 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a[] = new int[5];
        int b[] = new int [5];
        int c[] = new int [10];   
        
        System.out.println("Digite el primer arreglo: ");
        for(int i = 0; i < 5; i++){
            System.out.print((i+i)+". Digite un número");
            a[i] = input.nextInt();
        }
        System.out.println("\nDigite el segundoarreglo: ");
        for(int i = 0; i < 5; i++){
            System.out.print((i+i)+". Digite un número");
            b[i] = input.nextInt();
        }
        int j=0;
        for(int i = 0; i<5;i++){
            c[j] = a[i];
            j++;
            c[j] = b[i];
            j++;
        }
        System.out.println("\nEl tercer arreglo es: ");
        for(int i = 0; i < 10; i++){
            System.out.print(c[i]+" ");
        }
        System.out.println();
    }
}
    
    

