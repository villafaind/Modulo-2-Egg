/*
Diseñe una función que pida el nombre y la edad de N personas e
imprima los datos de las personas ingresadas por teclado e indique si
son mayores o menores de edad. Después de cada persona, el programa
debe preguntarle al usuario si quiere seguir mostrando personas y frenar
cuando el usuario ingrese la palabra “No”.
 */
package encuentro.pkg7.pkg8.ejercicio.pkg2;

import java.util.Scanner;

public class Encuentro78Ejercicio2 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    String nombre;
        int edad, n;
        boolean seguirMostrando = true;
        
        System.out.print("Ingrese la cantidad de personas a registrar: ");
        n = leer.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.println("\nPersona " + i);
            
            System.out.print("Nombre: ");
            nombre = leer.next();
            
            System.out.print("Edad: ");
            edad = leer.nextInt();
            
            if (edad >= 18) {
                System.out.println(nombre + " es mayor de edad.");
            } else {
                System.out.println(nombre + " es menor de edad.");
            }
            
            System.out.print("¿Quiere seguir mostrando personas? (Sí/No): ");
            String respuesta = leer.next();
            if (respuesta.equalsIgnoreCase("No")) {
                seguirMostrando = false;
                break;
            }
        }
        
        System.out.println("\nFin del programa.");
        leer.close();
    }
}
   
