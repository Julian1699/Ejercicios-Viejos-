package Numero2.pkg2;
//(2) Desarrollar un algoritmo que permita multiplicar dos matrices de
// n´umeros reales (enteros).
public class PMat2 {

    public static void main(String[] args) {
        int [][] Arr1 = {{1,2,3},{4,5,6},{7,8,9}};
        
        //recorra las filas
        for(int i= 0;i<Arr1.length;i++){
            for(int j=0;j<Arr1.length;j++){
                System.out.print(Arr1[i][j]);
            }
            System.out.println();
        }
    }
    
}
