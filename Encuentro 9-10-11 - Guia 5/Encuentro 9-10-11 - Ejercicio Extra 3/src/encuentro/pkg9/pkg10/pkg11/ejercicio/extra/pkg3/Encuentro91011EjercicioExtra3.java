/*
Crear una función rellene un vector con números aleatorios, pasándole
un arreglo por parámetro. Después haremos otra función o
procedimiento que imprima el vector.
 */
package encuentro.pkg9.pkg10.pkg11.ejercicio.extra.pkg3;

import java.util.Random;

public class Encuentro91011EjercicioExtra3 {

    public static void main(String[] args) {
        int[] vector = new int[10];
        generarNumerosAleatorios(vector);
        imprimirVector(vector);
    }

    public static void generarNumerosAleatorios(int[] vector) {
        Random random = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(100); // Genera un número aleatorio entre 0 y 99
        }
    }

    public static void imprimirVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println(); // Imprime una nueva línea al final para separar los resultados
    }
}
