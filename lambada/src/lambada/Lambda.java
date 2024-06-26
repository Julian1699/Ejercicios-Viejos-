package lambada;
@FunctionalInterface
public interface Lambda {
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
       
    void mensaje();
}
