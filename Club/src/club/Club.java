package club;
import java.util.Scanner;
import java.util.ArrayList;
public class Club {
    public static ArrayList<Jugador> listaJugadores = new ArrayList<Jugador>();
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String opcionElegida;
        String partidas[];
        
        do{
            opcionElegida = input.nextLine();
            partidas = opcionElegida.split(";");
            
            if(partidas[0].equals("1")){
            //Para crear jugadores
                String nombre = partidas[2];
                String apellido = partidas[3];
                String posicion = partidas[4];
                int edad = Integer.parseInt(partidas[5]);
                
                if(partidas[1].equals("Regular")){
                  
                    int minutosJugados = Integer.parseInt(partidas[6]);
                    
                    Regular miRegular = new Regular(nombre, apellido, edad, posicion, minutosJugados);
                    listaJugadores.add(miRegular);
                    
                }else if(partidas[1].equals("Cedido")){
                    String clubActual = partidas[6];
                    Cedido miCedido = new Cedido(nombre,apellido, edad, posicion, clubActual);
                    listaJugadores.add(miCedido);
                }
            }
            else if(partidas[0].equals("2")){
                System.out.println("Jugadores del club GRUPO41");
                for (Jugador miJugador: listaJugadores){
                    System.out.println(miJugador);
                }
            //Imprimir Lista de Jugadores
            }
        }while(!partidas[0].equals("3"));
    }
    
}
