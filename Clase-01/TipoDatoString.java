import java.util.Scanner;

/**
 * TipoDatoString
 */
public class TipoDatoString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // EJERCCICIO 01
        // String str;
        // try {
        // System.out.print("Ingrese una Cadena de Texto: ");
        // str = scan.next();
        // System.out.println("La longitud es: " + str.length());
        // } catch (Exception e) {
        // System.out.println(e.getMessage());
        // }
        // EJERCICIO 02
        // String nombre;
        // String apellido;
        // try {
        // System.out.print("Ingrese su nombre: ");
        // nombre = scan.next();
        // System.out.print("Ingrese su apellido: ");
        // apellido = scan.next();
        // System.out.println("Su nombre completo es: " + nombre.concat("
        // ").concat(apellido));
        // } catch (Exception e) {
        // System.out.println(e.getMessage());
        // }
        // EJERCICIO 03
        // String frase;
        // int numInicial;
        // int numFinal;
        // try {
        // System.out.print("Ingrese una frase: ");
        // frase = scan.nextLine();
        // System.out.print("Ingrese un numero inicial: ");
        // numInicial = scan.nextInt();
        // System.out.print("Ingrese un numero final: ");
        // numFinal = scan.nextInt();
        // System.out.println("La frase cortada es: " + frase.subSequence(numInicial,
        // numFinal));
        // } catch (Exception e) {
        // System.out.println(e.getMessage());
        // }
        // EJERCICIO 04
        // String frase;
        // char caracter;
        // try {
        // System.out.print("Ingrese una frase: ");
        // frase = scan.nextLine();
        // System.out.print("Ingrese un caracter: ");
        // caracter = scan.next().charAt(0);
        // int index = frase.indexOf(caracter);
        // System.out.println("El índice de "+ caracter +" es: " + index);
        // } catch (Exception e) {
        // System.out.println(e.getMessage());
        // }
        // EJERCICIO 05
        // String frase;
        // try {
        // System.out.print("Ingrese una frase: ");
        // frase = scan.nextLine();
        // System.out.println("Frase en Mayusculas: " + frase.toUpperCase());
        // System.out.println("Frase en Minusculas: " + frase.toLowerCase());
        // } catch (Exception e) {
        // System.out.println(e.getMessage());
        // }
        // EJERCICIO 06
        // String frase;
        // char caracterUno;
        // char caracterDos;
        // try {
        //     System.out.print("Ingrese una frase: ");
        //     frase = scan.nextLine();
        //     System.out.print("Ingrese un caracter a reemplazar: ");
        //     caracterUno = scan.next().charAt(0);
        //     System.out.print("Ingrese un caracter de reemplazo: ");
        //     caracterDos = scan.next().charAt(0);

        //     System.out.println("Nueva frase es: " + frase.replace(caracterUno, caracterDos));
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }
        // EJERCICIO 07
        String frase;
        try {
            System.out.print("Ingrese una frase: ");
            frase = scan.nextLine();
            
            String cadenaSinEspacios = frase.replace(" ", "");

            System.out.println("La longitud de la cadena sin contar los espacios en blanco es: " + cadenaSinEspacios.length());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}