package anidadas;

public class Anidadas {    
    public static void main(String[] args) {
        clase_externa externa = new clase_externa();
        clase_externa.clase_interna interna = externa.new clase_interna();
        interna.suma = externa.x + interna.y;
        System.out.println(interna.suma);
        interna.resta = externa.x - interna.y;
        System.out.println(interna.resta);
        interna.multiplicacion = externa.x * interna.y;
        System.out.println(interna.multiplicacion);
        interna.division = externa.x / interna.y;
        System.out.println(interna.division);
    }
}
class clase_externa{
    int x = 10;
    class clase_interna{
        int y = 10;
        int suma = 0;
        int resta = 0;
        int multiplicacion = 0;
        int division = 0;    
    }  
}