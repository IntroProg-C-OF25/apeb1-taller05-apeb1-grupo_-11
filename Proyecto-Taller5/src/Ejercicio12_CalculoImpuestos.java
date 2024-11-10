/***
 *Calculo de impuestos: Desarrollar una solución que permita leer los datos de un automóvil (marca, origen y costo)
 *imprima el impuesto por pagar y el precio de venta (incluido el impuesto). 
 *Si el origen es Alemania el impuesto es 20%, si es de Japón el impuesto es 30%, si es de Italia, 15%, y 
 *si es de USA, 8%
 * @author Usuario
 */
import java.util.Scanner;
public class Ejercicio12_CalculoImpuestos {
    public static void main(String[] args) {
        double costo, porcentajeImp;
        Scanner tcl = new Scanner(System.in);
        System.out.println("DEME LA MARCADEL AUTOMOVIL: ");
        String marca = tcl.nextLine();
        System.out.println("DEME EL ORIGEN DEL AUTOMOVIL: ");
        String origen = tcl.nextLine().toLowerCase();
        System.out.println("DEME EL COSTO DEL AUTOMOVIL: ");
        costo = tcl.nextDouble();
        porcentajeImp = 0;
        switch (origen) {
            case "alemania":
                porcentajeImp = 0.20;
                        break;
            case "japon":
                porcentajeImp = 0.30;
                        break;
            case "italia":
                porcentajeImp = 0.15;
                        break;
            case "usa":
                porcentajeImp = 0.08;
                        break;
            default:
                System.out.println("Origen no válido. Solo se aceptan Alemania, Japón, Italia o USA.");
        }
        double impuesto = costo * porcentajeImp;
        double precioVenta = costo + impuesto;
        System.out.println("Marca: " + marca);
        System.out.println("Origen: " + origen.substring(0, 1).toUpperCase() + origen.substring(1));
        System.out.println("Costo del automóvil: " + costo);
        System.out.println("Impuesto a pagar: " + impuesto);
        System.out.println("Precio de venta (incluido impuesto): " + precioVenta);
    }
}

/*run-single:
DEME LA MARCADEL AUTOMOVIL: 
Toyota
DEME EL ORIGEN DEL AUTOMOVIL: 
Japón
DEME EL COSTO DEL AUTOMOVIL: 
35000
Origen no v�lido. Solo se aceptan Alemania, Jap�n, Italia o USA.
Marca: Toyota
Origen: Jap�n
Costo del autom�vil: 35000.0
Impuesto a pagar: 0.0
Precio de venta (incluido impuesto): 35000.0
BUILD SUCCESSFUL (total time: 17 seconds)*/