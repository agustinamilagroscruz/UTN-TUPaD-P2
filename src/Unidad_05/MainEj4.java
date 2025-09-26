package Unidad_05;

public class MainEj4 {
    public static void main(String[] args) {
        Cliente4 cliente = new Cliente4("Lucía Fernández", "23456789");
        Banco banco = new Banco("Banco Nación", "30-12345678-9");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1234-5678-9012-3456", "12/28", cliente, banco);

        System.out.println("Titular tarjeta: " + tarjeta.getCliente().getNombre());
        System.out.println("Banco: " + tarjeta.getBanco().getNombre());
    }
}
