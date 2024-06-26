package practicer7;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PracticeR7 {

    public static void main(String[] args) {
        
      clases();  
    }
    public static Set clases (){
    Set <Integer> lista = new HashSet<Integer>();
    lista.add(1);
    lista.add(2);
    lista.add(5);
    lista.add(5);
    lista.add(5);
    lista.add(1);
    lista.add(2);
    lista.add(5);
    lista.add(5);
    lista.add(5);
    for( Integer i : lista){
        System.out.print(i);
    };
        return lista; 
    }
}
