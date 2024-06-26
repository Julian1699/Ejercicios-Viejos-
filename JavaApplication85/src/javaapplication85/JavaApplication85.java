package javaapplication85;

public class JavaApplication85 {

    public static void main(String[] args) {
        //System.out.println(a+b);
        int a = 5;
        int b = 5;
        suma(a,b);
        resta(a,b);
        System.out.println(suma(a,b));
        System.out.println(resta(a,b));
   int x = 1; while (x <= 10) System.out.println(++x);
   int i = 7; 
   char c = 'w'; 
   System.out.println((i >= 6) && (c == 'w'));
    }
    public static int suma(int a, int b){
        return a+b;
    }
    public static int resta(int a, int b){
        return a-b;
    }
}

