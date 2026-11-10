
import java.util.Scanner;

/**
 * Ejercicio 05: "Año Bisiesto: Comprobar si un año ingresado es bisiesto o no.
 * Si es bisiesto, muestra un mensaje especial."
 * @author Edison, Jostyn
 * @version 1.0
 */
public class Ejercicio05_AñoBisiesto {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("ingresa un año ");
        int anio = tcl.nextInt();
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("El año " + anio + "es bisiesto. ");
            System.out.println("¡mensaje especial! Febrero tiene 29 dias este año. ");
        } else {
            System.out.println("El año " + anio + "no es bisiesto. ");
        }
        
    }
    
}
/***
 * EVIDENCIA DEL RUN:
 * Pegue aquí la evidencia de la ejecución del .java
 */