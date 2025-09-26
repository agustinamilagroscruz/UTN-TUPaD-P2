package Unidad_05;
public class MainEj10 {
    public static void main(String[] args) {
        ClaveSeguridad clave = new ClaveSeguridad("1234", "2025-09-01");
        Titular10 titular = new Titular10("Ana Torres", "56789012");
        CuentaBancaria cuenta = new CuentaBancaria("1234567890123456789012", 50000, clave, titular);

        System.out.println("Titular de la cuenta: " + cuenta.getTitular().getNombre());
        System.out.println("Código de seguridad: " + cuenta.getClave().getCodigo());
    }
}
