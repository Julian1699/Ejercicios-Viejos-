
package crec.decrec;

import java.util.Scanner;


public class CrecDecrec {

 
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
		int arregloA [] = new int [5];
		boolean creciente =false, decreciente=false;

		
		for(int i=0; i<5; i++) {
			System.out.print("Ingresa los numeros para el arreglo: " );
			arregloA[i] = entrada.nextInt();
		}
		
		
			for (int i =0; i<4; i++) {
			
				if (arregloA[i] < arregloA[i+1] ) {
					creciente = true;
				}
				
				 if (arregloA[i] > arregloA[i+1] ) {
					decreciente = true;
				}
			}
			
			if (creciente == true && decreciente == false) {
					System.out.println("Creciente");
			}
			
			else if (creciente == false && decreciente == true) {
					System.out.println("Decreciente");
			}
			else if (creciente == false && decreciente == false) {
				System.out.println("Todos los numeros son iguales");
			}
			else {
					System.out.println("Desordenado");
			}    }
    
}
