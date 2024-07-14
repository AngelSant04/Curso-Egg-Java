import java.util.Scanner;

public class ClaseMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // PARTE 01
        // System.out.println("Por favor, ingresa un número uno entero para sacar valor absoluto:");
        // int numero = scanner.nextInt();
        // System.out.println("Por favor, ingresa un número dos decimal para redondear:");
        // double numeroDecimal = scanner.nextDouble();
        // int numeroAleatorio = (int) Math.floor(Math.random() * 355) + 1; //El Math.random no incluye al 1 uno
        // System.out.println("El valor absoluto del número uno es: " + Math.abs(numero));
        // System.out.println("El número dos redondeado es: " + Math.round(numeroDecimal));
        // System.out.println("El número aleatorio generado de 1-355 es: " + numeroAleatorio);
        // PARTE 02
        System.out.println("Por favor, ingresa la base de la operacion:");
        double base = scanner.nextInt();
        System.out.println("Por favor, ingresa un exponente:");
        double exponente = scanner.nextInt();
        System.out.println("Por favor, ingrese un numero para sacar su raiz cuadrada:");
        double num1 = scanner.nextInt();
        System.out.println("Por favor, ingrese un numero de inicio:");
        double inicio = scanner.nextInt();
        System.out.println("Por favor, ingrese un numero de fin:");
        double fin = scanner.nextInt();

        System.out.println("El resultado es: " + Math.pow(base, exponente));
        if (num1 <= 0) {
            System.out.println("No se puede sacar raiz cuadrada al numero: " + num1);
        } else {
            System.out.println("El resultado de la raiz cuadrada es: " + Math.sqrt(num1));
        }
        System.out.println("El numero aleatorio generado entre "+ inicio + " y " + fin + " es: " + (Math.random() * (fin - inicio + 1)) + inicio);
    }
}
