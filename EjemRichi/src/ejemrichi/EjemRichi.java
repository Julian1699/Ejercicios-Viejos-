
package ejemrichi;

/*Escribe una función que requiera una cantidad indefinida de
argumentos. Lo que hará esta función es devolver True si en
algún momento se ha ingresado al numero cero repetido dos
veces consecutivas
Por ejemplo:
(5,6,1,0,0,9,3,5) >>> True
(6,0,5,1,0,3,0,1) >>> False

*/

public class EjemRichi {

    public static void main(String[] args) {
        System.out.println(comprobar());
    }
    public static boolean comprobar(){
        boolean valor_retornador = false;
        int el_que_cuenta=1;
        int arreglo_unid[]= {5,6,1,0,0,9,3,5};
        for(int i=0;i<arreglo_unid.length;i++){
            if(arreglo_unid[i]==0 && el_que_cuenta ==0){
                valor_retornador=true;
            }
            el_que_cuenta=arreglo_unid[i];
        }
        return valor_retornador;
    }
    
}
