package Unidad_02;

import java.util.Scanner;

public class Ej1_AnioBisiesto {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Ingresá un año: ");
        int anio = Scanner.nextInt();

        if ((anio % 4 == 0 && anio %100 != 0) || (anio % 400 == 0)) {
            System.out.println("El año " + anio + " es bisiesto");
        } else {
            System.out.println("El año " + anio + " no es bisiesto.");
        }
    }
}
