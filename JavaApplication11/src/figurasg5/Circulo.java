
package figurasg5;

public class Circulo extends FiguraG5 {
    //Atributos
    public double radio;
    //Constructor
    public Circulo(double r){
    super();
    this.radio = r;
    }
    //Metodos
    @Override
    protected double perimetro(){
    return 2*Math.PI*this.radio;
    }
    @Override
    public double area(){
        return Math.PI*(this.radio*this.radio);
    }
    
}
