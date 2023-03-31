/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecuentro.pkg4.pkg5.pkg6.ejercicio.extra.pkg1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Ecuentro456EjercicioExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese un tiempo en minutos: ");
        int min= leer.nextInt();
        int dia=(min/(24*60));
        int horas=(min-(dia*24*60))/60;
        //int minut=(min - (horas*60));
        System.out.println("Serian " + dia + " dia(s) " + horas + " horas ");        
    }
         
}