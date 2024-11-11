
/**
 *Pedidos online: Desarrollar una solución que imprima el costo de un pedido de un artículo del cual se tiene la descripción,
 * la cantidad que se requiere y el precio unitario. Si la cantidad pedida excede de 50 unidades, se hace un descuento de 15%.
 * @author Jorge Fernandez
 */
import java.util.Scanner;
public class Ejercicio11_PedidosOnline {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Descripcion del articulo: ");
        String descripcion = tcl.nextLine();
        System.out.print("Cantidad: ");
        int cantidad = tcl.nextInt();
        System.out.print("Precio unitario: ");
        double precioUnitario = tcl.nextDouble();
        double costoTotal = cantidad * precioUnitario;
        if (cantidad > 50) {
            costoTotal = costoTotal * 0.85;
        }
        System.out.println("Descripcion del articulo: " + descripcion);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: $" + precioUnitario);
        System.out.println("Costo total: $" + costoTotal);
    }
}
/***
 * run:
 * Descripcion del articulo: Camiseta
 * Cantidad: 5
 * Precio unitario: 10,50
 * Descripcion del articulo: Camiseta
 * Cantidad: 5
 * Precio unitario: $10.5
 * Costo total: $52.5
 */
