
/**
 *Rango de Notas: Asignar una letra (A, B, C, D) a una calificación en función de su rango
 * (A para 90-100, B para 80-89, etc.).
 *
 * @author Jorge Fernandez
 */
import java.util.Scanner;
public class Ejercicio7_RangoNotas {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingresa la calificacion (0-100): ");
        int calificacion = tcl.nextInt();
        if (calificacion >= 90 && calificacion <= 100) {
            System.out.println("Calificacion: A");
        } else if (calificacion >= 80 && calificacion < 90) {
            System.out.println("Calificacion: B");
        } else if (calificacion >= 70 && calificacion < 80) {
            System.out.println("Calificacion: C");
        } else if (calificacion >= 60 && calificacion < 70) {
            System.out.println("Calificacion: D");
        } else if (calificacion >= 0 && calificacion < 60) {
            System.out.println("Calificacion: Reprobado");
        } else {
            System.out.println("Calificacion invalida. Ingresa un valor entre 0 y 100.");
        }
    }
}
/***
 * run:
 * Ingresa la calificacion (0-100): 90
 * Calificacion: A
 */