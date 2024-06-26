
package figurasg5;

public class principal {

    
    public static void main(String[] args) {
        Cuadrado pruebaCuadrado = new Cuadrado(5);
        
        pruebaCuadrado.area();
        
        System.out.println(pruebaCuadrado.area());
        System.out.println(pruebaCuadrado.area());
        Circulo pruebaCirculo = new Circulo(2.0);
        pruebaCirculo.area();
        
        Triangulo pruebaT = new Triangulo(2,2,2);
        Triangulo pruebaT1 = new Triangulo(7,8);
        System.out.println(pruebaT1.area2());
        System.out.println(pruebaT.area());
    }
    
}
