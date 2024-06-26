package reto.pkg3.java;
import java.util.ArrayList;         

public class Reto3JAVA {
    
    public static ArrayList<Integer> clases(ArrayList<Integer> entrada){
        ArrayList<Integer> salida = new ArrayList<>();
        for(Integer i : entrada){
            if (!salida.contains(i)){
                salida.add(i);
            }
        }return salida;
    } 
     
public static ArrayList<Integer> meFaltanDeLaClase(ArrayList<Integer> obrasFalta, 
                                                   ArrayList<Integer>listaCategorias, int categoria){
    ArrayList<Integer> salida = new ArrayList<>();
    ArrayList<Integer> nueva = new ArrayList<>();
    for (int i=0; i<listaCategorias.size();i++){
         if (categoria == listaCategorias.get(i)){
             nueva.add(i);
         }
    }
    for (Integer i:obrasFalta){
        if (nueva.contains(i)){
            salida.add(i);
        }
    }
    return salida;    
 }

public static ArrayList<Integer> noTengo(ArrayList<Integer> obrasA, ArrayList<Integer> obrasB){
    ArrayList<Integer> salida = new ArrayList<>();
    for (Integer i:obrasA){
        if (!obrasB.contains(i)){
            salida.add(i);
        }
    }
    return salida;
}

public static Integer puedoCambiar(ArrayList<Integer> duplicadoA, ArrayList<Integer> duplicadoB){
    int contador = 0;
    if (duplicadoA.size() > duplicadoB.size()){
        for (Integer i : duplicadoB){
            if(!duplicadoA.contains(i)){
                contador++;
            }
        }
    }else {
         for (Integer i : duplicadoA){
            if(!duplicadoB.contains(i)){
                contador++;
            }
        }
         
    }return contador;
}

}

    
         
