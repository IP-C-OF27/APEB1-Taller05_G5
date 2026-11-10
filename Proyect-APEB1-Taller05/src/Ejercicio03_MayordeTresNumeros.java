
import java.util.Scanner;

/**
 * Ejercicio 03: "Mayor de tres números: Dados tres números distintos, determine
 * cuál es el mayor."
 * @author Edison, Jostyn
 * @version 1.0
 */
public class Ejercicio03_MayordeTresNumeros {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Ingresa el primer numero ");
        double a = tcl.nextDouble();
        System.out.println("Ingresa el segundo numero ");
        double b = tcl.nextDouble();
        System.out.println("Ingresa el tercer numero ");
        double c = tcl.nextDouble();
        double mayor;
        if (a > b && a > c) {
            mayor = a;
        }else if (b > c) {
            mayor = b;
        }else {
            mayor = c;
        } 
    }    
}

/***
 * EVIDENCIA DEL RUN:
 * Pegue aquí la evidencia de la ejecución del .java
 */