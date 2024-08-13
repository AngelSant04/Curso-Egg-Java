// Crea un menú interactivo con 5 opciones para que el usuario elija, como por ejemplo:
// Comprar producto.
// Realizar devolución.
// Ver mis pedidos.
// Preguntas frecuentes.
// Salir.
// Luego, solicita al usuario que elija una opción del menú mostrado en pantalla. 
// El menú debe seguir apareciendo hasta que el usuario elija la opción para salir del programa.
// En este ejercicio, no es necesario que las opciones del menú realicen acciones reales, 
// simplemente muestra un mensaje que indique qué opción eligió el usuario.

import java.util.Scanner;

public class Bucles_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("=== Menú Principal ===");
            System.out.println("1. Comprar producto");
            System.out.println("2. Realizar devolución");
            System.out.println("3. Ver mis pedidos");
            System.out.println("4. Preguntas frecuentes");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción (1-5): ");

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Has elegido comprar producto.");
                    break;
                case 2:
                    System.out.println("Has elegido realizar devolución.");
                    break;
                case 3:
                    System.out.println("Has elegido ver tus pedidos.");
                    break;
                case 4:
                    System.out.println("Has elegido ver preguntas frecuentes.");
                    break;
                case 5:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción del 1 al 5.");
                    break;
            }
        } while (option != 5);

        // Cerrar el scanner
        scanner.close();
    }
}
