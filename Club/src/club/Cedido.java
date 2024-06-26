
package club;

public class Cedido extends Jugador {
    public String clubActual;
    
    public Cedido(String nombre, String apellido, int edad, String posicion,String clubActual){
    super(nombre, apellido, edad, posicion);
    this.clubActual = clubActual;
    }
     @Override
    public String toString(){
        return super.toString() + 
                "\tClub actual: "+clubActual; 
    }
}
