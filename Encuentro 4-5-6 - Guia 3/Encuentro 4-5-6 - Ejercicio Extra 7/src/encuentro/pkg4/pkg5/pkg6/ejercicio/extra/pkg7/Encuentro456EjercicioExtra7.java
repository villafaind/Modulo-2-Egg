/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg4.pkg5.pkg6.ejercicio.extra.pkg7;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Encuentro456EjercicioExtra7 {

    /**
     * @param args the command line arguments
     */
    //i=contador    n = cantidad
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
        int n, i = 1;
        double num, sum = 0, min = Double.MAX_VALUE, max = Double.MIN_VALUE;

        System.out.print("Ingrese la cantidad de números: ");
        n = sc.nextInt();

        while (i <= n) {
            System.out.print("Ingrese el número " + i + ": ");
            num = sc.nextDouble();

            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }

            sum += num;
            i++;
        }

        double promedio = sum / n;
        System.out.println("El valor mínimo es: " + min);
        System.out.println("El valor máximo es: " + max);
        System.out.println("El promedio es: " + promedio);
    }
}
