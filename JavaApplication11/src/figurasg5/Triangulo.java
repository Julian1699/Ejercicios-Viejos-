
package figurasg5;

public class Triangulo extends FiguraG5{
    //Atributos
    public double lado1;
    public double lado2;
    public double lado3;
    //Constructor
    public Triangulo(double l1, double l2, double l3){
    super();
    this.lado1=l1;
    this.lado3=l2;
    this.lado3=l3;
    }
    public Triangulo(double base, double altura){
    super();
    this.lado1=base;
    this.lado2=altura;
    }
    public Triangulo(double lado, String color){
    super();
    this.lado1 = lado;
    }
    //Metodos
    @Override
    protected double perimetro(){
        return this.lado1+this.lado2+this.lado3;
    }
    @Override
    public double area(){
    double s = this.perimetro()/2;
    return(Math.sqrt(s*(s-this.lado1)*(s-this.lado2)*(s-this.lado3)));
    }
    public double area2(){
    return (this.lado1*this.lado2)/2;
    }
}
