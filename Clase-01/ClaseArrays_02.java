// Actividad: Ordenar en forma descendente
// Escribe un programa en el que declares una variable de tipo array que contenga 10
// elementos de tipo entero. Inicializa el arreglo con valores aleatorios entre 1 y 100, imprime por consola 
// el arreglo inicial y luego ordenalo en forma descendente utilizando el método Arrays.sort(). Finalmente, 
// imprime los elementos ordenados en la consola.

// Actividad: Búsqueda binaria
// La búsqueda binaria es un algoritmo eficiente para encontrar un elemento en una lista ordenada de elementos. 
// La clase Arrays ya incluye su implementación mediante el método binarySearch(). Escribe un programa que realice 
// una búsqueda binaria en un arreglo ordenado de enteros utilizando el método Arrays.binarySearch(). El programa debe imprimir el 
// arreglo generado originalmente, solicitar al usuario el valor buscado e imprimir el índice del valor buscado si está presente en el arreglo.

// Actividad: Comparando arreglos
// Escribe un programa que compare dos arreglos de enteros utilizando el método Arrays.equals(). El programa debe imprimir si los arreglos son iguales o no.

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ClaseArrays_02 {
    public static void main(String[] args) {
        // Actividad: Ordenar en forma descendente
        Integer[] array = new Integer[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100) + 1;
        }
        System.out.println("Arreglo original:");
        printArray(array);
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("\nArreglo ordenado en forma descendente:");
        printArray(array);

        // Actividad: Búsqueda binaria
        Arrays.sort(array);
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nArreglo ordenado en forma ascendente (para búsqueda binaria):");
        printArray(array);

        System.out.print("\nIngrese el valor a buscar: ");
        int valueToSearch = scanner.nextInt();

        // Realizar la búsqueda binaria
        int index = Arrays.binarySearch(array, valueToSearch);

        // Imprimir el resultado de la búsqueda
        if (index >= 0) {
            System.out.println("El valor " + valueToSearch + " se encuentra en el índice: " + index);
        } else {
            System.out.println("El valor " + valueToSearch + " no se encuentra en el arreglo.");
        }

        // Actividad: Comparando arreglos
        Integer[] anotherArray = new Integer[10];
        for (int i = 0; i < anotherArray.length; i++) {
            anotherArray[i] = (int) (Math.random() * 100) + 1;
        }

        System.out.println("\nOtro arreglo para comparar:");
        printArray(anotherArray);

        if (Arrays.equals(array, anotherArray)) {
            System.out.println("Los arreglos son iguales.");
        } else {
            System.out.println("Los arreglos son diferentes.");
        }

        scanner.close();
    }

    private static void printArray(Integer[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
