
import java.util.Scanner;

/**
 * Ejercicio 04: "Descuento en Compras: Calcular el precio final de un producto
 * con un descuento del 10% si el precio original es mayor de $100 ; De lo
 * contrario, no hay descuento."
 * @author Edison, Jostyn
 * @version 1.0
 */
public class Ejercicio04_DescuentoEnCompras {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese el precio original del producto: $ ");
        double precio = tcl.nextDouble();
        double precioFinal;
        if (precio > 100 ) {
            double descuento = precio * 0.10;
            precioFinal = precio - descuento;
            System.out.print("Si tiene descuento del 10%: $ " + descuento );
        } else {
            precioFinal = precio;
            System.out.print("No tiene descuento: ");
        }
        System.out.print("Precio final: $ " + precioFinal);
    }
    
}
/***
 * EVIDENCIA DEL RUN:
 * rum:
 * Ingrese el precio original del producto $ 200
 * Si tiene descuento del 10%: $ 20.0Precio final: $ 180.0BUILD SUCCESSFUL
 * (total time: 9 seconds)
 */