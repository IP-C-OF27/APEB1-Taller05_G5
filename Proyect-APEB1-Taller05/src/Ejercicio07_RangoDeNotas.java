
import java.util.Scanner;

/**
 * Ejercicio 07: "Rango de Notas: Asignar una letra (A, B, C, D) a una
 * calificación en función de su rango (A para 90-100, B para 80-89, etc.) ."
 * @author Edison, Jostyn
 * @version 1.0
 */
public class Ejercicio07_RangoDeNotas {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingresa la calificacion (0-100): ");
        double nota = tcl.nextDouble();
        if (nota < 0 || nota > 100) {
            System.out.print("La calificacion no es valida ");
        } else if (nota >= 90) {
            System.out.print("Letra A: ");
        } else if (nota >= 80) {
            System.out.print("Letra B: ");
        } else if (nota >= 70) {
            System.out.print("Letra C: ");
        } else {
            System.out.print("Letra D: ");
        }
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
 * Ingresa la calificacion (0-100): 70
 * Letra C BUILD SUCCESSFUL (total time: 9 seconds)
 */