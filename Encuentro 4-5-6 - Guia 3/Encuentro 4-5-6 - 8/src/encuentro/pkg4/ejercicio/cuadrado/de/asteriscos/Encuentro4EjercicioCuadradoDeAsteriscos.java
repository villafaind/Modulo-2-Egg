/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg4.ejercicio.cuadrado.de.asteriscos;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Encuentro4EjercicioCuadradoDeAsteriscos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño");
        
        int size = sc.nextInt();
        
     
       for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                
                if (i == 0 || i == size-1){
                    System.out.print("* ");
                  
                }else{
                    if(j == 0 || j == size-1  ){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println("");
        }
    }
    
}
