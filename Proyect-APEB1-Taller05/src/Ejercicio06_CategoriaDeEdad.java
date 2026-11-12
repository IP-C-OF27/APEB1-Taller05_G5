
import java.util.Scanner;

/**
 * Ejercicio 06: "Categoría de Edad: Clasificar a una persona en una categoría
 * de edad (niño, adolescente, adulto) en función de su edad."
 * @author Edison, Jostyn
 * @version 1.0
 */
public class Ejercicio06_CategoriaDeEdad {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        int edad = tcl.nextInt();
        String Categoria = null;
        if (edad < 0) {
            Categoria = "La edad no es valida";
        } else if (edad <= 12) {
            System.out.print("Categoria: niño: ");
        } else if (edad <= 17) {
            Categoria = "Categoria: adolescente: ";
        } else {
            Categoria = "Categoria: adulto";
            
        }
        System.out.println("La edad: " + edad );
        System.out.println("La categoria: " + Categoria );
    }
    
}
/***
 * EVIDENCIA DEL RUN:
 * run:
 * Ingresa tu edad: 30
 * La edad: 30
 * La categoria: Categoria: adulto
 * BUILD SUCCESSFUL (total time: 15 seconds)
 */