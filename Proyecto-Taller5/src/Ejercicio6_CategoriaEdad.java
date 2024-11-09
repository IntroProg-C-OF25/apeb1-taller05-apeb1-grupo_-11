/***
 * Categoría de Edad: Clasificar a una persona en una categoría de edad (niño, adolescente, adulto)
 * en función de su edad.
 * @author Francis Tapia
 */
import java.util.Scanner;
public class Ejercicio6_CategoriaEdad {
    public static void main(String[] args) {
        int edad; 
        Scanner tcl = new Scanner(System.in);
        System.out.print("DAME LA EDAD: ");
        edad = tcl.nextInt();
        if (edad >= 0 && edad <= 12) {
            System.out.println("Eres un niño");
        } else if (edad >= 13 && edad <= 17) {
            System.out.println("Eres un adolescente");
        } else if (edad >= 18 && edad <= 120) {
            System.out.println("Eres un adulto");
        } else {
            System.out.println("Edad no válida");
        }
        }
    }
/*run-single:
DAME LA EDAD: 18
Eres un adulto */