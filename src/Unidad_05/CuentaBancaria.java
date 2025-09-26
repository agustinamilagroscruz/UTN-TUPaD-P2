package Unidad_05;

public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad clave;
    private Titular10 titular;

    public CuentaBancaria(String cbu, double saldo, ClaveSeguridad clave, Titular10 titular) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = clave;
        this.titular = titular;
        titular.setCuenta(this);
    }

    public Titular10 getTitular() { return titular; }
    public ClaveSeguridad getClave() { return clave; }
}
