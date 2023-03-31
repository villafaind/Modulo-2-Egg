/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg9.ejercicio.guia.pkg5.arreglos;

import java.util.Scanner;


public class Encuentro9EjercicioGuia5Arreglos {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);        
        System.out.println("Ingrese la cantidad de alumnos");
        int cant= leer.nextInt();
      leer.nextLine();
        String [] Equipo= new String[cant];
        
        for (int i = 0; i < Equipo.length; i++) {
           
            System.out.println("Ingrese nombre del alumno " + (i+1));
             Equipo[i]=leer.nextLine();
        }
        for (String elemento: Equipo) {
            System.out.println(elemento);
            
        }
    }
    
}
