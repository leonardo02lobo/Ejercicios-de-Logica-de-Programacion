/*
16. Escribe un programa que determine si un número es divisible por 5
 */
package Aplicacion;

import java.util.Scanner;

public class Divisible_5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite un numero: ");
        int numero = entrada.nextInt();
        
        if(numero %5 == 0){
            System.out.println("El numero es divisible entre 5");
        }else{
            System.out.println("El numero no es divisible entre 5");
        }
    }
    
}
