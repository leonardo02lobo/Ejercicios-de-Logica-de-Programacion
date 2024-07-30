/*
12. Escriba un programa que calcule el valor de: 1+3+5+...+2n-1
 */
package Aplicacion;

import java.util.Scanner;

public class Suma_De_Numeros_2 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite la n cantidad de numeros a sumar: ");
        int n = entrada.nextInt();
        
        int res = 0;
        
        for (int i = 1; i < n; i+=2) {
            res += i;
        }
        System.out.println("El resultado es : "+res);
    }
    
}
