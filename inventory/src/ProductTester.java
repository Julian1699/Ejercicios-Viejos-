
public class ProductTester {
    
    public static void main(String[] args) {
       Product objc1 = new Product (1, "Hojas", 25, 9.99);
       Product objc2 = new Product (2, "Lapiz", 20, 8.88);
       Product objc3 = new Product (3, "Lapicero", 15, 7.77);
       Product objc4 = new Product (4, "Borrador", 10, 6.66);
       Product objc5 = new Product ();
        System.out.println(objc1.toString());
        System.out.println(objc5.toString());
    }
}

