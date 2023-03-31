/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg4.ejercicio.pkg6;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Encuentro4Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
        double num1, num2; 
        int opcion;
        boolean salir;
        salir = false;
      

        System.out.println("Ingrese el primer número");
        num1=sc.nextDouble();
        System.out.println("Ingrese el segundo número");
        num2=sc.nextDouble();
        
        
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        System.out.println("5.Salir");
        System.out.println("Elija una opción");
        
        
        do {
        
        
        opcion=sc.nextInt();
        
         switch (opcion){
            case 1: System.out.println("La suma de los números es " + (num1 + num2));
                    break;
            case 2: System.out.println("La resta de los números es " + (num1 - num2));
                    break;
            case 3: System.out.println("La multiplicación de los números es " + (num1 * num2));
                    break;
            case 4: System.out.println("La división de los números es " + (num1 / num2));
                    break;
            case 5: System.out.println("Seguro quiere salir?");
                    String salida = sc.next();
                    if (salida.toUpperCase().equals("S")){
                        salir = true;
                    }else{
                     System.out.println("Elija una nueva opcion");   
                    } 
                    break;
            default: System.out.println("Elija una opción válida forro/a");
                    break;
         }
         
            
        
        } while (salir != true);
        
        System.out.println("Saliste del programa");
        
}
    
}