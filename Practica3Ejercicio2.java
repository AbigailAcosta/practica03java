import java.util.Scanner;

/**
 * Practica3 - Ejercicio2 -FOR2
 * */
public class Practica3Ejercicio2 {
    public static void main(String[] args) {
        //variables
        Scanner scanner = new Scanner(System.in);
        int tabla, result;
        //entrada
        System.out.print(" Que tabla desea mostrar? ");
        tabla = scanner.nextInt();
        System.out.println(" *************************** ");
        System.out.println(" Mostrando tabla del " + tabla);
        System.out.println(" *************************** " );
        //bucle
        for (int i= 1; i < 11; i++) {
            result=i*tabla;
            System.out.println(tabla + " x " + i + " = " + result);
        }
        scanner.close();
    }
}
