package lambada;
public class Alumno {
    public int id;
    public String cedula;
    public String nombres;
    public String apellidos;
    public String nombreCurso;
    public double nota;
    public int edad;
    
    public Alumno(){
    
    }

    public Alumno(int id, String cedula, String nombres, String apellidos, String nombreCurso, double nota, int edad) {
        this.id = id;
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.nombreCurso = nombreCurso;
        this.nota = nota;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", cedula=" + cedula + ", nombres=" + nombres + ", apellidos=" + apellidos + ", nombreCurso=" + nombreCurso + ", nota=" + nota + ", edad=" + edad + '}';
    }
    
}
