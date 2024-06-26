package practicer8;

public class PracticeR8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       devolver_distintos();
    }
    public static void devolver_distintos(){
        int suma = 0;
        int []x ={7,6,8};
        for(int i = 0; i<x.length;i++){
            suma = suma + x[i];
        };
        //System.out.println(suma);
        if(suma > 15){
            System.out.println(x[2]);
        }
        else if(suma < 10){
            System.out.println(x[0]);
        }
        else if(suma >= 10 && suma <= 15){
            System.out.println(x[1]);
        }
        
        
    }
    
}
