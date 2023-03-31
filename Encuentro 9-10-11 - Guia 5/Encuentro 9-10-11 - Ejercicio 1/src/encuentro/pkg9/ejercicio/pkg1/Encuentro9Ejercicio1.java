/*
Realizar un algoritmo que llene un vector con los 100 primeros números
enteros y los muestre por pantalla en orden descendente
 */
package encuentro.pkg9.ejercicio.pkg1;


public class Encuentro9Ejercicio1 {

   
    public static void main(String[] args) {
     int[] vector = new int[100];
        
        // Llenar el vector con los 100 primeros números enteros
        for (int i = 0; i < vector.length; i++) {
            vector[i] = i + 1;
        }
        
        // Mostrar los números del vector en orden descendente
        for (int i = vector.length - 1; i >= 0; i--) {
            System.out.println(vector[i]);
        }
    }
    
}
