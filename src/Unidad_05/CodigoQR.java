package Unidad_05;
public class CodigoQR {
    private String valor;
    private Usuario13 usuario;

    public CodigoQR(String valor, Usuario13 usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }

    public String getValor() { return valor; }
    public Usuario13 getUsuario() { return usuario; }
}
