package javaapplication31;

//Desarrollar un algoritmo que calcule el producto directo de dos
//arreglos de n´umeros reales de igual tama˜no. Sean
//v = [v0, v1, . . . , vn−1] y w = [w0,w1, . . . ,wn−1] dos arreglos, el
//producto directo de v y w (notado v ∗ w) es el vector:
//[v0 ∗ w0, v1 ∗ w1, . . . , vn−1 ∗ wn−1].

public class JavaApplication31 {
    
    public static void main(String[] args) {

        int producto = 0;
        int []v = new int[]{1,2,3,4,5};
        int []w = new int[]{1,2,3,4,5};
        for(int i=0,j=0; i<v.length && j<w.length;i++,j++){
            producto = v[i]*w[j];
            System.out.print("["+producto+"]");
            // [1] [4] [9] [16] [25]
        }  
        System.out.println("\n"+"["+producto+"]");
        // [25]
        System.out.println();   
    }
}
