/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg4.pkg5.pkg6.ejercicio.extra.pkg2;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Encuentro456EjercicioExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Escriba un numero:");
        int a,b ,c , d, aux;
        aux=leer.nextInt();
        a=aux;
        b=a+aux;
        c=b-2*aux;
        d=b*c-aux;
        System.out.println("Estas seran las variables: A="+a+" B="+b+" C="+c+" D="+d);
        
        a=d;
        d=b;
        b=c;
        c=aux;
      
        System.out.println("Ahora: A="+a+" B="+b+" C="+c+" D="+d);
    }
    
}
