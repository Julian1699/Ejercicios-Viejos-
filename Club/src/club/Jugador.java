
package club;

public class Jugador {
    public String nombre;
    public String apellido;
    public int edad;
    public String posicion;
    
    public Jugador(String nombre, String apellido, int edad, String posicion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.posicion = posicion;
        
    }
    @Override
    public String toString(){
        return "\tNombre completo: "+nombre+" "+apellido+"\n"+
                "\tEdad: "+edad+" años\n"+
                "\tPosicion: "+ posicion+"\n";
        
    }
}
