package tallerabstract;

public class Persona {
    public int cc;
    public String nombre;
    public String apellido;
    public String provinciaQueRepresenta;
    public String camara;

    public Persona(int cc, String nombre, String apellido, String provinciaQueRepresenta, String camara) {
        this.cc = cc;
        this.nombre = nombre;
        this.apellido = apellido;
        this.provinciaQueRepresenta = provinciaQueRepresenta;
        this.camara = camara;
    }
    public String mostrarDatos(){
        return "La cedula es: "+cc+"\n"+"El nombre es: "+nombre+"\n"+"El apellido es: "+apellido+
                "\n"+"La provincia que representa es: "+provinciaQueRepresenta+"\n"+
                "La camara a la cual pertenece es: "+camara+"\n";
    }
    
}
