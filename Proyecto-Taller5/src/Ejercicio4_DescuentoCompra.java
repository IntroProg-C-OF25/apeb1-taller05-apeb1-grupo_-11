/***
 *Descuento en Compras: Calcular el precio final de un producto con un descuento del 10% 
 * si el precio original es mayor de $100; de lo contrario, no hay descuento.
 * @author Francis Tapia
 */
import java.util.Scanner;
public class Ejercicio4_DescuentoCompra {
    public static void main(String[] args) {
        double precioP;
        Scanner tcl = new Scanner(System.in);
        System.out.print("DAME EL PRECIO DEL PRODUCTO: ");
        precioP = tcl.nextInt();
        double precioF;
        if (precioP > 100) {
            precioF = precioP * 0.9;
            System.out.println("EL DESCUENTO SI APLICA ");
                    } else {
                    precioF = precioP;
                    System.out.println("EL DESCUENTO NO APLICA ");
        } 
    }
}
