import java.util.Scanner;

public class SentenciaIfElse {
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        // int num;

        // System.out.print("Por favor ingrese un numero entre el 0 y el 100: ");
        // num = scan.nextInt();

        //EJERCICION UNO

        // if (num > 0) {
        //     System.out.println("El numero " + num + " es mayor que 0");
        // } else if (num == 0) {
        //     System.out.println("El numero " + num + " es 0");

        // } else {
        //     System.out.println("El numero " + num + " es menor que 0");
        // }

        //EJERCICIO DOS
        // if (num > 100 || num < 0) {
        //     System.out.println("Respuesta no esta en el rango.");
        // } else if (num < 60) {
        //     System.out.println("F");
        // } else if (num <= 69){
        //     System.out.println("D");
        // } else if (num <= 79) {
        //     System.out.println("C");
        // } else if (num <= 89) {
        //     System.out.println("B");
        // } else {
        //     System.out.println("A");
        // }

        //EJERCICIO TRES
        // if(num%5 == 0 && num%3 == 0) {
        //     System.out.println("El número es divisible por 3 y 5 a la vez.");
        // } else if(num%5 == 0){
        //     System.out.println("El número es divisible por 5.");
        // } else if (num%3 == 0) {
        //     System.out.println("El número es divisible por 3.");
        // } else {
        //     System.out.println("El número no es divisible ni por 5 ni por 3.");
        // }

        //EJERCICIO CUATRO
        // String passwordPredefinido = "12345";

        // Scanner scan = new Scanner(System.in);
        // String password;

        // System.out.print("Por favor ingrese una contraseña: ");
        // password = scan.next();

        // if (passwordPredefinido.equals(password)) {
        //     System.out.println("Acceso Concedido");
        // } else {
        //     System.out.println("Acceso Denegado");
        // }

        //EJERCICIO CINCO
        Scanner scan = new Scanner(System.in);
        int num;

        System.out.print("Por favor ingrese el precio de un producto: ");
        num = scan.nextInt();

        if (num >= 100) {

            System.out.println("Tienes Descuento");
            System.out.println("=====================");
            double precio = 0;
            precio = num - (0.1*num);
            System.out.println("Precio a pagar " + precio);
            
        }
    }
}
