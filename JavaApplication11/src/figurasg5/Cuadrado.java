
package figurasg5;

public class Cuadrado extends FiguraG5{
    public double lado;
    
    public Cuadrado(double lado){
    super();
    this.lado = lado;
    }
    public Cuadrado(double lado, String color){
    super(color);
    this.lado = lado;
    }
    
    @Override
    protected double perimetro(){
        return this.lado*4;
    }
    @Override
    public double area(){
        return this.lado*this.lado;
    }
}
