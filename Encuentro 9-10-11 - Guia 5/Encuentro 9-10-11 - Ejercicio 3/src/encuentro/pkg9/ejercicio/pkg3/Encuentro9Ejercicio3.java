/*
Recorrer un vector de N enteros contabilizando cuántos números son de
1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package encuentro.pkg9.ejercicio.pkg3;

import java.util.Scanner;


public class Encuentro9Ejercicio3 {

 
    public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);        
        System.out.println("Ingrese el tamaño del vector");
        
        int tam = leer.nextInt();
        //inicializar vector
        int[] vector= new int[tam];
        // cargar numeros
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese numero entero");
            vector[i]=leer.nextInt();                
        }
        //buscar numeros
        int contador1 = 0,contador2 = 0,contador3 = 0,contador4 = 0,contador5 = 0;
        for (int i = 0; i < vector.length; i++) {
            String str = Integer.toString(vector[i]);

            int cant=str.length();
            switch (cant){
                case 1:
                    contador1++;
                    break;
                 case 2:
                     contador2++;
                     break;
                 case 3:
                     contador3++;
                     break;
                 case 4:
                     contador4++;
                     break;
                 case 5:
                     contador5++;
                     break;
                 default:
                     
                                     
        }
            
        }
        
        System.out.println("la cantidad de numeros con 1 digito "+ contador1);
        System.out.println("la cantidad de numeros con 2 digitos "+ contador2);
        System.out.println("la cantidad de numeros con 3 digitos "+ contador3);
        System.out.println("la cantidad de numeros con 4 digitos "+ contador4);
        System.out.println("la cantidad de numeros con 5 digitos "+ contador5);
        
        }
    }
