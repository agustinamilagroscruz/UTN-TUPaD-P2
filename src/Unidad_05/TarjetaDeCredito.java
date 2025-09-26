package Unidad_05;

public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Cliente4 cliente;
    private Banco banco;

    public TarjetaDeCredito(String numero, String fechaVencimiento, Cliente4 cliente, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.cliente = cliente;
        this.banco = banco;
        cliente.setTarjeta(this);
    }

    public Cliente4 getCliente() { return cliente; }
    public Banco getBanco() { return banco; }
}
