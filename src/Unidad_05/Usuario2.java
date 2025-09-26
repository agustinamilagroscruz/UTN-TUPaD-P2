package Unidad_05;
public class Usuario2 {
    private String nombre;
    private String dni;
    private Celular celular;

    public Usuario2(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setCelular(Celular celular) { this.celular = celular; }
    public Celular getCelular() { return celular; }
    public String getNombre() { return nombre; }
}
