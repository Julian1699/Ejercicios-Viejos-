package problemasmatr3;

public class ProblemasMatr3 {

    public static void main(String[] args) {
        System.out.println("Suma de las filas de una matriz");
        int suma=0;
        int matriz[][] = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<3;i++){
            suma = 0;
        for(int j=0;j<3;j++){
            System.out.print(matriz[i][j]);        
            suma += matriz[i][j];
        }
        //System.out.print("\n"+matriz[i][j]+matriz[i][j]);  
        System.out.print(" = "+ suma);
        System.out.println("");  
        }
        
        
    }
    
}
