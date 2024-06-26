package Reto2;
public class Estudiante {
//Atributos
    public String nombre;
    public int edad;
    public String programa;
    public String etnia;
// Constructor
    public Estudiante (String nombre, int edad, String programa, String etnia) {
    this.nombre = nombre;
    this.edad = edad;
    this.programa = programa;
    this.etnia = etnia;
    }
// Métodos
    @Override
    public String toString(){
        return "\n\tNombre: "+nombre+"\n\tEdad: "+edad+" anios\n\tPrograma: "+programa+"\n\tEtnia: "+etnia;
    }
}
