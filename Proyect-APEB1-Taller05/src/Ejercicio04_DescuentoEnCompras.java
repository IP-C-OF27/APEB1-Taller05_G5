
import java.util.Scanner;

/**
 * Ejercicio 01: "Descuento en Compras: Calcular el precio final de un producto
 * con un descuento del 10% si el precio original es mayor de $100 ; De lo
 * contrario, no hay descuento."
 * @author Edison, Jostyn
 * @version 1.0
 */
public class Ejercicio04_DescuentoEnCompras {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Ingrese el precio original del producto $ ");
        double precio = tcl.nextDouble();
        double precioFinal;
        if (precio > 100 ) {
            double descuento = precio * 0.10;
            precioFinal = precio - descuento;
            System.out.println("Si tiene descuento del 10%: $ " + descuento );
        } else {
            precioFinal = precio;
            System.out.println("No tiene descuento ");
        }
        System.out.println("Precio final: $ " + precioFinal);
    }
    
}
/***
 * EVIDENCIA DEL RUN:
 * Pegue aquí la evidencia de la ejecución del .java
 */