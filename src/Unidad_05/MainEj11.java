package Unidad_05;
public class MainEj11 {
    public static void main(String[] args) {
        Artista artista = new Artista("Shakira", "Pop");
        Cancion cancion = new Cancion("Hips Don't Lie", artista);
        Reproductor reproductor = new Reproductor();

        reproductor.reproducir(cancion);
    }
}
