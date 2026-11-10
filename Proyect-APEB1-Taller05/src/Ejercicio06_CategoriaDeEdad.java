
import java.util.Scanner;

/**
 * Ejercicio 01: "Categoría de Edad: Clasificar a una persona en una categoría
 * de edad (niño, adolescente, adulto) en función de su edad."
 * @author Edison, Jostyn
 * @version 1.0
 */
public class Ejercicio06_CategoriaDeEdad {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int edad = tcl.nextInt();
        if (edad > 0) {
            System.out.println("La edad no es valida ");
        } else if (edad <= 12) {
            System.out.println("Categoria: niño ");
        } else if (edad <= 17) {
            System.out.println("Categoria: adolescente ");
        } else {
            System.out.println("Categoria: adulto ");
            
        }
    }
    
}
/***
 * EVIDENCIA DEL RUN:
 * Pegue aquí la evidencia de la ejecución del .java
 */