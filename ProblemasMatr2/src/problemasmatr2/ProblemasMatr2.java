package problemasmatr2;

public class ProblemasMatr2 {

    public static void main(String[] args) {
        int matriz[][] = {{2,2,2},{2,2,2},{2,2,2}};
        int matriz2[][] = {{2,2,2},{2,2,2},{2,2,2}};
        for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            //System.out.print(matriz[i][j]);
            System.out.print(matriz[i][j]*matriz2[i][j]);
        }
        //System.out.print("\n"+matriz[i][j]+matriz[i][j]);    
        System.out.println("");  
        }
      
    }
    
}
