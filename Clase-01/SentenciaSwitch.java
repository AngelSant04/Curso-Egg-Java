import java.util.Scanner;

public class SentenciaSwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // int num;
        int op;

        // System.out.print("Ingrese el dia de la semana en número(1-7): ");
        // System.out.print("Ingrese un número del 1-5: ");
        // num = scan.nextInt();
        // EJERCICIO 01
        // if (num < 0 || num > 7) {
        // System.out.println("El numero ingresado no es correcto.");
        // } else {
        // String dia = switch (num) {
        // case 1 -> "Lunes";
        // case 2 -> "Martes";
        // case 3 -> "Miercoles";
        // case 4 -> "Jueves";
        // case 5 -> "Viernes";
        // case 6 -> "Sabado";
        // case 7 -> "Domingo";
        // default -> "No existe";
        // };

        // System.out.println("El dia es: "+ dia);
        // }

        // EJERCICIO 02
        // if (num < 0 || num > 5) {
        // System.out.println("El numero ingresado no es correcto.");
        // } else {
        // String dia = switch (num) {
        // case 1 -> "Muy Deficiente";
        // case 2 -> "Deficiente";
        // case 3 -> "Suficiente";
        // case 4 -> "Notable";
        // case 5 -> "Sobresaliente";
        // default -> "No existe";
        // };

        // System.out.println("La descripcion es: "+ dia);
        // }

        // EJERCICIO 03
        // System.out.println("------MENUS------");
        // System.out.println("=================");
        // System.out.println("1- Guardar");
        // System.out.println("2- Cargar");
        // System.out.println("3- Salir");

        // System.out.println("Ingrese una Opcion: ");
        // op = scan.nextInt();

        // switch (op) {
        // case 1:
        // System.out.println("La Opcion Seleccionada es Guardar");
        // break;
        // case 2:
        // System.out.println("La Opcion Seleccionada es Cargar");
        // break;
        // case 3:
        // System.out.println("La Opcion Seleccionada es Salir");
        // break;

        // default:
        // break;
        // }

        // EJERCICIO 04
        System.out.println("------FIGURAS------");
        System.out.println("===================");
        System.out.println("1- Circulo");
        System.out.println("2- Cuadrado");
        System.out.println("3- Triángulo");

        System.out.println("Ingrese una Opcion: ");
        op = scan.nextInt();

        System.out.println("-----CALCULO DE AREA-----");
        switch (op) {
            case 1: {
                int radio;
                System.out.println("Ingrese el Radio: ");
                radio = scan.nextInt();
                System.out.println("El Area del Circulo es: " + radio * radio);
            }
                break;
            case 2: {
                int lado;
                System.out.println("Ingrese el Lado: ");
                lado = scan.nextInt();
                System.out.println("El Area del Cuadrado es: " + lado * lado);
            }
                break;
            case 3: {
                int base;
                int altura;
                System.out.println("Ingrese la Base: ");
                base = scan.nextInt();
                System.out.println("Ingrese la Altura: ");
                altura = scan.nextInt();
                System.out.println("El Area del Triangulo es: " + (base*altura)/2);
            }
                break;
            default:
                System.out.println("No existe esa Opcion");
                break;
        }

    }
}
