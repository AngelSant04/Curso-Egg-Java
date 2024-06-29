import java.sql.Date;
import java.util.Scanner;

public class MiPrimerPrograma {
    public static void main(String[] args) {

        Scanner pepe = new Scanner(System.in);

        // CLASE 01
        // boolean bandera = false;
        // char letra = 'a';
        // String nombre = "Angel";
        // int edad = 24;
        // long edadMayor = 600;
        // float decimal = (float) 600.46;
        // System.out.println("Bienvenido a tu curso de Java");
        // System.out.println("Mi nombre es " + nombre);
        // System.out.println("Mi edad es: " + edad);
        // System.out.println("Mi edad de mayor es: " + edadMayor);

        // System.out.print("Por favor Ingrese su edad: ");
        // edad = pepe.nextInt();
        // pepe.nextLine();
        // System.out.print("Por favor Ingrese un nombre: ");
        // nombre = pepe.nextLine();
        // System.out.println("La edad Ingresada es: " + edad);
        // System.out.println("El nombre ingresado es: " + nombre);

        // CLASE 02

        // int num1;
        // int num2;
        // boolean esMayor = false;

        // System.out.print("Por favor ingrese un Numero: ");
        // num1 = pepe.nextInt();
        // System.out.print("Por favor ingrese un Numero 2 : ");
        // num2 = pepe.nextInt();

        // if (num1 == num2) {
        //     System.out.println("Los numero ingresados son iguales.");
        // } else {
        //     if (num1 > num2) {
        //         esMayor = true;
        //     } else {
        //         esMayor = false;
        //     }
        //     System.out.println("El número " + num1 + " es mayor a " + num2 + "? = "+ esMayor);
        // }

        // if (num1%2 == 0) {
        //     System.out.println("El primer numero que ingreso si es divisble entre dos.");
        // } else {
        //     System.out.println("El primer numero que ingreso no es divisble entre dos.");
        // }

        // int num3;
        // int num4;

        // System.out.print("Por favor ingrese un Numero 3: ");
        // num3 = pepe.nextInt();
        // System.out.print("Por favor ingrese un Numero 4 : ");
        // num4 = pepe.nextInt();

        // if ((num1 > num2) && (num3 > num4)) {
        //     System.out.println("El numero " + num1 + " es mayor que el numero " + num2 + " y el numero " + num3 + " es mayor al numero "+ num4);
        // }

        // if ((num1 > num2) || (num3 > num4)) {
        //     System.out.println("El numero " + num1 + " es mayor que el numero " + num2 + " o el numero " + num3 + " es mayor al numero "+ num4);
        // }

        
        // System.out.println("La suma de los numero es: " + (num1+num2));
        // System.out.println("La resta de los numero es: " + (num1-num2));
        // System.out.println("La multiplicacion de los numero es: " + (num1*num2));
        // System.out.println("La division de los numero es: " + (num1/num2));
        // System.out.println("El resto de la division de los numero es: " + (num1%num2));

        // CLASE 02 - EJERCICIOS PROPUESTOS

        // EJERCICIO 01
        // final int ANIO_ACTUAL = 2024;

        // int anioNacimiento;

        // System.out.print("Por favor ingrese su año de nacimiento: ");
        // anioNacimiento = pepe.nextInt();

        // int calculoEdad = ANIO_ACTUAL - anioNacimiento;

        // if (calculoEdad >= 18) {
        //     System.out.println("Usted es mayor de edad.");
        // } else {
        //     System.out.println("Usted es menor de edad.");
        // }

        //EJERCICIO 02
        // int base;
        // int altura;

        // System.out.print("Por favor ingrese el valor de la base: ");
        // base = pepe.nextInt();
        // System.out.print("Por favor ingrese el valor de la altura: ");
        // altura = pepe.nextInt();

        // System.out.println("El perimetro del rectangulo es: " + (2*base + 2*altura));
        // System.out.println("El area del rectangulo es: " + (base*altura));

        // EJERCICIO 03
        int num;

        System.out.print("Por favor ingrese un numero: ");
        num = pepe.nextInt();
        
        if (num%2 == 0) {
            System.out.println("Este numero es par.");
        } else {
            System.out.println("Este numero es impar.");
        }
    }
}