package problemasmatr5;

public class ProblemasMatr5 {

    public static void main(String[] args) {
        System.out.println("ALGORITMO: MATRIZ MÁGICA");
        //Declaramos la matriz
        int matriz[][] = {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}};
//        111 = 3
//        111 = 3
//        111 = 3
//        ---
//        333

//        123 = 6
//        456 = 15
//        789 = 24
//        ---
//        12 15 18

        //Declaramos los contadores de Filas y Columnas
        int SumaFilas = 0;
        int[][] Nuevo = new int[3][3];
        int SumaColumnas = 0;
        //Hacemos los fors para recorrer la matriz por Filas

        for (int i = 0; i < 3; i++) {
            SumaFilas = 0;
            for (int j = 0; j < 3; j++) {
                SumaFilas += matriz[i][j];
            }
            //System.out.print(" " + SumaFilas);
            for (int q = 0; q < 3; q++) {
                for (int w = 0; w < 3; w++) {
                    Nuevo[q][w] = SumaFilas;

                }
            }
        }
        for (int q = 0; q < 3; q++) {
            for (int w = 0; w < 3; w++) {

                System.out.print(" " + Nuevo[q][w]);

            }
            System.out.println();
        }
        for (int q = 0; q < 3; q++) {
            for (int w = 0; w < 3; w++) {

                //System.out.print(" " + Nuevo[q][w]);
            }
            System.out.println();
            //Nuevo for
        }
        boolean rompe = false;
        for (int q = 0; q < 3; q++) {
            for (int w = q + 1; w < 3; w++) {
                //System.out.print(" " + Nuevo[q][w]);
            }
            System.out.println();
        }

        System.out.println();
        // Hacemos los fors para recorrer la matriz por Columnas
        for (int x = 0; x < 3; x++) {
            SumaColumnas = 0;
            for (int z = 0; z < 3; z++) {
                SumaColumnas += matriz[z][x];
            }
            // System.out.print(" " + SumaColumnas);
        }

        System.out.println();
        System.out.println();
    }
}
