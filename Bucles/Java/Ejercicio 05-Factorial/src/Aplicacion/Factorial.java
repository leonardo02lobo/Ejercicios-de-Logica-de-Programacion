/*
5. Elaborar un programa que determine la factorial de un número, el usuario tiene que introducir la factorial
 */
package Aplicacion;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int res = 1;
        
        System.out.print("Digite el numero(entero): ");
        int numero = entrada.nextInt();
        
        for (int i = numero; i > 0; i--) {
            res *=i;
        }
        System.out.println("El resultado del factorial de "+numero+" es: "+res);
        
    }
    
}
