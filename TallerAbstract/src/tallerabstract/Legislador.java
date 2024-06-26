package tallerabstract;

public abstract class Legislador extends Persona{

    public Legislador(int cc, String nombre, String apellido, String provinciaQueRepresenta, String camara) {
        super(cc, nombre, apellido, provinciaQueRepresenta, camara);
    }
    @Override
     public String mostrarDatos(){
        return "La cedula es: "+cc+"\n"+"El nombre es: "+nombre+"\n"+"El apellido es: "+apellido+
                "\n"+"La provincia que representa es: "+provinciaQueRepresenta+"\n"+
                "La camara a la cual pertenece es: "+camara+"\n";
    }
    public abstract String getCamaraEnQueTrabaja();
}
