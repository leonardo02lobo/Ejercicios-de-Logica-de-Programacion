/*
11. Escriba un programa que calcule el valor de: 1+2+3+...+n
 */
package Aplicacion;

import java.util.Scanner;

public class Suma {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite la n cantidad de numeros a sumar: ");
        int n = entrada.nextInt();
        
        int res = 0;
        
        for (int i = 1; i <= n; i++) {
            res += i;
        }
        System.out.println("El resultado es : "+res);
    }
    
}
