package academia.java;

import java.util.Scanner;

public class AcademiaJAVA {

    public static void main(String[] args) {
        /*
        System.out.println("Escrbie tu nombre Jill: ");
        Scanner scan = new Scanner(System.in);
        var usuario = scan.nextLine();
        
        System.out.println("Usuario= " + usuario);
        
        System.out.println("Escrbie tu titulo Jill: ");
        var titulo = scan.nextLine();
        System.out.println("Resultado: " + titulo + " " + usuario);
        
        
        int [] arr = new int[]{1,2,3,4,5};
        
        int n = arr.length;
        
        int k = 6;
        /*
        int[] result = miMetodo(n, k, arr);
        
        for (int i = 0; i < result.length; i++) {
            int j = result[i];
            System.out.println(result[i]);
        }
        /*
        public static int[] miMetodo(int n, int k, int[] arr){
            
            
            return null;
        }
        */
        
        int[] arr01 = new int[]{1,2,3,4,5};
        int[] arr02 = new int[]{1,2,3,4,5};
        
        int resultado = 0;
        
        for(int i = 0; i < arr01.length; i++){
            resultado += arr01[i] * arr02[i];
        }
        System.out.println("Resultado: " + resultado);


        
        
    }

}
