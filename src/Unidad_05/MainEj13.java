package Unidad_05;
public class MainEj13 {
    public static void main(String[] args) {
        Usuario13 usuario = new Usuario13("Valentina Ruiz", "valentina@email.com");
        GeneradorQR generador = new GeneradorQR();
        generador.generar("QR12345", usuario);
    }
}
