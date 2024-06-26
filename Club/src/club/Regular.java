package club;

public class Regular extends Jugador{
    public int minutosJugados;
    
    public Regular(String nombre, String apellido, int edad, String posicion, int minutosJugados){
        super(nombre,apellido,edad,posicion);
        this.minutosJugados = minutosJugados;   
    }
    @Override
    public String toString(){
        return super.toString() + 
                "\tTiempo jugado: "+minutosJugados+" minutos\n"; 
    }
}
