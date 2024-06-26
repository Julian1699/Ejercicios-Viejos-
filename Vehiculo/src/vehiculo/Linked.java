/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo;
import java.util.LinkedList;
/**
 *
 * @author julia
 */
public class Linked {
    
    public static void main(String[] args) {

    // LinkedList de cadenas de caracteres
LinkedList <String> lista = new LinkedList<>();
// mecanismos para agregar elementos
    lista.add("A");
    lista.add("B");
    lista.addLast("C");
    lista.addFirst("D");
    lista.add(2, "E");
    System.out.println("Lista 1:" + lista);
// modificaci ́on de un elemento
    lista.set(1, "a");
    System.out.println(lista);
// impresi ́on utilizando ciclos
        for (int i = 0; i < lista.size(); i++)
    System.out.print(lista.get(i) + " ");
    System.out.println();
// mecanismos para eliminar elementos
    lista.remove("B");
    lista.remove(3);
    lista.removeFirst();
    lista.removeLast();
    System.out.println("Lista final: " + lista);
    }
}