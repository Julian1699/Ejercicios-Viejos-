package harryph;

import java.util.Scanner;

/**
 *
 * @author julia
 */
public class Harryph {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int Gryffindor = 0;
        int Ravenclaw = 0;
        int Hufflepuff = 0;
        int Slytherin = 0;
        
        System.out.println("Examen para entrar a una casa de HOGWARTS");
        System.out.println("Do you like Dawn or Dusk?");
        System.out.println("1)Dawn " + " 2)Dusk ");
        System.out.println("Answer: ");
        Scanner input = new Scanner(System.in);
        int respuesta = input.nextInt();
        if(respuesta == 1){
            Gryffindor = Gryffindor + 1;
            Ravenclaw = Ravenclaw + 1;
        }
        else if(respuesta == 2){
            Hufflepuff = Hufflepuff + 1;
            Slytherin = Slytherin + 1;
        }else {System.out.println("Incorrect Input");}
        

    }
    
}
