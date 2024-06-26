/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication29;

/**
 *
 * @author julia
 */
public class JavaApplication29 {


    public static void main(String[] args) {
    /*
        int [] x = new int []{1,1,1,1,1};
        int h = 0;
        for (int i = 0; i<x.length; i++){
             h += x[i];
        }
        System.out.println(h);
        */
    int mez1 = 0;
    int mez2 = 0;
    int mez3 = 0;
    
    int v[] = new int[]{1,2,3};
    int w[] = new int[]{2,3,4};
    for (int i=0, j=0; i<v.length && j<w.length; i++, j++){
        mez1 += v[i];
        //System.out.println(mez1);
    }
    for (int j=0; j<w.length; j++){
        mez2 += w[j];
        //mez2 = w[j]+1; 
    }
        mez3 = (mez1+mez2);
        System.out.println(mez3);
    //System.out.println(mez1);
    //System.out.print(mez1*mez2);
    //System.out.println();
}
    
}
