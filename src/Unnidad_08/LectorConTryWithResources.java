package Unnidad_08;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LectorConTryWithResources {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("archivo.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error de lectura/escritura: " + e.getMessage());
        }
    }
}