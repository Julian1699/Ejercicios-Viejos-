package javaapplication32;

//(1) Desarrollar un algoritmo que calcule el promedio de un arreglo de
//reales

public class JavaApplication32 {
    
    public static void main(String[] args) {
       
        double suma = 0;
        double promedio = 0;
        double[]arrR = new double[]{1,2,3,4,5};
        for(int i = 0; i<arrR.length;i++){
           suma += arrR[i]; 
          //promedio = (suma/arrR.length);
        }
        //promedio = (suma/arrR.length);
        System.out.println(promedio);
        //System.out.println(suma);
    }
        
}
    

