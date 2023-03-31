/*
 Crea una aplicación que a través de una función nos convierta una
cantidad de euros introducida por teclado a otra moneda, estas pueden
ser a dólares, yenes o libras. La función tendrá como parámetros, la
cantidad de euros y la moneda a convertir que será una cadena, este no
devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
i. * 0.86 libras es un 1 €
ii. * 1.28611 $ es un 1 €
iii. * 129.852 yenes es un 1 €
 */

package encuentro.pkg7.pkg8.ejercicio.pkg3;

import java.util.Scanner;

public class Encuentro78Ejercicio3 {

    public static void convertir(double cantidad, String moneda) {
        double resultado = 0;
        String tipoMoneda = "";
        
        switch(moneda.toLowerCase()) {
            case "dolares":
                resultado = cantidad * 1.28611;
                tipoMoneda = "$";
                break;
            case "libras":
                resultado = cantidad * 0.86;
                tipoMoneda = "£";
                break;
            case "yenes":
                resultado = cantidad * 129.852;
                tipoMoneda = "¥";
                break;
            default:
                System.out.println("La moneda ingresada no es válida.");
                return;
        }
        
        System.out.println(cantidad + " € equivalen a " + resultado + " " + tipoMoneda);
    }
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de euros: ");
        double euros = leer.nextDouble();
        System.out.print("Ingrese la moneda a la que desea convertir (dolares, libras o yenes): ");
        String moneda = leer.next();
        convertir(euros, moneda);
    }
    
}
