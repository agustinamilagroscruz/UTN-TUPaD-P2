package Unidad_05;

public class MainEj3 {
    public static void main(String[] args) {
        Autor autor = new Autor("Gabriel García Márquez", "Colombiana");
        Editorial editorial = new Editorial("Editorial Planeta", "Calle Falsa 123");
        Libro libro = new Libro("Cien Años de Soledad", "978-3-16-148410-0", autor, editorial);

        System.out.println("Libro: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor().getNombre());
        System.out.println("Editorial: " + libro.getEditorial().getNombre());
    }
}


