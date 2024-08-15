import java.util.Arrays;

public class ClaseArrays {
    public static void main(String[] args) {
        int[] original = { 1, 2, 3 };
        System.out.println(original.length);
        System.out.println(Arrays.toString(original));
        original = Arrays.copyOf(original, 10);
        System.out.println(original.length);
        System.out.println(Arrays.toString(original));
        // ======================================================================================================
        int[] arr = { 1, 2, 3, 4, 5 };
        int index = Arrays.binarySearch(arr, 3);
        System.out.println(index); // Imprime el indice donde esta ubicado el 3
        // ======================================================================================================
        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = { 1, 2, 3 };
        boolean isEqual = Arrays.equals(arr1, arr2);
        System.out.println(isEqual);// Devuelve true si los arreglos son iguales
        // ======================================================================================================
        int[] arrFill = new int[5];
        Arrays.fill(arrFill, 1);
        System.out.println(Arrays.toString(arrFill)); // Todos los elementos del arreglo son ahora 1
        // ======================================================================================================
        int[] originalParaCopia = {1, 2, 3, 4, 5};
        int[] copia = Arrays.copyOf(originalParaCopia, originalParaCopia.length);
        System.out.println(Arrays.toString(copia)); //Crea una copia del arreglo original
        int[] parteDeUnaCopia= Arrays.copyOfRange(originalParaCopia, 1, 3);
        System.out.println(Arrays.toString(parteDeUnaCopia)); //Crea una copia de una parte del arreglo original (índices 1 a 2 - El tercer parámetro no es inclusivo)
    }
}
