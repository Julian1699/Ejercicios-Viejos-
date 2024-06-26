/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaia;

import java.util.ArrayList;
import java.util.Scanner;

public class PruebaIA {

    public static void main(String[] args) {
        
       ConvierteANumeroReal();
      
    }
    
    static double ConvierteANumeroReal(){
        String Numero = "";
        System.out.println("Escriba el numero que desea convertir a double: ");
        Scanner input = new Scanner(System.in);
        double retorna = 0;
        Numero = input.nextLine();
        retorna = Double.parseDouble(Numero);
        //double j = retorna + 3;
        System.out.println(retorna);
        /* Aquí estará su código que NO usará ninguna API de C# ni de .NET para la conversión, debe hacer uso de operaciones de cadena, todo el tiempo */
        
        return retorna;
    }

    
}
