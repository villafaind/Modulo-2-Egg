/*
Realizar un algoritmo que calcule la suma de todos los elementos de un
vector de tamaño N, con los valores ingresados por el usuario.
 */
package encuentro.pkg9.pkg10.pkg11.ejercicio.extra.pkg1;

import java.util.Scanner;

public class Encuentro91011EjercicioExtra1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, suma = 0;

        System.out.print("Ingrese la longitud del vector: ");
        n = leer.nextInt();
        int[] vector = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el elemento " + (i+1) + " del vector: ");
            vector[i] = leer.nextInt();
        }

        for (int i = 0; i < n; i++) {
            suma += vector[i];
        }

        System.out.println("La suma de los elementos del vector es: " + suma);
    }
}
    
