package Unidad_02;

import java.util.Scanner;

public class Ej7_ValidacionNota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;

        do {
            System.out.print("Ingrese una nota (0-10): ");
            nota = sc.nextDouble();
            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
        } while (nota < 0 || nota > 10);

        System.out.println("Nota guardada correctamente.");
    }
}