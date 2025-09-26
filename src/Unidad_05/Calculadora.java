package Unidad_05;
import Unidad_05.Impuesto;
public class Calculadora {
    public void calcular(Impuesto impuesto) {
        System.out.println("Calculando impuesto de: " + impuesto.getContribuyente().getNombre());
        System.out.println("Monto: $" + impuesto.getMonto());
    }
}
