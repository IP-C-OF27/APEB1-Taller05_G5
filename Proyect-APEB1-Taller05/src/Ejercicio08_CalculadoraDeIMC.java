
import java.util.Scanner;

/**
 * Ejercicio 08: "Calculadora de IMC: Calcula el índice de masa corporal (IMC)
 * de una persona y la clasifica en función de su valor (bajo peso, peso normal,
 * sobrepeso, etc.) ."
 * @author Edison, Jostyn
 * @version 1.0
 */

public class Ejercicio08_CalculadoraDeIMC {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingresa el peso en kilogramos: ");
        double peso = tcl.nextDouble();
        System.out.print("Ingresa la altura en metros: ");
        double altura = tcl.nextDouble();
        if (peso <= 0 || altura <= 0) {
            System.out.print("Los datos igresados no son validos ");
        } else {    
            double imc = peso / (altura * altura);
            String Categoria;
            if (imc < 18.5) {
                Categoria = "Bajo peso ";
            } else if (imc < 25) {
                Categoria = "Peso normal ";
            } else if (imc < 30) {
                Categoria = "Sobre peso ";
            } else {
                Categoria = "Obesidad ";
            }
            System.out.print("Su IMC es: " + imc);
            System.out.print("Categoria: " + Categoria);
        }
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
 * Ingresa el peso en kilogramos: 24
 * Ingresa la altura en metros: 25
 * Su IMC es: 0.0384Categoria: Bajo peso BUILD SUCCESSFUL (total time: 22 seconds)
 */