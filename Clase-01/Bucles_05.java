// Escribe un programa que te pida que ingreses un número entero y utilice un bucle 
// while para calcular la cantidad de dígitos de ese número. Por ejemplo, el número 
// 4578 tiene 4 dígitos. El programa debe tener en cuenta que el 0 tiene una cifra y
// también contar las cifras de números negativos.

import java.util.Scanner;

public class Bucles_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero: ");
        int number = scanner.nextInt();

        int digitCount = countDigits(number);

        System.out.println("El número " + number + " tiene " + digitCount + " dígitos.");

        scanner.close();
    }

    public static int countDigits(int number) {
        // Valor absoluto para los negativos
        int absoluteNumber = Math.abs(number);

        // Si el número es 0, tiene 1 dígito
        if (absoluteNumber == 0) {
            return 1;
        }

        int count = 0;
        while (absoluteNumber > 0) {
            absoluteNumber /= 10;
            count++;
        }
        return count;
    }
}
