/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg9.pkg10.pkg11.ejercicio.pkg6;

import java.util.Scanner;

public class Encuentro91011Ejercicio6 {

   
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
        int[][] cuadrado = new int[3][3];
        int[] sumas = new int[8];
        boolean esMagico = true;

        // Pedir números para llenar el cuadrado
        System.out.println("Introduce los números del cuadrado (del 1 al 9):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cuadrado[i][j] = leer.nextInt();
                if (cuadrado[i][j] < 1 || cuadrado[i][j] > 9) {
                    System.out.println("Número inválido. Inténtalo de nuevo.");
                    j--;
                }
            }
        }

        // Sumar filas, columnas y diagonales
        sumas[0] = cuadrado[0][0] + cuadrado[0][1] + cuadrado[0][2];
        sumas[1] = cuadrado[1][0] + cuadrado[1][1] + cuadrado[1][2];
        sumas[2] = cuadrado[2][0] + cuadrado[2][1] + cuadrado[2][2];
        sumas[3] = cuadrado[0][0] + cuadrado[1][0] + cuadrado[2][0];
        sumas[4] = cuadrado[0][1] + cuadrado[1][1] + cuadrado[2][1];
        sumas[5] = cuadrado[0][2] + cuadrado[1][2] + cuadrado[2][2];
        sumas[6] = cuadrado[0][0] + cuadrado[1][1] + cuadrado[2][2];
        sumas[7] = cuadrado[0][2] + cuadrado[1][1] + cuadrado[2][0];

        // Comprobar si las sumas son iguales
        for (int i = 1; i < sumas.length; i++) {
            if (sumas[i] != sumas[0]) {
                esMagico = false;
                break;
            }
        }

        // Mostrar resultado
        if (esMagico) {
            System.out.println("¡El cuadrado es mágico!");
        } else {
            System.out.println("El cuadrado no es mágico.");
        }

        leer.close();
    }
}
 
