/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkginterface;

/**
 *
 * @author julia
 */
public class Cuadrado implements InterfaceMain{
    private int L;

    public int getL() {
        return L;
    }

    public void setL(int L) {
        this.L = L;
    }

    public Cuadrado() {
    }

    public Cuadrado(int L) {
        this.L = L;
    }
    

    @Override
    public int Area() {
        return L * L;
    }

    @Override
    public int Perimetro() {
        return 4*L;
    }
    
    
}
