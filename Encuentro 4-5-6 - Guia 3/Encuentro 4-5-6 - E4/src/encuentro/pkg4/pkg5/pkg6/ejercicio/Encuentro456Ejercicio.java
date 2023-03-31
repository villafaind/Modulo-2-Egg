/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg4.pkg5.pkg6.ejercicio;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Encuentro456Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Escriba un numero:");
        int num = leer.nextInt();

        switch (num) {
            case 1:
                System.out.println("I");
                break;

            case 2:
                System.out.println(" II ");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;

            case 6:
                System.out.println("VI");
                break;

            case 7:
                System.out.println("VII");
                break;

            case 8:
                System.out.println("VIII");
                break;

            case 9:
                System.out.println("IX");
                break;
            case 10:
                System.out.println("X");

                break;
            default:
                System.out.println("No esta entre 1 y 10");
    }
    
}
    }
