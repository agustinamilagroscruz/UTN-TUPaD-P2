package Unnidad_08;

import java.util.Scanner;

public class ConversionNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ingrese un número entero: ");
            String texto = sc.nextLine();
            int valor = Integer.parseInt(texto);
            System.out.println("Número ingresado: " + valor);
        } catch (NumberFormatException e) {
            System.out.println("Error: el texto ingresado no es un número entero válido.");
        } finally {
            sc.close();
        }
    }
}