
package figurasg5;

public abstract class FiguraG5 {
    //Atributos
    public String color;
    //Constructor
    
    //Sobrecarga de metodos
    
    public FiguraG5(String color){
        this.color = color;
    }
    public FiguraG5(){
        this.color = "blanco";
    }
    
    public void saludar(){
        System.out.println("Hola");
    }
    public void despedirse(){
        System.out.println("Adios");
    }
    
    protected abstract double perimetro();
    
    public abstract double area();  
}
