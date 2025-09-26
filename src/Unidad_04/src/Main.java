//TRABAJO PRÁCTICO Nº1 PROGRAMACIÓN II

//Alumno: Agustina
//Apellido: Cruz.
//Materia: Programación II.
//Profesor: Ariel Enferrel.
//Fecha: 08/08/2025

/**Respuestas:
 1)
 a. Verificaciones de JDK y Netbeans realizadas con éxito.
 b. Proyecto creado y configurado en modo oscuro para uso posterior.
 c. Captura de pantalla hecha y configuración del entorno realizado (en el PDF).
 2)
 a. Creación de la clase llamada HolaMundo.
 public class HolaMundo {
 public static void main(String[] args) {

 }
 b. Programa que imprime el mensaje: ¡Hola, Java!
 public class HolaMundo {
 public static void main(String[] args) {
 System.out.println("¡Hola, Java!");
 }
 c. El resultado de la ejecución del programa en la consola de NetBeans se muestra adjuntado en el (PDF).
 3) Creación del proyecto "TrabajoPractico01" y declaración de las siguientes variables con sus respectivos valores asignados:
 public class Variables {
 public static void main(String[] args) {
 String nombre = "Agustina";
 int edad = 23;
 double altura = 1.65;
 boolean estudiante = true;
 4) Creé un programa que solicita al usuario su nombre y su edad, y luego los muestra por pantalla, utilizando la clase Scanner para capturar los datos ingresados.
 import java.util.Scanner;

 public class DatosUsuario {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);

 System.out.print("Ingresa tu nombre: ");
 String nombre = scanner.nextLine();

 System.out.print("Ingresa tu edad: ");
 int edad = scanner.nextInt();

 System.out.println("Nombre: " + nombre);
 System.out.println("Edad: " + edad);
 }
 5)
 Creé un programa que le solicita al usuario que ingrese dos números enteros y realice con ello las siguientes operaciones:
 a. Suma
 b. Resta
 c. Multiplicación
 d. División
 import java.util.Scanner;

 public class Operaciones {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);

 System.out.print("Ingresa el primer número: ");
 int num1 = scanner.nextInt();

 System.out.print("Ingresa el segundo número: ");
 int num2 = scanner.nextInt();

 int suma = num1 + num2;
 int resta = num1 - num2;
 int multiplicacion = num1 * num2;
 int division = num1 / num2;

 System.out.println("Suma: " + suma);
 System.out.println("Resta: " + resta);
 System.out.println("Multiplicación: " + multiplicacion);
 System.out.println("División: " + division);
 }

 6) Creé un programa que muestra el siguiente mensaje
 Nombre: Juan Pérez
 Edad: 30 años
 Dirección: "Calle Falsa 123"
 Utilizando los caracteres de escape (\n, \") en System.out.println().

 public class DatosConEscape {
 public static void main(String[] args) {
 System.out.println("Nombre: Juan Pérez\nEdad: 30 años\nDirección: \"Calle Falsa 123\"");
 }

 7. Para esta consigna analicé el siguiente código y respondí a las siguientes
 preguntas:
 ¿Cuáles son expresiones y cuáles son instrucciones?
 Explica la diferencia en un breve párrafo.
 int x = 10; // Línea 1
 x = x + 5; // Línea 2
 System.out.println(x); // Línea 3

 7. En el código dado, las líneas 1 y 2 son instrucciones porque cada una
 ejecuta una acción dentro del programa. La línea 1, int x = 10;, es una
 instrucción que declara una variable llamada x y le asigna el valor 10.
 Dentro de esta instrucción, 10 es una expresión, ya que representa un valor
 concreto. Por otro lado, la línea 2, x = x + 5;, también es una instrucción
 porque actualiza el valor almacenado en x sumándole 5; en esta instrucción,
 x + 5 es una expresión que calcula el resultado de esa suma. la línea 3,
 system.out.println(x);, es una instrucción que indica que el programa debe
 mostrar el valor actual de x en la pantalla.

 En términos generales, una expresión es cualquier fragmento de código que
 se evalúa para producir un valor, como un número, una operación
 matemática o una llamada a función que retorna un dato.
 por otro lado, una instrucción es una orden completa que realiza una acción
 en el programa, como declarar variables, asignar valores, o imprimir
 resultados. por lo tanto, las instrucciones pueden contener expresiones,
 pero no todas las expresiones constituyen una instrucción por sí mismas.

 8) Creé un programa utilizando conversiones de tipo y división en Java.
 En donde el programa consta en dividir dos numeros enteros ingresados por
 el usuario. Luego, modifiqué el codigo para hacer el respectivo casteo de int
 a double para poder hacer operaciones y comparar los resultados.
 a. Para este punto escribí un programa que divide numeros enteros
 ingresados por el usuario.
 import java.util.Scanner;

 public class DivisionEnteros {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);

 System.out.print("Ingresa el primer número entero: ");
 int num1 = scanner.nextInt();

 System.out.print("Ingresa el segundo número entero: ");
 int num2 = scanner.nextInt();

 int resultado = num1 / num2;

 System.out.println("Resultado de la división entera: " + resultado);
 }
 b. En este punto modifiqué el código para usar double en lugar de int y
 comparar los resultados.
 Al realizar la comparación noté que, cuando la división se hace con dos
 variables enteras (int), el resultado también es un número entero.
 Esto significa que, si la operación tiene parte decimal, esta se descarta sin
 redondeo; es decir, se pierde y solo queda la parte entera. Por eso, en el
 caso de 7 ÷ 2, el resultado es 3.
 En cambio, cuando realicé el casteo de int a double antes de la división
 (double) num1 / num2;, el cálculo se efectuó en coma flotante, lo que
 permitió conservar la parte decimal del resultado.
 De esta manera, 7 ÷ 2 dio 3.5. En conclusión la división con enteros trunca
 el resultado, mientras que la división con double mantiene el valor exacto
 incluyendo los decimales.
 package trabajopractico01;

 import java.util.Scanner;

 public class TrabajoPractico01 {

 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);

 int num1, num2;
 int divisiónEntera;
 double divisiónDecimal;

 System.out.println("Ingrese el primer número entero:    ");
 num1 = Integer.parseInt(scanner.nextLine());

 System.out.println("Ingrese el segundo número entero:    ");
 num2 = Integer.parseInt(scanner.nextLine());

 //División como enteros (pierde decimales).
 divisiónEntera = num1 / num2;

 //División con decimales (casteo a Double)
 divisiónDecimal = (double) num1 / num2;
 System.out.println("Resultado de la división entera (sin decimales): " + divisiónEntera);
 System.out.println("Resultado de la división mostrando decimales: " + divisiónDecimal);
 }
 9)
 El código original usaba scanner.nextInt() para leer el nombre del usuario,
 pero ese método solo sirve para leer números enteros, no texto. Por eso,
 cuando intentaba guardar el valor leído en una variable de tipo String,
 el programa no funcionaba correctamente.
 Para corregirlo, reemplacé scanner.nextInt() por scanner.nextLine(), que es
 el método adecuado para leer una línea completa de texto y devolver un
 String.
 Así, el programa puede capturar correctamente el nombre que ingresa el
 usuario y mostrarlo sin problemas.
 10) Tabla de Prueba de Escritorio completada del siguiente código:
 public class PruebaEscritorio {
 public static void main(String[] args) {
 int a = 5;
 int b = 2;
 int resultado = a / b;
 System.out.println("Resultado: " + resultado);
 }
 }

 Líneaa	Instrucción	Valor de A	Valor de B	Resultado	Explicación
 1	int a = 5;	5	<Sin_definir>	<Sin_definir>	Se inicializa A con el valor 5.

 2	int b = 2;
 5	2	<Sin_definir>	Se inicializa b con el valor 2.

 3	int resultado = a / b;
 5	2	2	Se realiza la división entera 5 / 2, que da 2 (descartando el resto).

 4	System.out.println("Resultado: " + resultado);
 5	2	2	Se imprime "Resultado: 2" en la consola.


 El valor de resultado es 2. Esto ocurre porque en Java, cuando se realiza
 una división entre dos enteros (int), el resultado es un entero y el resto se
 descarta.
 En este caso, a / b es 5 / 2, que matemáticamente da 2.5, pero como
 ambos operandos son int, el resultado se trunca a 2, lo que se conoce
 como división entera.
 Muestro el resultado en consola en NetBeans utilizando la herramienta de
 depuración (Debug Project) para observar paso a paso el valor de las
 variables durante la ejecución del programa.
 **/