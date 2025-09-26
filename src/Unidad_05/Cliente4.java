package Unidad_05;
public class Cliente4 {
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjeta;

    public Cliente4(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setTarjeta(TarjetaDeCredito tarjeta) { this.tarjeta = tarjeta; }
    public TarjetaDeCredito getTarjeta() { return tarjeta; }
    public String getNombre() { return nombre; }
}

