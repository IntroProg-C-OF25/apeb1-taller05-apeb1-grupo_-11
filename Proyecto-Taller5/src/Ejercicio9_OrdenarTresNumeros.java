
/**
 * Ordenamiento de Tres Números: Dados tres números, ordenarlos en orden ascendente.
 * @author Jorge Fernandez
 */
import java.util.Scanner;
public class Ejercicio9_OrdenarTresNumeros {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int num1 = tcl.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int num2 = tcl.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        int num3 = tcl.nextInt();
        int temp;
        
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num1 > num3) {
            temp = num1;
            num1 = num3;
            num3 = temp;
        }
        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        System.out.println("Numeros en orden ascendente: " + num1 + ", " + num2 + ", " + num3);
    }
}
/***
 * run:
 * Ingresa el primer numero: 7
 * Ingresa el segundo numero: 17
 * Ingresa el tercer numero: 1
 * Numeros en orden ascendente: 1, 7, 17
 */