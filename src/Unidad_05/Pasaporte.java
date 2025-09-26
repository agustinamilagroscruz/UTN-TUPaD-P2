package Unidad_05;

public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto;
    private Titular1 titular;

    public Pasaporte(String numero, String fechaEmision, Foto foto, Titular1 titular) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = foto;
        this.titular = titular;
        titular.setPasaporte(this);
    }

    public Titular1 getTitular() { return titular; }
    public Foto getFoto() { return foto; }
}
