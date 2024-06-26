package ejerciciorarosophos;

import java.time.temporal.ValueRange;
import org.w3c.dom.ranges.Range;


public class EjercicioRaroSophos {
    
    public static void main(String[] args) {
        
        //Range<Integer> test = Range.between(1, 3);
        int[]arr = {1,2,7,14,21,28,32,35,42,49,56,63,70,87,66};
        int[]arr1 = new int [10];
        for(int i = 0; i<arr.length;i++){
            
            if(arr[i]%7==0){
                arr1[i]=arr[i];
                System.out.print(arr1[i]);
                System.out.println();
            }
        }
        
       
    int[] numbers = new int[50];
    
    for(int i = 0; i < numbers.length; i++) { 
        numbers[i] = i+1;              
    }

    
    for (int x : numbers){
        System.out.print(x + " ");
    }
    }
    
}
