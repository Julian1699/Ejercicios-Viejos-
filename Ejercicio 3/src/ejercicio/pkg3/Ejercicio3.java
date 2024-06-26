package ejercicio.pkg3;
import java.util.Scanner;
public class Ejercicio3 {
    
     public static int Remesa (int P, int M, int H){
       return P+M+H;
     }    
     public static int Billete (int B){ 
       return B;
     }
     public void Devuelta (){
       int devuelta;
       int faltan;
       
     }
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de Panes");
        int P = input.nextInt()*300;
        System.out.println("Ingrese la cantidad de Bolsas de Leche");
        int M = input.nextInt()*3300;
        System.out.println("Ingrese la cantidad Huevos");
        int H = input.nextInt()*350;
        System.out.println("Con cuanto va a pagar");
        int B = input.nextInt();
        if (Billete(B) > Remesa(P,M,H)){
            int devuelta = Billete(B)-Remesa(P,M,H);
            System.out.println("Su devuelta es "+devuelta);
        }
        else if (Billete(B) < Remesa(P,M,H)) {
         int faltan = Remesa(P,M,H)-Billete(B);
         System.out.println("Le Faltan por pagar: "+faltan);
        }
    }
    
}
