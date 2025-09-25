package Unidad_02;

import java.util.Scanner;

public class Ej8_PrecioFinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = sc.nextDouble();

        System.out.print("Ingrese el impuesto en porcentaje: ");
        double impuestoPorc = sc.nextDouble();

        System.out.print("Ingrese el descuento en porcentaje: ");
        double descuentoPorc = sc.nextDouble();

        double precioFinal = calcularPrecioFinal(precioBase, impuestoPorc, descuentoPorc);
        System.out.println("El precio final del producto es: " + precioFinal);
    }

    public static double calcularPrecioFinal(double precioBase, double impuestoPorc, double descuentoPorc) {
        double impuesto = precioBase * (impuestoPorc / 100.0);
        double descuento = precioBase * (descuentoPorc / 100.0);
        return precioBase + impuesto - descuento;
    }
}