package tallerabstract;

public class Main {

    public static void main(String[] args) {
        Persona people[] = new Persona[4];
        //people[0]= new Legislador(123,"pepe","grillo","Cundinamarca");
         people[0]= new Diputado(123,"Pepe","Grillo","Cundinamarca","Diputado");
         people[1]= new Diputado(456,"Jancito","Camelias","Nariño","Diputado");
         people[2]= new Senador(789,"Ricardo","Milos","Valle","Senado");
         people[3]= new Senador(987,"Carlos","Castaño","Antioquia","Senado");     
         
        for(Persona personas : people){
            System.out.println(personas.mostrarDatos());
        }
    } 
}
