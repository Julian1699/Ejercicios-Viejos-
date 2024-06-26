package praticer2;
import java.util.ArrayList;

public class PraticeR2 {
    public static void main(String[] args) { ArrayList<Integer> lista_numeros = new ArrayList<Integer>();
       lista_numeros.add(1);
       lista_numeros.add(2);
       lista_numeros.add(3);
       lista_numeros.add(4);
       lista_numeros.add(5);    
    lanzar_moneda();
        probar_suerte(lanzar_moneda(),lista_numeros);
    }
    public static String lanzar_moneda(){
        String moneda = "";
        int numero = (int)(Math.random()*2);
        if (numero== 0){
            moneda = "cara";
        }else if (numero == 1){
            moneda = "cruz";
        }
        return moneda;      
    };
    public static void probar_suerte(String resultado,ArrayList<Integer> lista_numeros){
        
        if(resultado.equalsIgnoreCase("cruz")){
            System.out.println("salio cruz"); 
            
            for(Integer i:lista_numeros){
                System.out.print(i);
            }
            System.out.println();
        }else if (resultado.equalsIgnoreCase("cara")){
            System.out.println("Se destruira la lista");
        }; 
    }
}
