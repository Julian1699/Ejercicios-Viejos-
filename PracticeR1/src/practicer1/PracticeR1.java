package practicer1;
import java.util.Scanner;

public class PracticeR1 {
    //Los protas Gi,Ale y Nico
    //Gi-4=2*Ale => Ale = (Gi-4)/4 => // Gi = (2*Ale)+4
    //Gi+Ale=5*Nico => Ale = (5*Nico)/Gi => Nico = (Gi+Ale)/5
    
    //Condicionales
    //Etapa 1 = 0-20 kg
    //Etapa 2 = 21-40 kg
    //Etapa 3 = 41-80 kg
    //Etapa 4 > 80
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escriba el peso de Ale: ");
        int Ale = input.nextInt();
        
        int Gi = (2*Ale)+4;
        int Nico = (Gi+Ale)/5;
        
        System.out.print(Ale+" "+Gi+" "+Nico);
        System.out.println();
        
       Defina(Gi);
    }
        public static void Defina(int peso){
            if(peso<=20){
            System.out.println("Etapa 1");
            }
            else if(peso>= 21 && peso <= 40){
            System.out.println("Etapa 2");        
            }
            else if(peso >= 41 && peso <= 80){
            System.out.println("Etapa 3");       
            }
            else if (peso>80){
            System.out.println("Etapa 4");
            }
        };

}
