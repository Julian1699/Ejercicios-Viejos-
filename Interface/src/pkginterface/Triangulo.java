/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkginterface;

/**
 *
 * @author julia
 */
public class Triangulo implements InterfaceMain{
    private int base;
    private int altura;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public int Area() {
        return (base*altura)/2;
    }

    @Override
    public int Perimetro() {
        return base+base+base;
    }
    
    
}
