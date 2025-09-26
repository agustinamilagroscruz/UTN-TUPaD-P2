package Unidad_05;
public class MainEj1 {
    public static void main(String[] args) {
        Foto foto = new Foto("foto_pasaporte.jpg", "jpg");
        Titular1 titular = new Titular1("Juan Pérez", "12345678");
        Pasaporte pasaporte = new Pasaporte("A123456", "2025-01-01", foto, titular);

        System.out.println("Titular del pasaporte: " + pasaporte.getTitular().getNombre());
        System.out.println("Formato de la foto: " + pasaporte.getFoto().getFormato());
    }
}
