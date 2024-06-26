package Numero1.pkg1;
// (1) Desarrollar un algoritmo que permita sumar dos matrices 
// de numeros reales (enteros).
public class PMat1 {

    
    
    public static int[][] cuadrados_matriz(int[][] X){
    int[][] Y = new int[X.length][X[0].length];
for(int i=0; i<X.length; i++){
for(int j=0; j<X[i].length; j++){
Y[i][j] = X[i][j]*X[i][j];
}
}
System.out.println(Y);
return Y;
        
}
    
    public static void main(String[] args) {
      
    }
    
}
