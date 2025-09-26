package Unidad_05;
public class MainEj8 {
    public static void main(String[] args) {
        Usuario8 usuario = new Usuario8("Laura Morales", "laura@email.com");
        FirmaDigital firma = new FirmaDigital("ABC123HASH", "2025-09-26", usuario);
        Documento documento = new Documento("Contrato", "Contenido del contrato", firma);

        System.out.println("Documento firmado por: " + documento.getFirma().getUsuario().getNombre());
        System.out.println("Código de la firma: " + documento.getFirma().getCodigoHash());
    }
}
