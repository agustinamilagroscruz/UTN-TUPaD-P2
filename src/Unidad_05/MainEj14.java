package Unidad_05;
public class MainEj14 {
    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("Video Tutorial", 15);
        EditorVideo editor = new EditorVideo();
        editor.exportar("MP4", proyecto);
    }
}
