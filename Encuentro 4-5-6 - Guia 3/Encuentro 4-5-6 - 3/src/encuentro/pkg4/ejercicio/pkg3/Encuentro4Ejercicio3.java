/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg4.ejercicio.pkg3;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Encuentro4Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        String frase;
        System.out.println("Ingrese una frase de 8 caracteres");
        frase=leer.nextLine();
        
        if (frase.length()!=8) {
            System.out.println("Incorrecto"); 
        }else {
            System.out.println("Correcto");
                    
                    }
    }
    
}
