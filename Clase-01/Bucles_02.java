// Actividad: Contando Elementos Pares
// Escribe un programa que genere un array de 10 elementos de tipo entero.
// Inicializa cada elemento con un número aleatorio menor a 100 y luego imprime todos los elementos del
// array en una única línea. Posteriormente, recorre el array para contar los elementos pares 
// y muestra el total en la consola.

// Actividad: Calculando el promedio 
// Genera un array de 20 elementos de tipo float, inicializándolo con los números de tu elección.
// Luego, suma todos los elementos del array y calcula su promedio. Finalmente, muestra por consola
// tanto el resultado de la suma como el promedio de los elementos.Te sugerimos implementar el uso 
// de la sintaxis de for-each.

// Actividad: Concatenando elementos
// Crea un array del tamaño que prefieras que contenga elementos de tipo cadena. Luego, concatena los 
// elementos en una sola cadena, separados por espacios, e imprime el resultado por consola.

// Contar ocurrencias

// Escribe un programa que cree un array de 50 elementos de tipo carácter, 
// inicializándolo con una frase elegida. Luego, solicita al usuario un carácter objetivo y cuenta
// cuántas veces aparece ese carácter en el array. Finalmente, imprime el resultado por consola.

import java.util.Random;
import java.util.Scanner;

public class Bucles_02 {
    public static void main(String[] args) {
        // Actividad: Contando Elementos Pares
        int[] randomArray = new int[10];
        Random random = new Random();

        System.out.println("Array de números aleatorios:");
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(100); // Números aleatorios menores a 100
            System.out.print(randomArray[i] + " ");
        }
        System.out.println();

        int evenCount = countEvenElements(randomArray);
        System.out.println("Número de elementos pares: " + evenCount);

        // Actividad: Calculando el promedio
        float[] floatArray = new float[20];
        float sum = 0;

        System.out.println("Array de números flotantes:");
        for (int i = 0; i < floatArray.length; i++) {
            floatArray[i] = (float) (Math.random() * 100); // Números flotantes entre 0 y 100
            System.out.print(floatArray[i] + " ");
            sum += floatArray[i];
        }
        System.out.println();

        float average = sum / floatArray.length;
        System.out.println("Suma de los elementos: " + sum);
        System.out.println("Promedio de los elementos: " + average);

        // Actividad: Concatenando elementos
        String[] stringArray = { "Java", "es", "un", "lenguaje", "de", "programación" };
        String concatenatedString = concatenateArray(stringArray);
        System.out.println("Cadena concatenada: " + concatenatedString);

        // Actividad Complementaria: Contar ocurrencias
        char[] charArray = "aprendiendo java".toCharArray();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un carácter para contar su ocurrencia: ");
        char targetChar = scanner.next().charAt(0);

        int occurrences = countCharOccurrences(charArray, targetChar);
        if (occurrences > 0) {
            System.out.println("El carácter \"" + targetChar + "\" aparece " + occurrences + " veces.");
        } else {
            System.out.println("El carácter \"" + targetChar + "\" no aparece en la frase.");
        }

        scanner.close();
    }

    // Método para contar elementos pares
    public static int countEvenElements(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    // Método para concatenar elementos de un array de cadenas
    public static String concatenateArray(String[] array) {
        StringBuilder sb = new StringBuilder();
        for (String s : array) {
            sb.append(s).append(" ");
        }
        return sb.toString().trim();
    }

    // Método para contar ocurrencias de un carácter
    public static int countCharOccurrences(char[] array, char target) {
        int count = 0;
        for (char c : array) {
            if (c == target) {
                count++;
            }
        }
        return count;
    }
}
