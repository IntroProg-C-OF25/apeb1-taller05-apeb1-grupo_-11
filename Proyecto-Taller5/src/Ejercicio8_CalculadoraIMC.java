/***
 *Calculadora de IMC: Calcular el índice de masa corporal (IMC)
 *de una persona y clasificarla en función de su valor (bajo peso, peso normal, sobrepeso, etc.).
 * @author Francis Tapia
 */
import java.util.Scanner;
public class Ejercicio8_CalculadoraIMC {
    public static void main(String[] args) {
        double peso, altura, imc, imcRedond;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Introduce tu peso en kilogramos (kg): ");
        peso = tcl.nextDouble();
        System.out.print("Introduce tu altura en metros (m): ");
        altura = tcl.nextDouble();
        imc = peso / (altura * altura);
        imcRedond = Math.round(imc * 100.0) / 100.0;
        System.out.print("Tu IMC es: " + imcRedond);
        if (imc < 18.5) {
            System.out.println("Clasificación: Bajo peso");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Clasificación: Peso normal");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Clasificación: Sobrepeso");
        } else if (imc >= 30 && imc < 34.9){
            System.out.println("Clasificación: Obesidad");
        } else if (imc >= 35 && imc < 39.9){
            System.out.println("Clasificacion: Obesidad tipo 2");
        } else {
            System.out.println("Clasificacion: Obesidad tipo 3");
        }
    }
    
}
/*run-single:
Introduce tu peso en kilogramos (kg): 150
Introduce tu altura en metros (m): 1.75
Tu IMC es: 48.98Clasificacion: Obesidad tipo 3*/