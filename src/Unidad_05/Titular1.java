package Unidad_05;
public class Titular1 {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte;

    public Titular1(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setPasaporte(Pasaporte pasaporte) { this.pasaporte = pasaporte; }
    public Pasaporte getPasaporte() { return pasaporte; }
    public String getNombre() { return nombre; }
}
