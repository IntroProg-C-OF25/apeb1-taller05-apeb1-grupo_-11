
/**
 *Sistema de reservas hoteleras: En una hosteria de la ciudad de Loja se hace un descuento del 10% si el cliente se hospeda más de 5 días,
 * del 15% si se hospeda más de 10 días y del 20% si se hospeda más de 15 días.
 * Elaborar un solución que pida como datos de entrada el número de días y el precio diario de la habitación y
 * luego calcule e imprima el subtotal por pagar, el descuento y el total por pagar.
 * @author Jorge Fernandez
 */
import java.util.Scanner;
public class Ejercicio13_ReservaHotel {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Dias de hospedaje: ");
        int dias = tcl.nextInt();
        System.out.print("Precio diario de la habitacion: ");
        double precioDiario = tcl.nextDouble();
        double subtotal = dias * precioDiario;
        double descuento = 0;

        //Aquí puse la parte de los descuentos del 10%, 15% y 20% respectivamente y la separe con un comentario para no confundirme
        if (dias > 15) {
            descuento = subtotal * 0.20;
        } else if (dias > 10) {
            descuento = subtotal * 0.15;
        } else if (dias > 5) {
            descuento = subtotal * 0.10;
        }
        double total = subtotal - descuento;
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + total);
    }
}
/***
 * run:
 * Dias de hospedaje: 15
 * Precio diario de la habitacion: 25
 * Subtotal: $375.0
 * Descuento: $56.25
 * Total a pagar: $318.75
 */
