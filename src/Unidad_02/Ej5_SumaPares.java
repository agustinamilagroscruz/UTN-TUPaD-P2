package Unidad_02;

import java.util.Scanner;

public class Ej5_SumaPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumaPares = 0;
        int numero;

        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = sc.nextInt();
            if (numero != 0 && numero % 2 == 0) {
                sumaPares += numero;
            }
        } while (numero != 0);

        System.out.println("La suma de los números pares es: " + sumaPares);
    }
}