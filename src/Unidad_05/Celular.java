package Unidad_05;

public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria;
    private Usuario2 usuario;

    public Celular(String imei, String marca, String modelo, Bateria bateria, Usuario2 usuario) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
        this.usuario = usuario;
        usuario.setCelular(this);
    }

    public Usuario2 getUsuario() { return usuario; }
    public Bateria getBateria() { return bateria; }
}
