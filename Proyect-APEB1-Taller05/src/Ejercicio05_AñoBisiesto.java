
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
        System.out.print("ingresa un año: ");
        int anio = tcl.nextInt();
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.print("El año " + anio + "es bisiesto: ");
            System.out.print("¡mensaje especial! Febrero tiene 29 dias este año: ");
        } else {
            System.out.print("El año " + anio + "no es bisiesto: ");
        }
        
    }
    
}
/***
 * EVIDENCIA DEL RUN:
 * run:
 * ingresa un a�o 4
 * El a�o 4es bisiesto. �mensaje especial! Febrero tiene 29 dias este a�o.
 * BUILD SUCCESSFUL (total time: 12 seconds)
 */