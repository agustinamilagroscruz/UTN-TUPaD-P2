package Unnidad_08;


public class TarjetaCredito implements Pago, PagoConDescuento {

    private String numeroTarjeta;

    public TarjetaCredito(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void procesarPago(double monto) {
        double finalConDescuento = aplicarDescuento(monto);
        System.out.println("Pagando $" + finalConDescuento + " con tarjeta de crédito " + numeroTarjeta);
    }

    @Override
    public double aplicarDescuento(double monto) {
        return monto * 0.90;
    }
}