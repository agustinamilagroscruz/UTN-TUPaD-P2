package Unidad_05;

public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre;
    private Propietario5 propietario;

    public Computadora(String marca, String numeroSerie, PlacaMadre placaMadre, Propietario5 propietario) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = placaMadre;
        this.propietario = propietario;
        propietario.setComputadora(this);
    }

    public Propietario5 getPropietario() { return propietario; }
    public PlacaMadre getPlacaMadre() { return placaMadre; }
}
