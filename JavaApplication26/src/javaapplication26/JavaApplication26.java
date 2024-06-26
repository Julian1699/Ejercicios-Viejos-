
package javaapplication26;

public class JavaApplication26 {


   
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a = new int[100];
        
        int suma = 0;
        double media = 0;
        
        for(int i=0; i<a.length; i++){
             a[i]=i+1;
             suma+=a[i];
             System.out.println(a[i]);
        }     
             
             System.out.println("La suma es: "+suma);
                          media=(double)suma/a.length;
             System.out.println("La media es: "+media);
    
    }
    
}
