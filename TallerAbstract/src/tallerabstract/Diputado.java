package tallerabstract;

public class Diputado extends Legislador {

    public Diputado(int cc, String nombre, String apellido, String provinciaQueRepresenta, String camara) {
        super(cc, nombre, apellido, provinciaQueRepresenta, camara);
    }
  
    public String getCamaraEnQueTrabaja() {
       System.out.println("La camara en la cual trabaja es el Pacto Historico");
       return camara;
    }
    
      @Override
     public String mostrarDatos(){
        return "La cedula es: "+cc+"\n"+"El nombre es: "+nombre+"\n"+"El apellido es: "+apellido+
                "\n"+"La provincia que representa es: "+provinciaQueRepresenta+"\n"+
                "La camara a la cual pertenece es: "+camara+"\n";
    }
    
}
