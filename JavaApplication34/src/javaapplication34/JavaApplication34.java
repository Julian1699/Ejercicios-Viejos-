package javaapplication34;
import java.util.Arrays;

public class JavaApplication34 {

   
    public static void main(String[] args) {
        double []ArrM = {3,4,2,1,5};
        //int ArrOrd=0;
        Arrays.sort(ArrM);
        //{1,2,3,4,5}
        //int mitad= ArrM.length/2;
        double mediana = 0;
        double medianaGeneral = 0;
        
        for(int i = 0; i<ArrM.length; i++){
            medianaGeneral = ArrM[i]/2;
            //(1/2,2/2,3/2,4/2,5/2)
            //3  
           mediana = ArrM[2];
           //mediana = ArrM.length/2;
            
             System.out.print("["+medianaGeneral+"]");
            
        }
        System.out.println("\n"+"["+mediana+"]");
        //System.out.println(mediana);   
         //System.out.println(mitad); 
            
       // System.out.println(mitad+"\n");
       
        
        //System.out.println(mitad);
        
    }
       // System.out.println(mitad);
    
}
