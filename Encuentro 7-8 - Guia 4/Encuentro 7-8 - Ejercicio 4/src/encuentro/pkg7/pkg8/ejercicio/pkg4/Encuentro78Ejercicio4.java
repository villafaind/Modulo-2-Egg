/*
 Crea una aplicación que nos pida un número por teclado y con una
función se lo pasamos por parámetro para que nos indique si es o no un
número primo, debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo.
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo,
17 si es primo.
Numeros primos entre 1 y 100: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 
41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89 y 97.
 */
package encuentro.pkg7.pkg8.ejercicio.pkg4;

import java.util.Scanner;

public class Encuentro78Ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = leer.nextInt();
        leer.close();

        boolean esPrimo = esNumeroPrimo(num);

        if (esPrimo) {
            System.out.println(num + " es un número primo.");
        } else {
            System.out.println(num + " no es un número primo.");
        }
    }

    public static boolean esNumeroPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}
