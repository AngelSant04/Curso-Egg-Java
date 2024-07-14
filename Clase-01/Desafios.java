import java.util.Scanner;

public class Desafios {
    public static void main(String[] args) {
        // Desafio 01
        // Scanner scan = new Scanner(System.in);
        // try {
        //     System.out.println("---Conversion de Temperatura---");
        //     System.out.println("Ingrese una Temperatura: ");
        //     double temperatura = scan.nextDouble();
        //     System.out.println("Ingrese Unidad de Medida: 1- Celsius  2- Fahrenheit ");
        //     int op = scan.nextInt();
        //     if (op < 1 || op > 2) {
        //         System.out.println("Opcion no Valida");
        //     } else {
        //         System.out.println("La unidad convertida a " + (op == 1 ? "Fahrenheit" : "Celsius") + "es "
        //                 + (op == 1 ? ((temperatura * 9 / 5) + 32) : ((temperatura - 32) * 5 / 9)));
        //     }
        // } catch (Exception e) {
        //     System.out.println( "Error: " + e.getMessage() + " no se puede ingresar un string en numerico");
        // }
        
        //Desafio 02
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("---Contraseña Segura---");
            System.out.println("Ingrese una Contraseña: ");
            String password = scan.next();
            if (esContrasenaSegura(password)) {
                System.out.println("La contraseña es segura.");
            } else {
                System.out.println("La contraseña no es segura.");
            }
        } catch (Exception e) {
            System.out.println( "Error: " + e.getMessage());
        };
    }

    public static boolean esContrasenaSegura(String contrasena) {
        if (contrasena.length() < 8) {
            return false;
        }

        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;
        boolean tieneNumero = false;
        boolean tieneEspecial = false;

        for (int i = 0; i < contrasena.length(); i++) {
            char c = contrasena.charAt(i);

            if (Character.isUpperCase(c)) {
                tieneMayuscula = true;
            } else if (Character.isLowerCase(c)) {
                tieneMinuscula = true;
            } else if (Character.isDigit(c)) {
                tieneNumero = true;
            } else if (esCaracterEspecial(c)) {
                tieneEspecial = true;
            }

            if (tieneMayuscula && tieneMinuscula && tieneNumero && tieneEspecial) {
                return true;
            }
        }

        return false;
    };

    public static boolean esCaracterEspecial(char c) {
        String caracteresEspeciales = "!@#$%^&*()-_=+[]{}|;:'\",.<>?/\\`~";
        return caracteresEspeciales.indexOf(c) >= 0;
    };
}
