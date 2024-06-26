
public class Product {
    //Atributos
    private int elemento;
    private String producto;
    private int unidades_exist;
    private double precio;
    
    public Product (){ 
        elemento = 4;
    }
    
    public Product (int elemento, String producto, int unidades_exist, double precio){
        this.elemento = elemento;
        this.producto = producto;
        this.unidades_exist = unidades_exist; 
        this.precio = precio;
    }

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getUnidades_exist() {
        return unidades_exist;
    }

    public void setUnidades_exist(int unidades_exist) {
        this.unidades_exist = unidades_exist;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Product{" + "elemento=" + elemento + ", producto=" + producto + ", unidades_exist=" + unidades_exist + ", precio=" + precio + '}';
    }
    
    
    
   
    
}
