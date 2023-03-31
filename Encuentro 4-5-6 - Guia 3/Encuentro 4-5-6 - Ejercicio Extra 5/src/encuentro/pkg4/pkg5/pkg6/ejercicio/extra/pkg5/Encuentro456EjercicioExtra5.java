/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg4.pkg5.pkg6.ejercicio.extra.pkg5;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Encuentro456EjercicioExtra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Escriba el tipo de socio:");
        char letra = leer.nextLine().charAt(0);
        
        System.out.println("ingrese el valor del tratamiento ");
        int costo= leer.nextInt();
        
        switch (letra) {
            case 'a':
            case 'A':
                System.out.println("el costo de tratamiento sera : " + (costo*0.5));
                break;
            case 'b':
            case 'B':
                 System.out.println("el costo de tratamiento sera : " + (costo*0.35));
                break;
            case 'c':
            case 'C':
                 System.out.println("el costo de tratamiento sera : " + costo);
                break;
            
            default:
                System.out.println("escribiste un valor no valido");
    }
    
}
    }
