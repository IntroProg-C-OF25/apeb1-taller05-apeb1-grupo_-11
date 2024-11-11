
/** *
 *Mayor de tres números: Dados tres números, determinar cuál es el mayor.
 * Si son iguales, mostrar un mensaje.
 * @author Jorge Fernández
 */
import java.util.Scanner;

public class Ejercicio3_MayorTresNum {

    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner tcl = new Scanner(System.in);
        System.out.print("DAME EL PRIMER NUMERO: ");
        num1 = tcl.nextInt();
        System.out.print("DAME EL SEGUNDO NUMERO: ");
        num2 = tcl.nextInt();
        System.out.print("DAME EL TERCER NUMERO: ");
        num3 = tcl.nextInt();
        if (num1 == num2 && num2 == num3) {
            System.out.println("LOS NUMEROS SON IGUALES");
        } else {
            int mayor = num1;
            if (num1 > mayor) {
                mayor = num1;
            }
            if (num2 > mayor) {
                mayor = num2;
            }
            if (num3 > mayor) {
                mayor = num3;
            }
            System.out.println("EL NUMERO MAYOR ES = " + mayor);
        }
    }
}
/***
 *run:
 *DAME EL PRIMER NUMERO: 10
 *DAME EL SEGUNDO NUMERO: 11
 *DAME EL TERCER NUMERO: 13
 * EL NUMERO MAYOR ES = 13
 */
