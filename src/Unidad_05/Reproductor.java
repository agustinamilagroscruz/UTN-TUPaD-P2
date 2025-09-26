package Unidad_05;
public class Reproductor {
    public void reproducir(Cancion cancion) {
        System.out.println("Reproduciendo: " + cancion.getTitulo() + " de " + cancion.getArtista().getNombre());
    }
}
