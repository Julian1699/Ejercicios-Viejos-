package javaapplication33;

//(2) Desarrollar un algoritmo que calcule el producto punto de dos arreglos
//de n´umeros enteros (reales) de igual tama˜no. Sean
//v = [v0, v1, . . . , vn−1] y w = [w0,w1, . . . ,wn−1] dos arreglos, el
//producto de v y w (notado v · w) es el n´umero:
//v0 ∗ w0 + v1 ∗ w1 + · · · + vn−1 ∗ wn−1.

public class JavaApplication33 {

  
    public static void main(String[] args) {
        int producto = 0;
        int sumaPr = 0;
        int []v = new int[]{1,2,3,4,5};
        int []w = new int[]{6,7,8,9,10};
        // 6+14+24+36+50 = 130
        for (int i=0, j=0; i<v.length && j<w.length; i++, j++){
             producto = v[i]*w[j];
             sumaPr += producto;
        //System.out.print("["+producto+"]");
        }
        System.out.println(sumaPr);
        System.out.println();
    }
    
}
