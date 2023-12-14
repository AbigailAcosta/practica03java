/**
 * @author Abigail Acosta
 */
public class Practica3Ejercicio21 {
    
    public static void main(String[] args) {
            //variables
            int tabla, result;
            //bucle 1
            for(tabla =1; tabla < 11; tabla++) {

            //salida
            System.out.println(" *************************** ");
            System.out.println(" Mostrando tabla del " + tabla);
            System.out.println(" *************************** ");
            //bucle 2
            for (int i= 1; i < 11; i++) {
                result=i*tabla;
                System.out.println(tabla + " x " + i + " = " + result);
            }
        }
    }
}

