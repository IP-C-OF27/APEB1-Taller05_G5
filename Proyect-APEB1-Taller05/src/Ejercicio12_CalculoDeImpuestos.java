
import java.util.Scanner;

/**
 * Ejercicio 12: "Calculo de impuestos: Desarrollar una solución que permita
 * leer los datos de un automóvil (marca, origen y costo) imprima el impuesto
 * por pagar y el precio de venta (incluido el impuesto). Si el origen es
 * Alemania el impuesto es 20%, si es de Japón el impuesto es 30%, si es de
 * Italia, 15%, y si es de USA, 8%"
 * @author Jostyn, Edison
 * @version 1.0
 */
public class Ejercicio12_CalculoDeImpuestos {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        // DATOS DE ENTRADA
        System.out.print("Deme la marca del automovil: ");
        String marca = tcl.nextLine();
        System.out.print("Deme el origen (Alemania, Japon, Italia, USA): ");
        String origen = tcl.next();
        System.out.print("Deme el costo: ");
        double costo = tcl.nextDouble();
        // PROCESO
        double porcentaje;
        switch (origen) {
            case "Alemania":
                porcentaje = 0.20;
                break;
            case "Japon":
                porcentaje = 0.30;
                break;
            case "Italia":
                porcentaje = 0.15;
                break;
            case "USA":
                porcentaje = 0.08;
                break;
            default:
                porcentaje = -1; // origen que no esta en la lista
                break;
        }
        // DATOS DE SALIDA
        if (porcentaje < 0) {
            System.out.println("El origen ingresado no es valido");
        } else {
            double impuesto = costo * porcentaje;
            double precioVenta = costo + impuesto;
            System.out.println("Marca: " + marca);
            System.out.println("Origen: " + origen);
            System.out.println("Impuesto por pagar: " + impuesto);
            System.out.println("Precio de venta: " + precioVenta);
        }
    }
}
/*
 * EVIDENCIA DEL RUN
 *
 * run:
Deme la marca del automovil: Toyota
Deme el origen (Alemania, Japon, Italia, USA): Japon
Deme el costo: 49.990
Marca: Toyota
Origen: Japon
Impuesto por pagar: 14997.0
Precio de venta: 64987.0
BUILD SUCCESSFUL (total time: 14 seconds)
 */