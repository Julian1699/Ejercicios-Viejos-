/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiculo;
import java.util.ArrayList;
import java.util.LinkedList;
/**
 *
 * @author julia
 */
public class Vehiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ArrayList <String> Carro = new ArrayList<String>();
       // Carro.add("Chevrolet");
        //Carro.add("BMW");
        //Carro.add("Mercedes");
       // Carro.remove("Mercedes");
        //System.out.print(Carro);
        
        
        
ArrayList<Integer> lista = new ArrayList<Integer>();
// Agregando elementos
for (int i = 1; i <= 10; i++) lista.add(i);
// Imprimiendo elementos
System.out.println(lista);    
// Quitando el elemento en la posici ́on 3
lista.remove(3);
// Imprimiendo el arreglo
System.out.println(lista);
for (int i = 0; i < lista.size(); i++)
System.out.print(lista.get(i) + " ");
System.out.println();
// Usando el iterador de la lista
for( Integer n:lista ) System.out.print(n + " ");
    }
    
}
