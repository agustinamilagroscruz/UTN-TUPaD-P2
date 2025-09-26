package Unidad_02;

import java.util.Scanner;

public class Ej4_DescuentoCategoria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        sc.nextLine();
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        String cat = sc.nextLine().trim().toUpperCase();

        double porcentaje = 0.0;
        boolean categoriaValida = true;

        switch (cat) {
            case "A": porcentaje = 10.0; break;
            case "B": porcentaje = 15.0; break;
            case "C": porcentaje = 20.0; break;
            default: categoriaValida = false; break;
        }

        if (!categoriaValida) {
            System.out.println("Categoría inválida.");
        } else {
            double descuento = precio * (porcentaje / 100.0);
            double precioFinal = precio - descuento;
            System.out.println("Precio original: " + precio);
            System.out.println("Descuento aplicado: " + (int) porcentaje + "%");
            System.out.println("Precio final: " + precioFinal);
        }
    }
}
