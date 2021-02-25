/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1seleccion60066;

import java.util.Scanner;

/**
 *
 * @author Rafael Moreno
 */
public class Ejercicio1Seleccion60066 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        int numero_1;
        int numero_2;
        int numero_3;
        
        System.out.println("Ingrese el primer número");
        numero_1 = entrada.nextInt();
        System.out.println("Ingrese el segundo número");
        numero_2 = entrada.nextInt();
        System.out.println("Ingrese el tercer número");
        numero_3 = entrada.nextInt();
        
        if (numero_1 > numero_2 && numero_1 > numero_3) {
            System.out.println("El número mayor es: " + numero_1);
        } else if (numero_2 > numero_1 && numero_2 > numero_3){
        System.out.println("El número mayor es: " + numero_2);
        } else  {
            System.out.println("El número mayor es: " + numero_3);
                }
    }
}