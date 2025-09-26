package Unidad_04;

public class Empleado {

    // Atributos privados (Encapsulamiento)
    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    // Atributo estático
    private static int totalEmpleados = 0;

    // Constructor con todos los atributos
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    // Constructor sobrecargado (solo nombre y puesto)
    public Empleado(String nombre, String puesto) {
        this.id = ++totalEmpleados;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 50000;
    }

    // Métodos sobrecargados actualizarSalario
    public void actualizarSalario(double porcentaje) {
        this.salario += this.salario * (porcentaje / 100);
    }

    public void actualizarSalario(int cantidadFija) {
        this.salario += cantidadFija;
    }

    // Método toString sobrescrito
    @Override
    public String toString() {
        return "Empleado [ID=" + id + ", Nombre=" + nombre +
                ", Puesto=" + puesto + ", Salario=" + salario + "]";
    }

    // Método estático
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getPuesto() { return puesto; }
    public void setPuesto(String puesto) { this.puesto = puesto; }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    // Método main de prueba
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Ana", "Administrativa");
        Empleado e2 = new Empleado("Carlos", "Programador");
        Empleado e3 = new Empleado(10, "María", "Diseñadora", 60000);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        e1.actualizarSalario(10);        // aumenta 10%
        e2.actualizarSalario(5000);      // aumenta cantidad fija

        System.out.println("\nDespués de actualizar salarios:");
        System.out.println(e1);
        System.out.println(e2);

        System.out.println("\nTotal de empleados: " + Empleado.mostrarTotalEmpleados());
    }
}

