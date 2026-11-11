
import java.util.Scanner;

/**
 * Ejercicio 13: "En una hostería de la ciudad de Loja se hace un descuento del
 * 10% si el cliente se hospeda más de 5 días, del 15% si se hospeda más de 10
 * días y del 20% si se hospeda más de 15 días. Elaborar una solución que pida
 * el número de días y el precio diario de la habitación y luego calcule e
 * imprima el subtotal por pagar, el descuento y el total por pagar."
 * @author Jostyn, Edison
 * @version 1.0
 */
public class Ejercicio13_ReservasHoteleras {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        // DATOS DE ENTRADA
        System.out.print("Deme el numero de dias: ");
        int dias = tcl.nextInt();
        System.out.print("Deme el precio diario de la habitacion: ");
        double precioDiario = tcl.nextDouble();
        // PROCESO
        double subtotal = dias * precioDiario;
        double porcentaje;
        if (dias > 15) {
            porcentaje = 0.20;
        } else if (dias > 10) {
            porcentaje = 0.15;
        } else if (dias > 5) {
            porcentaje = 0.10;
        } else {
            porcentaje = 0;
        }
        double descuento = subtotal * porcentaje;
        double total = subtotal - descuento;
        // DATOS DE SALIDA
        System.out.println("Subtotal por pagar: " + subtotal);
        System.out.println("Descuento: " + descuento);
        System.out.println("Total por pagar: " + total);
    }
}
/*
 * EVIDENCIA DEL RUN
 *
 * run:
Deme el numero de dias: 12
Deme el precio diario de la habitacion: 40
Subtotal por pagar: 480.0
Descuento: 72.0
Total por pagar: 408.0
BUILD SUCCESSFUL (total time: 8 seconds)
 */