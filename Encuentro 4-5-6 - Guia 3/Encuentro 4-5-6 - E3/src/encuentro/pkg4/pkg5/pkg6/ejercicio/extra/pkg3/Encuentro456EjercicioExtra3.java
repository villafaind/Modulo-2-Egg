/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg4.pkg5.pkg6.ejercicio.extra.pkg3;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Encuentro456EjercicioExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese frase (solo toma la primer letra )");
        char primerLetra = leer.next().charAt(0);
        String letra = String.valueOf(primerLetra);
        boolean vocal = "a".equalsIgnoreCase(letra) || "e".equalsIgnoreCase(letra) || "i".equalsIgnoreCase(letra) || "o".equalsIgnoreCase(letra) || "u".equalsIgnoreCase(letra);

        if (vocal) {
            System.out.println("La letra es una vocal");
        } else {
            System.out.println("La letra NO es vocal");
    }
        }
    }
    

