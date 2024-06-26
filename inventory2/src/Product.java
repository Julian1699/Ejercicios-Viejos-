
public class Product {
    //Atributos
    private int elemento;
    private String producto;
    private int unidades;
    private double precio;
    
    public Product(){};
    
    public Product(int elemento, String producto, int unidades, double precio) {
        this.elemento = elemento;
        this.producto = producto;
        this.unidades = unidades;
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

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return  "elemento=" + elemento +"\n"+" producto=" + producto +"\n"+" unidades=" + unidades +"\n"+" precio=" + precio;
    }
    
    
    
   
    
}
