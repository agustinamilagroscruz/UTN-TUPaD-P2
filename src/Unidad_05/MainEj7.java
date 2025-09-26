package Unidad_05;
import Unidad_05.Motor;
public class MainEj7 {
    public static void main(String[] args) {
        Motor motor = new Motor("V8", "MTR12345");
        Conductor conductor = new Conductor("Carlos Ramírez", "LIC123456");
        Vehiculo vehiculo = new Vehiculo("ABC123", "Ford Mustang", motor, conductor);

        System.out.println("Conductor del vehículo: " + vehiculo.getConductor().getNombre());
        System.out.println("Tipo de motor: " + vehiculo.getMotor().getTipo());
    }
}
