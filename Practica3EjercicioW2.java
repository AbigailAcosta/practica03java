import java.util.Scanner;

/**
 * Practica3EjercicioW2
 * 
 * @author Abigail Acosta
 */
public class Practica3EjercicioW2 {
    public static void main(String[] args) {
        //variables
        Scanner scanner = new Scanner(System.in);
        String usuario;
        String usuarioCorrecto = "admin";
        int pin;
        int pinCorrecto = 1234567;
        int correcto = 0;
        System.out.println("Acceso al sistema ");

        //entrada
        while (correcto <= 0) {
            System.out.print("Ingrese usuario: ");
            usuario = scanner.nextLine();
            System.out.print("Ingrese PIN: ");
            pin = scanner.nextInt();

            //verificar
            if((usuario.equals(usuarioCorrecto)) && (pin==pinCorrecto)) {
                correcto= 1;
            }
            System.out.println("Usuario y/o pin incorrecto! ");
            scanner.nextLine();//reset string
        }
        System.out.println("Bienvenidos al sistema! ");
        scanner.close();
    }
}
