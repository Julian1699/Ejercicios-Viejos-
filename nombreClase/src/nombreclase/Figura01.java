package nombreclase;
/**
 *
 * @author julia
 */
public abstract class Figura01 {
    private String color;
    public Figura01(String color){
        this.color=color;
    }
    abstract double area();
    abstract double perimetro();
    
    public String getColor(){
        return color;
    }
}
