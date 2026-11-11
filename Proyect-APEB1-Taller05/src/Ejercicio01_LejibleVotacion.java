
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
        System.out.print("Dame edad ");
        edad = tcl.nextInt();
        if (edad >= 16)
            System.out.print("Lejible para votas ");
        else
            System.out.print("No Lejible para votar ");
    }
}

/***
 * EVIDENCIA DEL RUN:
 * rum:
 * Dame edad 20
 * Lejible para votas BUILD SUCCESSFUL (total time: 14 seconds)
 */