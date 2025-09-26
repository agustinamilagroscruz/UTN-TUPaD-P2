package Unidad_05;
public class MainEj5 {
    public static void main(String[] args) {
        PlacaMadre placa = new PlacaMadre("Asus ROG", "Z790");
        Propietario5 propietario = new Propietario5("Martín López", "34567890");
        Computadora computadora = new Computadora("Dell", "SN123456", placa, propietario);

        System.out.println("Propietario de la computadora: " + computadora.getPropietario().getNombre());
        System.out.println("Modelo de la placa madre: " + computadora.getPlacaMadre().getModelo());
    }
}
