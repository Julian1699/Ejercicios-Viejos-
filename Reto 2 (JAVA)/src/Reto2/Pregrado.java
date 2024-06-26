package Reto2;

public class Pregrado extends Estudiante{
    private int cantidad_creditos;
    
    public Pregrado(String nom, int ed, String pro, String etnia,int cantcre ){
        super(nom, ed, pro, etnia);
        this.cantidad_creditos = cantcre;
    }
    @Override
    public String toString(){
        String salida = "\tEstudiante Pregrado";
        salida += super.toString();
        salida += "\n\tCreditos aprobados: " + cantidad_creditos;
        return salida;     
}
}