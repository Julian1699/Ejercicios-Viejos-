package lambada;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambada extends Alumno{

    //static ArrayList<Alum> Alum = new ArrayList();
    public static void main(String[] args) {
        /*
        Alumno lista[] = {new Alumno(1,"123","Camilo","Mamian","C#",5.0,24),
        new Alumno(2,"456","Stiven","Alvear","Python",4.0,28),
        new Alumno(3,"789","Ricardo","Milos","Java",3.0,24),
        new Alumno(4,"987","Aldemar","Bernal","Kotlin",1.0,23),
        new Alumno(5,"789","Juan","Potes","C++",4.5,18),
        new Alumno(6,"654","Nicolas","Olave","C",4.2,23),
        new Alumno(7,"321","Viviana","Cangrejo","Ruby",3.5,23),
        new Alumno(8,"012","Ing","Moster","Angular",4.0,20),
        new Alumno(9,"023","Cristian","Avendaño","JavaScript",4.0,20),
        new Alumno(10,"034","Cristian","Montoya","PHP",4.3,28)
        };  
        */
        List<Alumno> lista = new ArrayList<>();
        lista.add(new Alumno(1,"123","Juan Camilo","Mamian Ruiz","C#",5.0,24));
        lista.add(new Alumno(2,"456","David Stiven","Alvear","Python",4.0,28));
        lista.add(new Alumno(3,"789","Ricardo Andres","Milos","Java",4.3,24));
        lista.add(new Alumno(4,"987","Aldemar","Bernal","Kotlin",1.0,23));
        lista.add(new Alumno(5,"789","Juan David","Potes","C++",4.5,18));
        lista.add(new Alumno(6,"654","Nicolas","Olave","C",4.2,23));
        lista.add(new Alumno(7,"321","Viviana","Cangrejo","Ruby",3.5,23));
        lista.add(new Alumno(8,"012","Ingeniero","Moster","Angular",4.0,20));
        lista.add(new Alumno(9,"023","Cristian","Avendaño","JavaScript",4.0,20));
        lista.add(new Alumno(10,"034","Cristian","Montoya","PHP",4.3,28));
        
        //Listar Estudiantes Por Medio De Un ForEach Normal
        //for(Alumno i : lista){
        //    System.out.println(i);
        //}
        
        //OBTENER TODOS LOS ALUMNOS DE LA LISTA.
        //lista.forEach(i -> System.out.println("Listado de alumnos: " + i));
        System.out.println("OBTENER TODOS LOS ALUMNOS DE LA LISTA.");
        lista.stream().forEach(System.out::println);
        System.out.println();
  
        //DEVOLVAMOS LA LONGITUD DE LA LISTA.
        //lista.forEach(i -> System.out.println("La longitud de la lista es: " + lista.size()));
        System.out.println("DEVOLVAMOS LA LONGITUD DE LA LISTA.");
        System.out.println(lista.stream().count());
        System.out.println();
        //OBTENGA 5 ALUMNOS CON MAYOR NOTA.
        System.out.println("OBTENGA 5 ALUMNOS CON MAYOR NOTA.");
        lista.stream().filter(i->i.getNota()>4).forEach(j->System.out.println(j));
        System.out.println("");
        
        //OBTENER EL ALUMNO QUE TIENE LA MENOR EDAD.
        System.out.println("OBTENER EL ALUMNO QUE TIENE LA MENOR EDAD.");
        System.out.println(lista.stream().min((a1, a2) -> a1.getEdad()-a2.getEdad()));
        System.out.println("");
        
        //OBTENER LOS ALUMNOS CUYA LONGITUD DE NOMBRES SEA MAYOR A 10.
        System.out.println("OBTENER LOS ALUMNOS CUYA LONGITUD DE NOMBRES SEA MAYOR A 10.");
        lista.stream().filter(a -> a.getNombres().length()>10).forEach(System.out::println);
    }  
}
