import java.util.Scanner;

/**
 * ObjetosArray
 */
public class ObjetosArray {

    public static void main(String[] args) {
        // Escribe un programa en el cual se cree una variable de tipo array que
        // contenga tres
        // elementos de tipo entero. El programa debe sumar los tres elementos de forma
        // manual e
        // imprimir por consola el resultado utilizando solamente las herramientas
        // adquiridas hasta el momento.
        int[] arrayInteger = { 5, 7, 8 };
        System.out.println("La suma de los elementos es: " + (arrayInteger[0] + arrayInteger[1] + arrayInteger[2]));

        // Escribe un programa en el cual se cree una variable de tipo array que
        // contenga cuatro elementos de
        // tipo entero. Estos elementos deben ser ingresados por el usuario. El programa
        // debe sumar y promediar
        // los cuatro elementos de forma manual e imprimir por consola el resultado,
        // utilizando solamente las
        // herramientas adquiridas hasta el momento.

        Scanner scan = new Scanner(System.in);

        // int[] arrIntegerUser = new int[4];

        // try {
        // System.out.println("Ingrese Primer Elemento del Array: ");
        // arrIntegerUser[0] = scan.nextInt();
        // System.out.println("Ingrese Segundo Elemento del Array: ");
        // arrIntegerUser[1] = scan.nextInt();
        // System.out.println("Ingrese Tercer Elemento del Array: ");
        // arrIntegerUser[2] = scan.nextInt();
        // System.out.println("Ingrese Cuarto Elemento del Array: ");
        // arrIntegerUser[3] = scan.nextInt();

        // System.out.println("El promedio de estos elementos son: "
        // + String.format("%.2f",((arrIntegerUser[0] + arrIntegerUser[1] +
        // arrIntegerUser[2] + arrIntegerUser[3])/(double)arrIntegerUser.length)));

        // } catch (Exception e) {
        // System.out.println("Error: " + e);
        // }

        // Escribe un programa en el cual se cree una variable de tipo array que
        // contenga
        // cinco elementos de tipo entero, ingresados por el usuario. El programa debe
        // buscar el
        // máximo e imprimir por consola el resultado utilizando solamente las
        // herramientas adquiridas hasta el momento.

        // int[] arrIntegerUser = new int[5];

        // try {
        // System.out.println("Ingrese Primer Elemento del Array: ");
        // arrIntegerUser[0] = scan.nextInt();
        // System.out.println("Ingrese Segundo Elemento del Array: ");
        // arrIntegerUser[1] = scan.nextInt();
        // System.out.println("Ingrese Tercer Elemento del Array: ");
        // arrIntegerUser[2] = scan.nextInt();
        // System.out.println("Ingrese Cuarto Elemento del Array: ");
        // arrIntegerUser[3] = scan.nextInt();
        // System.out.println("Ingrese Quinto Elemento del Array: ");
        // arrIntegerUser[4] = scan.nextInt();

        // int max = arrIntegerUser[0];

        // if (max < arrIntegerUser[1]) {
        // max = arrIntegerUser[1];
        // }
        // if (max < arrIntegerUser[2]) {
        // max = arrIntegerUser[2];
        // }
        // if (max < arrIntegerUser[3]) {
        // max = arrIntegerUser[3];
        // }
        // if (max < arrIntegerUser[4]) {
        // max = arrIntegerUser[4];
        // }

        // System.out.println("El mayor valor ingresado es: " + max);

        // } catch (Exception e) {
        // System.out.println("Error: " + e);
        // }

        // El programa debe crear un array de tamaño 3 que almacene números enteros.
        // Luego, solicita un número
        // al usuario y muestra por consola si ese número está presente en el array o
        // no. Es importante utilizar
        // únicamente las herramientas aprendidas hasta el momento, sin emplear bucles
        // en el proceso.

        // int[] arrInt = { 5, 6, 7 };
        // int valor;

        // try {
        //     System.out.println("Ingrese un Numero: ");
        //     valor = scan.nextInt();

        //     boolean isPresent = false;

        //     if (valor == arrInt[0]) {
        //         isPresent = true;
        //     } else if (valor == arrInt[1]) {
        //         isPresent = true;
        //     } else if (valor == arrInt[2]) {
        //         isPresent = true;
        //     }
        //     if (isPresent) {
        //         System.out.println("El número " + valor + " está presente en el array.");
        //     } else {
        //         System.out.println("El número " + valor + " no está presente en el array.");
        //     }

        // } catch (Exception e) {
        //     System.out.println("Error: " + e);
        // }

        // Desarrolla un programa que inicie creando un array de 3 enteros, con valores predeterminados. Posteriormente, 
        // genera una copia del mismo con una extensión de 2 elementos adicionales.
        // Solicita al usuario que ingrese dos números para ser almacenados en las nuevas posiciones del array.
        // Finalmente, muestra por consola el contenido del nuevo array.
        // Es esencial emplear exclusivamente las herramientas aprendidas hasta el momento, evitando el uso de bucles en el proceso.
        // int[] originalArray = {10, 20, 30};

        // int[] expandedArray = new int[5];
        // expandedArray[0] = originalArray[0];
        // expandedArray[1] = originalArray[1];
        // expandedArray[2] = originalArray[2];
        // System.out.println("Ingrese dos números enteros para añadir al array:");

        // try {
        //     System.out.print("Primer número: ");
        //     expandedArray[3] = Integer.parseInt(scan.nextLine());

        //     System.out.print("Segundo número: ");
        //     expandedArray[4] = Integer.parseInt(scan.nextLine());
        // } catch (NumberFormatException e) {
        //     System.out.println("Entrada inválida, por favor ingrese un número entero.");
        //     scan.close();
        //     return;
        // }

        // System.out.println("El contenido del nuevo array es: ");
        // System.out.println(expandedArray[0] + ", " + expandedArray[1] + ", " + expandedArray[2] + ", " + expandedArray[3] + ", " + expandedArray[4]);


        // Generando un número aleatorio entre dos límites

        // Escribe un programa en el que se cree una variable de tipo array que contenga seis elementos de tipo entero.
        // El programa debe contar la cantidad de elementos pares presentes en el array y mostrar el resultado por 
        // consola utilizando solo las herramientas aprendidas hasta el momento.

        // int[] arrNum = {10,22,34,56,13,76};
        // int count = 0;

        // if (arrNum[0]%2 == 0) {
        //     count++;
        // }
        // if (arrNum[1]%2 == 0) {
        //     count++;
        // }
        // if (arrNum[2]%2 == 0) {
        //     count++;
        // }
        // if (arrNum[3]%2 == 0) {
        //     count++;
        // }
        // if (arrNum[4]%2 == 0) {
        //     count++;
        // }
        // if (arrNum[5]%2 == 0) {
        //     count++;
        // }
        // System.out.println("La cantidad de numeros pares es: " + count);

        scan.close();

    }
}