/***
 *Facturación eléctrica: Desarrollar una solución que permita calcular y mostrar el valor a cancelar de una planilla de luz.
 *Se debe ingresar el valor de costo por kilovatio/hora y el número de kilovatios consumidos en el mes.
 *Si el usuario tiene edad mayor a 65 años, se debe descontar el 10% por pertenecer a la tercera edad.
 *
 * @author Francis Tapia
 */
import java.util.Scanner;
public class Ejercicio10_FacturcionElectronica {
    public static void main(String[] args) {
        double costoKwh, numKwm, edad;
        Scanner tcl = new Scanner(System.in);
        System.out.println("DAME EL COSTO POR KILOVATIO/HORA: ");
        costoKwh = tcl.nextDouble();
        System.out.println("DAME EL NUMERO DE KILOVATIOS CONSUMIDOS AL MES: ");
        numKwm = tcl.nextDouble();
        System.out.println("DEME LA EDAD: ");
        edad = tcl.nextDouble();
        double total = costoKwh * numKwm;
        if (edad >= 65){
            total *= 0.9;
            System.out.println("EL DESCUENTO DE LA TERCERA EDAD SI APLICA");
        }else{ 
            System.out.println("EL DESCUENTO NO APLICA");
        }
        System.out.println("EL VALOR A PAGAR ES: " + total );
    }
    
}
/*run-single:
DAME EL COSTO POR KILOVATIO/HORA: 
4
DAME EL NUMERO DE KILOVATIOS CONSUMIDOS AL MES: 
20
DEME LA EDAD: 
35
EL DESCUENTO NO APLICA
EL VALOR A PAGAR ES: 80.0
BUILD SUCCESSFUL (total time: 10 seconds)*/