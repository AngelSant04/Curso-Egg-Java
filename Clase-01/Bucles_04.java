// Escribe un programa que genere un número aleatorio entre 1 y 20, y muestra por 
// consola un mensaje pidiéndote que adivines ese número utilizando un bucle do-while. 
// El programa te indicará si el número que ingresas es mayor o menor que el número aleatorio,
//  y seguirá pidiéndote que adivines hasta que lo hagas correctamente.

import java.util.Random;
import java.util.Scanner;

public class Bucles_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(20) + 1;
        int guess;

        System.out.println("He generado un número entre 1 y 20. ¡Intenta adivinarlo!");

        do {
            System.out.print("Introduce tu adivinanza: ");
            guess = scanner.nextInt();

            if (guess < randomNumber) {
                System.out.println("El número es mayor que " + guess + ". Inténtalo de nuevo.");
            } else if (guess > randomNumber) {
                System.out.println("El número es menor que " + guess + ". Inténtalo de nuevo.");
            } else {
                System.out.println("¡Felicidades! Has adivinado el número.");
            }
        } while (guess != randomNumber);

        scanner.close();
    }
}
