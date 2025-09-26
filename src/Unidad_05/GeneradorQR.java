package Unidad_05;
public class GeneradorQR {
    public void generar(String valor, Usuario13 usuario) {
        CodigoQR codigo = new CodigoQR(valor, usuario);
        System.out.println("Código QR generado para: " + codigo.getUsuario().getNombre());
        System.out.println("Valor del QR: " + codigo.getValor());
    }
}
