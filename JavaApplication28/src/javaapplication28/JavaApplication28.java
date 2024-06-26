package javaapplication28;



public class JavaApplication28 {

  
     
    public static void main(String[] args) {
     /**  
        Scanner sc = new Scanner (System.in);
        int[] x = new int[5];
        for( int i=0; i<5; i++ ){
            System.out.println("Componente "+i+"- ́esima?");
            x[i] = sc.nextInt();
            System.out.println(x[i]);
        }
     */
       // int [] Arr1 = new int[]{1,2,3,4,5};
        //int suma = 0;
        //for (int i:Arr1){
        //    suma += Arr1[i];
        //System.out.println("con el ciclo for each: "+suma);
        
        
        int arr[] = new int[] {1,2,3,4,5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
           // System.out.println("Array Sum = "+sum);
        }
        System.out.println("Array Sum = "+sum);
 }
   
}
