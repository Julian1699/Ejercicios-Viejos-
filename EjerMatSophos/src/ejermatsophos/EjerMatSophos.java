package ejermatsophos;

import java.util.Scanner;


public class EjerMatSophos {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        /*int [][]arr_bi = {{1,1,1},{2,2,2},{3,3,3}};
        
        for(int i=0;i<=arr_bi.length;i++){
            for(int j=0;j<arr_bi[i].length;j++){
               // System.out.print(arr_bi[i][j]);
            }
        } 
    //__________________________________________________________________________
        
        for(int i=0,j=0;i<arr_bi.length && j<arr_bi.length;i++,j++){
                System.out.print(arr_bi[i][j]);
        }
        System.out.println();
        */
        
    //__________________________________________________________________________ 
        /*
    
   1)Almacenar en una matriz el número de alumnos con el que cuenta una academia, ordenados en
    función del nivel y del idioma que se estudia. Existe 3 filas que representarán al Nivel básico, medio
    y Avanzado y 4 columnas en las que figurarán los idiomas (0 = inglés, 1 = Francés, 2 = Alemán y 3 =
    Ruso). Se pide realizar la declaración de la matriz y asignarle unos valores de ejemplo a cada
    elemento
    */
    /*
        int[][]alumn = new int[3][4];
        //Fila 1 (Nivel básico)
        alumn[0][0] = 1; //Columna 1 Inglés
        alumn[0][1] = 2; //Columna 2 Francés
        alumn[0][2] = 3; //Columna 3 Alemán
        alumn[0][3] = 4; //Columna 4 Ruso
        //Fila 2 (Nivel medio)
        alumn[1][0] = 5; //Columna 1 Inglés
        alumn[1][1] = 6; //Columna 2 Francés
        alumn[1][2] = 7; //Columna 3 Alemán
        alumn[1][3] = 8; //Columna 4 Ruso
        //Fila 3 (Nivel avanzado)
        alumn[2][0] = 9; //Columna 1 Inglés
        alumn[2][1] = 8; //Columna 2 Francés
        alumn[2][2] = 7; //Columna 3 Alemán
        alumn[2][3] = 6; //Columna 4 Ruso
        
        //int[][]alum = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        
        for(int i = 0; i<alumn.length; i++){
            for(int j = 0; j<alumn[i].length; j++){
                System.out.print("  "+alumn[i][j]);
            }
            System.out.println();
        }
     */   
    //
    
        /*
        Crea un programa que pida por pantalla cuatro países y a continuación tres ciudades de cada uno de
        estos países. Los nombres de ciudades deben almacenarse en un array multidimensional cuyo primer
        índice sea el número asignado a cada país y el segundo índice el número asignado a cada ciudad.
        */
        
        
                //Declaración de la matriz
                 String [][] listP =new String[4][4];
                 String final_list="";
                 //Operación
                 for (int i=0;i<4;i++){
                 System.out.print("Escriba el nombre del pais "+(i+1)+" : ");
                 listP[i][0] = input.nextLine()+":";
                 }
                 for (int j=0;j<4;j++){
                 for (int i=1;i<4;i++){
                 System.out.print("Escriba el nombre de la ciudad "+(i)+" del pais "+(j+1)+" : ");
                 listP[j][i] = input.nextLine();
                 }
                 }
                 for(int i=0; i<4; i++){
                 for(int j=0; j<4; j++){
                 final_list+= listP[i][j]+" ";
                 }
                 final_list+="\n";
                 }
                 System.out.print(final_list);
          
    } 
}
