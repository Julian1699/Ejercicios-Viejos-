package Reto2;
public class Posgrado extends Estudiante{
    //Atributo
    public String modalidad;
    //Constructor
    public Posgrado(String nom, int ed,String pro, String etnia, String mod){
        super(nom, ed, pro, etnia);
        this.modalidad = mod;
}
    @Override
    public String toString(){
        String salida = "\tEstudiante Posgrado";
        salida += super.toString();
        salida += "\n\tModalidad: " + modalidad;
        return salida;     
}
}