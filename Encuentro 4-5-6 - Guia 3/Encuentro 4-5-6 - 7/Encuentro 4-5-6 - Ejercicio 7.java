/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg003.guia;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Ejercicio07 {
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String cadena;
        int contadorCorrectas = 0;
        int contadorIncorrectas = 0;
        do {
            System.out.println("Ingrese una cadena");
            cadena = leer.next();
            boolean b = cadena.length() <= 5 && cadena.startsWith("X") && cadena.endsWith("O");
            if (b) {
                contadorCorrectas++;
            } else {
                contadorIncorrectas++;
            }
        } while (!"&&&&&".equals(cadena));
        System.out.println("Se leyeron " + contadorCorrectas + " cadenas correctas");
        System.out.println("Se leyeron " + contadorIncorrectas + " cadenas incorrectas");
    }
}

