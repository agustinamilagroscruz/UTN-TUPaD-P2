package Unidad_05;
public class MainEj12 {
    public static void main(String[] args) {
        Contribuyente contribuyente = new Contribuyente("Pedro Sánchez", "20-12345678-9");
        Impuesto impuesto = new Impuesto(1500.50, contribuyente);
        Calculadora calculadora = new Calculadora();

        calculadora.calcular(impuesto);
    }
}
