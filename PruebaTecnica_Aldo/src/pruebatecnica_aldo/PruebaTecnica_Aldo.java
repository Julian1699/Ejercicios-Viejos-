
package pruebatecnica_aldo;


public class PruebaTecnica_Aldo {

    public static void main(String[] args) {
        System.out.println(new persona("Julian","Peña",1.75f,79.5f));
    }
    public static class persona {
        private String Nombre;
        private String Apellido;
        float Altura;
        float Peso;

        public persona() {
        }

        @Override
        public String toString() {
            return "persona{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", Altura=" + Altura + ", Peso=" + Peso + '}';
        }
        
        

        public persona(String Nombre, String Apellido, float Altura, float Peso) {
            this.Nombre = Nombre;
            this.Apellido = Apellido;
            this.Altura = Altura;
            this.Peso = Peso;
        }
        
        public double Comer(){
            
            
            return Peso;
        };
        
        public double Crecer(){
           
            
            return Altura;
        };
    }
    
}
