package Unidad_05;
public class EditorVideo {
    public void exportar(String formato, Proyecto proyecto) {
        Render render = new Render(formato, proyecto);
        System.out.println("Proyecto exportado: " + render.getProyecto().getNombre());
        System.out.println("Formato: " + render.getFormato());
    }
}
