/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg4.pkg5.pkg6.ejercicio.extra.pkg6;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Encuentro456EjercicioExtra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad e personas a leer ");
        int cantidad = sc.nextInt();
        double altura = 0, bajoPromedio = 0, promedio = 0;
        int contador = 0;

        for (int i = 0; i < cantidad; i++) {
            //do{
            System.out.println("Ingrese la Altura: ");
            altura = sc.nextDouble();
            if (altura < 1.60) {
                bajoPromedio = +altura;
                contador++;
            }
            promedio =+altura;
            //} while(altura>0 && altura<2.1);

        }
        System.out.println("El promedio es: " + (promedio / cantidad));
        System.out.println("El promedio bajo es: " + (bajoPromedio / contador));
    }
    
}
