
import java.util.Scanner;

/**
 * Ejercicio 11: Pedidos online: "Desarrollar una solución que imprima el costo
 * de un pedido de un artículo del cual se tiene la descripción, la cantidad que
 * se requiere y el precio unitario. Si la cantidad pedida excede de 50
 * unidades, se hace un descuento de 15%."
 * @author Jostyn, Edison
 * @version 1.0
 */
public class Ejercicio11_PedidosOnline {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Deme la descripcion del articulo: ");
        String descripcion = tcl.nextLine();
        System.out.print("Deme la cantidad: ");
        int cantidad = tcl.nextInt();
        System.out.print("Deme el precio unitario: ");
        double precio = tcl.nextDouble();
        //PROCESO
        double subtotal = cantidad * precio;
        double descuento = 0;
        if (cantidad > 50) {
            descuento = subtotal * 0.15;
        }
        double total = subtotal - descuento;
        //DATOS DE SALIDA
        System.out.println("Articulo: " + descripcion);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Descuento: " + descuento);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Total a pagar:  " + total);
    }
}
/*
 * EVIDENCIA DEL RUN
 *
 * run:
 * Deme la descripcion del articulo:
 * Lapiz
 * Deme la cantidad:
 * 60
 * Deme el precio unitario:
 * 10
 * Articulo: Lapiz
 * Cantidad: 60
 * Subtotal: 600.0
 * Descuento: 90.0
 * Total a pagar: 510.0
 * BUILD SUCCESSFUL
 */