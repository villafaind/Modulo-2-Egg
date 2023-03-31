/*
Crea una aplicación que le pida dos números al usuario y este pueda
elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
una función para cada operación matemática y deben devolver sus
resultados para imprimirlos en el main.
 */
package encuentro.pkg7.pkg8.ejercicio.pkg1;

import java.util.Scanner;


public class Encuentro78Ejercicio1 {

    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        double num1 = leer.nextDouble();
        System.out.println("Ingrese el segundo número: ");
        double num2 = leer.nextDouble();
        System.out.println("Qué operacion desea realizar?");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        int opcion = leer.nextInt();
        double resultado = 0;
        switch (opcion) {
            case 1:
                resultado = sumar(num1, num2);
                break;
            case 2:
                resultado = restar(num1, num2);
                break;
            case 3:
                resultado = multiplicar(num1, num2);
                break;
            case 4:
                resultado = dividir(num1, num2);
                break;
            default:
                System.out.println("Opcion inválida");
                System.exit(0);
        }
        System.out.println("El resultado es: " + resultado);
    }    
    
    public static double sumar(double num1, double num2) {
        return num1 + num2;
        }
    public static double restar(double num1, double num2) {
        return num1 - num2;
        }
    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
        }
    public static double dividir(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("No se puede dividir por cero");
            System.exit(0);
        }
        return num1 / num2;
    }
    
}
