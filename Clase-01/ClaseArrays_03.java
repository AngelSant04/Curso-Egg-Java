
// Actividad: Copiando parte de un arreglo. 
// Crea un programa en Java que declare y muestre un arreglo de enteros junto con sus índices.
// Luego, solicita al usuario dos índices: un índice inicial y un índice final. Con estos dos índices,
//  copia la parte del arreglo original comprendida entre ellos (inclusive) en un nuevo arreglo utilizando 
// el método Arrays.copyOfRange(). Asegúrate de incluir validaciones para confirmar que el índice inicial es 
// menor que el índice final y que ambos índices están dentro del rango válido del arreglo original. 
// Finalmente, imprime el nuevo arreglo por consola.

// Actividad: Rellenando un arreglo
// El método fill() de la clase Arrays cambia todos los elementos en un arreglo por un valor estático, 
// desde el índice start (por defecto 0) hasta el índice end (por defecto array.length) y devuelve el arreglo 
// modificado. Vamos a escribir un programa que solicite al usuario el tamaño para un arreglo y un número entero 
// con el que quiera rellenarlo. Luego crea el arreglo y utiliza Arrays.fill(). Finalmente, imprime el arreglo resultante.

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ClaseArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Parte 1: Copiar parte de un arreglo
        int[] arregloOriginal = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        System.out.println("Arreglo original:");
        for (int i = 0; i < arregloOriginal.length; i++) {
            System.out.println("Índice " + i + ": " + arregloOriginal[i]);
        }

        int indiceInicial = -1;
        int indiceFinal = -1;
        boolean indicesValidos = false;

        while (!indicesValidos) {
            try {
                System.out.print("Introduce el índice inicial: ");
                indiceInicial = scanner.nextInt();
                System.out.print("Introduce el índice final: ");
                indiceFinal = scanner.nextInt();

                // Validar los índices
                if (indiceInicial < 0 || indiceFinal >= arregloOriginal.length || indiceInicial > indiceFinal) {
                    System.out.println(
                            "Índices inválidos. Asegúrate de que el índice inicial sea menor que el índice final y que ambos índices estén dentro del rango válido.");
                } else {
                    indicesValidos = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Introduce números enteros.");
                scanner.next(); // Limpiar el buffer del scanner
            }
        }
        int[] arregloCopia = Arrays.copyOfRange(arregloOriginal, indiceInicial, indiceFinal + 1);
        System.out.println("Nuevo arreglo copiado:");
        for (int i = 0; i < arregloCopia.length; i++) {
            System.out.println("Índice " + i + ": " + arregloCopia[i]);
        }

        // Parte 2: Rellenar un arreglo con un valor estático
        int tamañoArreglo = -1;
        int valorRelleno = -1;
        boolean datosValidos = false;

        while (!datosValidos) {
            try {
                System.out.print("Introduce el tamaño del nuevo arreglo: ");
                tamañoArreglo = scanner.nextInt();
                System.out.print("Introduce el valor con el que rellenar el arreglo: ");
                valorRelleno = scanner.nextInt();

                if (tamañoArreglo <= 0) {
                    System.out.println("El tamaño del arreglo debe ser un número positivo.");
                } else {
                    datosValidos = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Introduce números enteros.");
                scanner.next(); // Limpiar el buffer del scanner
            }
        }

        int[] arregloRelleno = new int[tamañoArreglo];
        Arrays.fill(arregloRelleno, valorRelleno);

        System.out.println("Arreglo rellenado:");
        for (int i = 0; i < arregloRelleno.length; i++) {
            System.out.println("Índice " + i + ": " + arregloRelleno[i]);
        }

        // Parte 3: Rellenando un arreglo de manera personalizada

        // Escribe un programa en Java que realice lo siguiente:
        // Solicita al usuario un tamaño para un arreglo.
        // Luego, pídele que ingrese un número con el que desea rellenar el array.
        // Solicita el índice hasta el cual quiere rellenar el array con el número
        // anterior.
        // El array deberá ser rellenado con el número proporcionado hasta el índice
        // ingresado por el usuario.

        // Asegúrate de validar lo siguiente:
        // La primera vez que se pide al usuario un número para rellenar el arreglo, el
        // índice inicial debe ser 0.
        // Si el índice ingresado no es el índice del último elemento del arreglo, el
        // programa debe continuar pidiendo al usuario nuevos números e índices para rellenar el arreglo.
        // El índice siempre debe ser menor que el tamaño total del arreglo.
        // Cada vez que se solicita un nuevo número para rellenar el arreglo, el índice ingresado debe ser mayor que el
        // último índice ingresado; a su vez, se debe rellenar el array con el nuevo
        // número desde el índice anterior hasta el nuevo índice.
        // Por último, el programa debe imprimir por consola el arreglo completo.

        int tamañoArregloComplementario = -1;
        while (tamañoArregloComplementario <= 0) {
            try {
                System.out.print("Introduce el tamaño del arreglo: ");
                tamañoArregloComplementario = scanner.nextInt();
                if (tamañoArregloComplementario <= 0) {
                    System.out.println("El tamaño del arreglo debe ser un número positivo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Introduce un número entero.");
                scanner.next(); // Limpiar el buffer del scanner
            }
        }

        int[] arreglo = new int[tamañoArregloComplementario];

        int últimoÍndice = -1;
        boolean completado = false;

        while (!completado) {
            int numeroRelleno = -1;
            int índiceFinal = -1;

            while (numeroRelleno <= 0) {
                try {
                    System.out.print("Introduce el número para rellenar el arreglo: ");
                    numeroRelleno = scanner.nextInt();
                    if (numeroRelleno <= 0) {
                        System.out.println("El número debe ser positivo.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida. Introduce un número entero.");
                    scanner.next(); // Limpiar el buffer del scanner
                }
            }

            // Solicitar el índice hasta el cual se desea rellenar
            while (índiceFinal <= últimoÍndice || índiceFinal >= tamañoArregloComplementario) {
                try {
                    System.out.print("Introduce el índice final hasta el cual quieres rellenar el arreglo (debe ser mayor que el último índice ingresado): ");
                    índiceFinal = scanner.nextInt();
                    if (índiceFinal <= últimoÍndice) {
                        System.out.println("El índice final debe ser mayor que el último índice ingresado.");
                    } else if (índiceFinal >= tamañoArregloComplementario) {
                        System.out.println("El índice final debe ser menor que el tamaño del arreglo.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida. Introduce un número entero.");
                    scanner.next(); // Limpiar el buffer del scanner
                }
            }

            // Rellenar el arreglo con el número proporcionado
            for (int i = últimoÍndice + 1; i <= índiceFinal; i++) {
                arreglo[i] = numeroRelleno;
            }

            últimoÍndice = índiceFinal;

            // Verificar si se ha completado el llenado del arreglo
            if (últimoÍndice == tamañoArregloComplementario - 1) {
                completado = true;
            }
        }

        // Imprimir el arreglo completo
        System.out.println("Arreglo completo:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Índice " + i + ": " + arreglo[i]);
        }

        scanner.close();
    }
}
