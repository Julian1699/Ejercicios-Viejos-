
package practicer6;
import java.util.Scanner;

public class PracticeR6 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Digite el numero de horas de las cuales va a sacar los datos: ");
       int numero_horas=input.nextInt();
       int conversion_semanas = numero_horas/168;
       int conversion_dias = (numero_horas%168)/24;
       int conversion_horas = numero_horas%24;
        System.out.println(conversion_semanas+" Semanas"+", "+conversion_dias+" dias "+"y"+" "+conversion_horas+" horas");
       
    }
    
}
