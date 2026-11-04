
import java.util.Scanner;

/**
 * Ejercicio 01: "Edad para Votar: Determinar si una persona es elegible para
 * votar en función de su edad (mayor o igual a 16 años)."
 * @author Edison, Jostyn
 * @version 1.0
 */

public class Ejercicio01_LejibleVotacion {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int edad;
        System.out.println("Dame edad ");
        edad = tcl.nextInt();
        if (edad >= 16)
            System.out.println("Lejible para votas ");
        else
            System.out.println("No Lejible para votar ");
    }
}

/***
 * EVIDENCIA DEL RUN:
 * Pegue aquí la evidencia de la ejecución del .java
 */