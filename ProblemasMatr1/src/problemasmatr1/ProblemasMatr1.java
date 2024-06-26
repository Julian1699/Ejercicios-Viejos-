package problemasmatr1;

public class ProblemasMatr1 {

    public static void main(String[] args) {
        int matriz[][] = {{1,1,1},{1,1,1},{1,1,1}};
        int matriz2[][] = {{2,2,2},{2,2,2},{2,2,2}};
        for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            //System.out.print(matriz[i][j]);
            System.out.print(matriz[i][j]+matriz2[i][j]);
        }
        //System.out.print("\n"+matriz[i][j]+matriz[i][j]);    
        System.out.println("");
            
        }
        
    }
    
}
