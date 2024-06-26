
package javaapplication85;

public class CuentaBancaria {
    private int num_cuenta;
    private int saldo;
    private String propietario;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int num_cuenta, int saldo, String propietario) {
        this.num_cuenta = num_cuenta;
        this.saldo = saldo;
        this.propietario = propietario;
    }

    public int getNum_cuenta() {
        return num_cuenta;
    }

    public void setNum_cuenta(int num_cuenta) {
        this.num_cuenta = num_cuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    
    public int depositar_dinero (int saldo, int dinero_depositado){
        saldo = saldo + dinero_depositado;
        return saldo;
    };
    
    public int retirar_dinero (int saldo, int dinero_retirado){
        saldo = saldo - dinero_retirado;
        return saldo;
    };
    
    public int saldo_actual(int saldo_actual, int saldo){
        saldo_actual = saldo;
        return saldo_actual;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "num_cuenta=" + num_cuenta + ", saldo=" + saldo + ", propietario=" + propietario + '}';
    }
    
}
