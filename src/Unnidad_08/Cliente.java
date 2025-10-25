package Unnidad_08;

public class Cliente implements Notificable {
    private String nombre;
    private String email;

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    public void notificarCambioEstado(String mensaje) {
        recibirNotificacion(mensaje);
    }

    public void recibirNotificacion(String mensaje) {
        System.out.println("Notificación para " + nombre + " (" + email + "): " + mensaje);
    }
}