package Unidad_05;
public class Titular10 {
    private String nombre;
    private String dni;
    private CuentaBancaria cuenta;

    public Titular10(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setCuenta(CuentaBancaria cuenta) { this.cuenta = cuenta; }
    public CuentaBancaria getCuenta() { return cuenta; }
    public String getNombre() { return nombre; }
}
