import java.util.InputMismatchException;
import java.util.Scanner;

public class SentenciaTryCatch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Ejercicio 01
        // int dividendo;
        // int divisor;
        // try {
        // System.out.print("Ingrese el dividendo: ");
        // dividendo = scan.nextInt();
        // System.out.print("Ingrese el dividendo: ");
        // divisor = scan.nextInt();
        // try {
        // System.out.println("El resultado de la división es: " + dividendo / divisor);
        // } catch (ArithmeticException e) {
        // System.out.println("No se puede divider entre 0: " + e.getMessage());
        // }
        // } catch (InputMismatchException e) {
        // System.out.println("Usted Ingreso Caracter y debe ingresar numero: " +
        // e.getMessage());
        // }

        // Ejercicio 02
        // int num1;
        // int num2;
        // try {
        //     System.out.print("Ingrese el dividendo: ");
        //     num1 = scan.nextInt();
        //     System.out.print("Ingrese el dividendo: ");
        //     num2 = scan.nextInt();

        //     System.out.println("El resultado de la resta es: " + (num1 - num2));
        // } catch (InputMismatchException e) {
        //     System.out.println("Usted Ingreso Caracter y debe ingresar numero: " + e.getMessage());
        // }

        // Ejercicio 03
        String str;
        try {
            System.out.print("Ingrese un numero como cadena: ");
            str = scan.next();
            System.out.print("La cadena se convirtio a int: " + Integer.parseInt(str));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
