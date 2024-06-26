package perro;
public class Perro {
// Atributos
    public int edad;
    public String nombre;
    public String colorOjos;
// Constructor
    Perro(int edad, String nombre, String colorOjos) {
    this.edad = edad;
    this.nombre = nombre;
    this.colorOjos = colorOjos;
    }
// Metodos
    public void ladrar() {
    System.out.println("Guau Guau");
    }
    public void saludar() {
    System.out.println("Hola, mi nombre es " + nombre);
    }
    public void quienEsMayor(Perro otroPerro) {
    if (this.edad > otroPerro.edad) {
    System.out.println("Soy mayor que "+otroPerro.nombre);
    } else if (this.edad == otroPerro.edad) {
    System.out.println("Tenemos la misma edad");
    } else {
    System.out.println(otroPerro.nombre+" es mayor que yo");
    }
    }

    public static void main(String[] args) {
        
       Perro miPerro1 = new Perro(5, "Toby", "Azul");
       Perro miPerro2 = new Perro(7, "Vainilla", "Negro");
       Perro miPerro3 = new Perro(5, "Bony", "Amarillo");
      
       miPerro1.quienEsMayor(miPerro2);
    }
    
}
