
import java.util.Scanner;

/**
 * Ejercicio 09: "Ordenamiento de Tres Números: Dados tres números, ordenarlos
 * en orden ascendente."
 * @author Jostyn, Edison
 * @version 1.0
 */
public class Ejercicio09_OrdenTresNumeros {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int a = tcl.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int b = tcl.nextInt();
        System.out.print("Ingrese el terecer numero: ");
        int c = tcl.nextInt();
        int orden;
        if (a <= b && b <= c) {
            orden = 1;
        } else if (a <= c && c <= b) {
            orden = 2;
        } else if (b <= a && a <= c) {
            orden = 3;
        } else if (b <= c && c <= a) {
            orden = 4;
        } else if (c <= a && a <= b) {
            orden = 5;
        } else {
            orden = 6;
        }
        String resultado;
        switch (orden) {
            case 1:
                resultado = a + ", " + b + ", " + c;
                break;
            case 2:
                resultado = a + ", " + c + ", " + b;
                break;
            case 3:
                resultado = b + ", " + a + ", " + c;
                break;
            case 4:
                resultado = b + ", " + c + ", " + a;
                break;
            case 5:
                resultado = c + ", " + a + ", " + b;
                break;
            default:
                resultado = c + ", " + b + ", " + a;
                break;
        }
        System.out.println("El orden ascendete es: " + resultado);
    }
}
/*
 * EVIDENCIA DEL RUN
 *
 * run:
Ingrese el primer numero: 4
Ingrese el segundo numero: 2
Ingrese el terecer numero: 8
El orden ascendete es: 2, 4, 8
BUILD SUCCESSFUL (total time: 7 seconds)
 */