package ejercico_do_while1;

public class Ejercico_Do_While1 {
    public static double minMaquina() {
double Xo = 1.0;
double Xi = Xo / 2;
do {
Xo = Xi;
Xi = Xo / 2.0;
} while (Xi > 0.0);
return Xo;
}
    
public static int suma (int n){
    int s = 0;
    for (int i = 0; i<n; i++){
        s = s + i;
    }
    return s;
    
}
  
    public static void main(String[] args) {
        int i = 0;
         while( i <= 6){
        //System.out.println(i);
        i = i + 1;}
    
        String[] frutas =
                new String[] {"a","b","c"};
             for (String letras : frutas){
             System.out.println(letras);
             }
        }
    }
    

