/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg4.pkg5.pkg6.ejercicio.extra.pkg10;

import java.util.Scanner;



/**
 *
 * @author ASUS
 */
public class Encuentro456EjercicioExtra10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1 = (int) (Math.random() * 11);
        int num2 = (int) (Math.random() * 11);
        int resultado = num1 * num2;
        int respuesta;
        
        do {
            System.out.print("Adivina el resultado de " + num1 + " x " + num2 + ": ");
            respuesta = leer.nextInt();
            
            if (respuesta == resultado) {
                System.out.println("Correcto!");
            } else {
                System.out.println("Incorrecto, intenta de nuevo.");
            }
        } while (respuesta != resultado);
        
        leer.close();
    }
}