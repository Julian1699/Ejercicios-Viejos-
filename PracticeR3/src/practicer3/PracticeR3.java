package practicer3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;


public class PracticeR3 {
     static Set<Integer> lista_numeros = new HashSet<Integer>();
  
    public static void main(String[] args) {
    reducir_lista();
    promedio(lista_numeros);     
    }
    public static  void reducir_lista(){ 
        lista_numeros.add(1);
        lista_numeros.add(2);
        lista_numeros.add(15);
        lista_numeros.add(7);
        lista_numeros.add(2);
        
        lista_numeros.remove(15);        
        System.out.println(lista_numeros);
       
       
    }   
        public static void promedio(Set<Integer>nums){
        double suma=0,contador=0;
        double media;
        Iterator<Integer> iteradorDatos = nums.iterator();

        while(iteradorDatos.hasNext()){
           suma += (Integer)iteradorDatos.next();
          contador++;

        }   
        media = suma/(contador);
   
        System.out.println("La media de los números introduccidos es de: "+media);

    }
}

