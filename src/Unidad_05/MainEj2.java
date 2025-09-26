package Unidad_05;
public class MainEj2 {
    public static void main(String[] args) {
        Bateria bateria = new Bateria("Li-Ion", 5000);
        Usuario2 usuario = new Usuario2("Ana Gómez", "87654321");
        Celular celular = new Celular("1234567890", "Samsung", "S23", bateria, usuario);

        System.out.println("Usuario del celular: " + celular.getUsuario().getNombre());
        System.out.println("Capacidad de la batería: " + celular.getBateria().getCapacidad() + " mAh");
    }
}
