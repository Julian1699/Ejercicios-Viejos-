package javaapplication35;
import java.util.ArrayList;
import java.util.Arrays;


public class JavaApplication35 {

    public static void main(String[] args) {
       
        ArrayList <Integer> vector = new ArrayList<>(Arrays.asList(1,6,0,7,-3,8,0,-2,11));
        ArrayList <Integer> vector2 = new ArrayList<>();
        for (int i=0; i<vector.size();i++) {
            if(vector.get(i)==0){
                vector2.add(vector.get(i));
                vector.remove(i);
            }
        }
        vector.addAll(vector2);
        System.out.println(vector);
        //System.out.println(vector2);
        //for (int i=0; i<vecor.size();i++){
        //}
    }
    
    
}
