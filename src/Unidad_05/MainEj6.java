package Unidad_05;
public class MainEj6 {
    public static void main(String[] args) {
        Cliente6 cliente = new Cliente6("Sofía Díaz", "45678901");
        Mesa mesa = new Mesa(5, 4);
        Reserva reserva = new Reserva("2025-09-30", "20:00", cliente, mesa);

        System.out.println("Reserva para: " + reserva.getCliente().getNombre());
        System.out.println("Mesa número: " + reserva.getMesa().getNumero());
    }
}
