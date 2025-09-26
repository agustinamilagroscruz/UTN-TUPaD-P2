package Unidad_05;
public class FirmaDigital {
    private String codigoHash;
    private String fecha;
    private Usuario8 usuario;

    public FirmaDigital(String codigoHash, String fecha, Usuario8 usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    public Usuario8 getUsuario() { return usuario; }
    public String getCodigoHash() { return codigoHash; }
}
