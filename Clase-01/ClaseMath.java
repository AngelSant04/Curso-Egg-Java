import java.util.Scanner;

public class ClaseMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, ingresa un número uno entero para sacar valor absoluto:");
        int numero = scanner.nextInt();
        System.out.println("Por favor, ingresa un número dos decimal para redondear:");
        double numeroDecimal = scanner.nextDouble();
        int numeroAleatorio = (int) Math.floor(Math.random() * 355) + 1; //El Math.random no incluye al 1 uno
        System.out.println("El valor absoluto del número uno es: " + Math.abs(numero));
        System.out.println("El número dos redondeado es: " + Math.round(numeroDecimal));
        System.out.println("El número aleatorio generado de 1-355 es: " + numeroAleatorio);
    }
}
