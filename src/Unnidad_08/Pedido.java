package Unnidad_08;

import Unidad_06.Producto;
import Unnidad_08.Notificable;
import Unnidad_08.Pagable;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable, Notificable {
    private List<Producto> productos;
    private String estado;
    private Cliente cliente;

    public Pedido(Cliente cliente) {
        this.productos = new ArrayList<>();
        this.estado = "CREADO";
        this.cliente = cliente;
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    @Override
    public double calcularTotal() {
        double total = 0.0;
        for (Producto p : productos) {
            total += p.getPrecio();
        }
        return total;
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        notificarCambioEstado("El pedido cambió de estado a: " + nuevoEstado);
    }

    @Override
    public void notificarCambioEstado(String mensaje) {
        if (cliente != null) {
            cliente.recibirNotificacion(mensaje);
        }
    }

    public String getEstado() {
        return estado;
    }
}