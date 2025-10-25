package Unnidad_08;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LectorArchivo {
    public static void main(String[] args) {
        try {
            File archivo = new File("archivo.txt");
            Scanner sc = new Scanner(archivo);

            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: el archivo no existe o no se puede abrir.");
        }
    }
}