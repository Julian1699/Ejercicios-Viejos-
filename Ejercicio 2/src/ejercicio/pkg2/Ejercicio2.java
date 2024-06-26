package ejercicio.pkg2;
import java.util.Scanner;
public class Ejercicio2 {

   public static int carne (int N, int M, int K){
       return N+M+K;
   }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el peso de N");
        int N = input.nextInt();
        System.out.println("Ingrese el peso de M");
        int M = input.nextInt();
        System.out.println("Ingrese el peso de K");
        int K = input.nextInt();
        System.out.println("El valor total de la carne es "+carne(N,M,K));
    }
    
}
