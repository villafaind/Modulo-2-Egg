/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg4.ejercicio.pkg4;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Encuentro4Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer=new Scanner (System.in);
        System.out.println("Ingrese una frase, la primera letra debe ser una A");
        String frase = leer.nextLine();
       
        
        if (frase.substring(0, 1).toUpperCase().equals("A")){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
        }
    }