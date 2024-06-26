package ejercicios.pkg1;
import java.util.Scanner;

public class Ejercicios1 {

    public static double volumen_circulo (double r1){
        return 4/3*Math.PI*Math.pow(r1,3);
    }
    public static double volumen_cono (double h, double r2){
        return (Math.PI*Math.pow(r2,2)*h)/3;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Ingrese el radio del circulo ");
        double r1 = input.nextInt();
        System.out.print("Ingrese la altura del cono ");
        float h = input.nextFloat();
        System.out.print("Ingrese el radio del cono ");
        float r2 = input.nextFloat();
        System.out.println("El volumen de la circunferencia es " + 
                volumen_circulo(r1));
        System.out.println("El volumen del cono es: "+volumen_cono(h, r2));
    }
    
}
