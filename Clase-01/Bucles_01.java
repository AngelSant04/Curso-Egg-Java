// Actividad: Imprimiendo elementos
// Escribe un programa que recorra un array de enteros y muestre cada elemento en una línea separada. 
// El tamaño, tipo de datos y la información a contener pueden ser de tu elección.

// Actividad: Encontrando el valor mínimo 
// Escribe un programa que recorra un array de enteros y encuentre el valor mínimo presente en el array.
//  El tamaño y los números  a contener pueden ser de tu elección.

// Actividad: Imprimiendo elementos en orden inverso
// Escribe un programa que recorra un array de enteros y los imprima en orden inverso, comenzando desde el último elemento.
// El tamaño y los números  a contener pueden ser de tu elección.


// Invertir un array

// Escribe un programa que recorra un array de enteros y lo invierta, es decir, que el primer elemento se convierta 
// en el último y viceversa, luego imprime el array resultante por consola. 
// El tamaño y los números  a contener pueden ser de tu elección.

// IMPORTANTE: Debes invertir de forma permanente el orden de los elementos.
//  Analiza si necesitas hacer uso de elementos auxiliares para concluir el ejercicio. 

// Calcular suma acumulada:

// Escribe un programa que recorra un array de enteros y  calcule la suma acumulada de los elementos,
// reemplazando cada elemento por la suma acumulada hasta ese punto.El tamaño y los números a contener pueden ser de tu elección.

public class Bucles_01 {
    public static void main(String[] args) {

        int[] array = { 3, 5, 2, 8, 1, 4 };

        System.out.println("Elementos del array:");
        printArray(array);

        int minValue = findMin(array);
        System.out.println("El valor mínimo en el array es: " + minValue);

        System.out.println("Elementos del array en orden inverso:");
        printArrayInReverse(array);
        
        
        System.out.println("Invertir Array:");
        invertArray(array);
        System.out.println("Array invertido:");
        printArray(array);

        int[] cumulativeSumArray = calculateCumulativeSum(array);
        System.out.println("Array con suma acumulada:");
        printArray(cumulativeSumArray);
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.println(num);
        }
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static void printArrayInReverse(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }

    public static void invertArray(int[] array) {
        int start = 0;
        int end = array.length - 1;
        // int[] array = { 3, 5, 2, 8, 1, 4 };
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static int[] calculateCumulativeSum(int[] array) {
        int[] cumulativeSumArray = new int[array.length];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            cumulativeSumArray[i] = sum;
        }
        return cumulativeSumArray;
    }
}
