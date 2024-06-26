package persona;
public class Persona {
// Atributos
    public String Nombre;
    public int Edad;
    public String Genero;
    public int Peso;
    public double Altura;
// Constructor
    Persona(String Nombre, int Edad, String Genero, int Peso, double Altura) {
    this.Nombre = Nombre;
    this.Edad = Edad;
    this.Genero = Genero;
    this.Peso = Peso;
    this.Altura = Altura;
    }
// Metodos 
    public void calcularIMC(){
       System.out.println(this.Peso/ Math.pow(this.Altura, 2));
    }
    public void esMayorDeEdad(){
        
    if (this.Edad > 18) {
        System.out.println("True");
    }
    else{System.out.println("False");}
    }
    //public void toString(){} Devolvera toda la informacion del objeto en un String.         
    public static void main(String[] args) {
        Persona Camilo = new Persona ("Camilo", 24, "Macho", 70, 1.78);
        Persona Ricardo = new Persona ("Ricardo", 23, "Macho", 70, 1.80);
        Persona Julian = new Persona ("Julian", 23, "Macho", 80, 1.74);
        Persona Annie = new Persona ("Annie", 12, "Hembra", 40, 1.40);
        Camilo.toString();
        
        Camilo.esMayorDeEdad();
        Ricardo.esMayorDeEdad();
        Julian.esMayorDeEdad();
        Annie.esMayorDeEdad();
        
        Camilo.calcularIMC();
        Ricardo.calcularIMC();
        Julian.calcularIMC();
        Annie.calcularIMC();
    }
}
