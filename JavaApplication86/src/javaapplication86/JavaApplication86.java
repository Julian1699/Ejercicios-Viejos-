/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication86;

/**
 *
 * @author julia
 */
public class JavaApplication86 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 5; // Puedes modificar el valor de 'n' aquí

        if (n == 0) {
            System.out.println("ERROR");
        } else {
            char[][] matrix = new char[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == j || i + j == n - 1) {
                        matrix[i][j] = 'X';
                    } else {
                        matrix[i][j] = '_';
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(matrix[i][j]);
                }
                System.out.println();
            }
        }
    }
    
}
