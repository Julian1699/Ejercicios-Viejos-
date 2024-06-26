package problemasmatr4;

public class ProblemasMatr4 {

    public static void main(String[] args) {
        System.out.println("Suma de las columnas de una matriz");
        
        int suma=0;
        int matriz[][] = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<3;i++){
            //suma = 0;
        for(int j=0;j<3;j++){
            
            System.out.print(" "+matriz[i][j]);
            //suma += matriz[j][i];          
        }
      
        
        //System.out.print("\n"+matriz[i][j]+matriz[i][j]);  
        //System.out.print(" = "+ suma);
        System.out.println();  
        //System.out.println("____");
       /// System.out.print(suma);
        }
        for(int x=0; x<matriz.length;x++){
                System.out.print("---");
        }
         System.out.println();  
        for(int x=0;x<3;x++){
            suma = 0;
            
        for(int z=0;z<3;z++){   
            suma += matriz[z][x];
            //System.out.print(suma);
        }
        System.out.print(" "+suma);
        }
        System.out.println();        
    }
    
}
