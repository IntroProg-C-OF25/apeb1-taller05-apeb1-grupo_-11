


/**
 * Año Bisiesto: Comprobar si un año ingresado es bisiesto o no. Si es bisiesto,
 * mostrar un mensaje especial.
 * @author Jorge Fernandez
 */
import java.util.Scanner;
public class Ejercicio5_AnoBisiesto {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingresa un ano: ");
        int ano = tcl.nextInt();
        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
            System.out.println("Ano Bisiesto");
        } else {
            System.out.println("Ano No Bisiesto");
        }
    }
}
//para esta prueba usé el año 2004 (que es divisible para 400 y sin residuo)
//y el año 2005 (que al dividirlo da como resultado 501.25)
/***
 * run:
 * Ingresa un ano: 2004
 * Ano Bisiesto
 * run:
 * Ingresa un ano: 2005
 * Ano No Bisiesto
 */
