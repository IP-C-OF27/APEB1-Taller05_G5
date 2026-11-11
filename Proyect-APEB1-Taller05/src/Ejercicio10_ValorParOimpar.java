
import java.util.Scanner;

/**
 * Ejercicio 10: Valores pares o impares: Dado un valor entero ingresado por
 * teclado (positivo o negativo), determinar si se trata de un valor par o
 * impar."
 * @author Jostyn, Edison
 * @version 1.0
 */
public class Ejercicio10_ValorParOimpar {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        int numero = tcl.nextInt();
        //PROCESO: el residuo de dividir entre 2
        int residuo = numero % 2;
        // DATOS DE SALIDA 
        if (residuo == 0) {
            System.out.println("El numero: " + numero + " es par");
        } else {
            System.out.println("El numero: " + numero + " es impar");
        }
    }
}
/*
 * EVIDENCIA DEL RUN
 *
 * run:
 * Deme un numero entero:
 * Ingrese un numero entero:  8
*  El numero: 8 es par
BUILD SUCCESSFUL (total time: 3 seconds)
*run2: 
Ingrese un numero entero: 3
El numero: 3 es impar
BUILD SUCCESSFUL (total time: 3 seconds)
 */