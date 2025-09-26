package Unidad_05;
public class Propietario5 {
    private String nombre;
    private String dni;
    private Computadora computadora;

    public Propietario5(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setComputadora(Computadora computadora) { this.computadora = computadora; }
    public Computadora getComputadora() { return computadora; }
    public String getNombre() { return nombre; }
}
