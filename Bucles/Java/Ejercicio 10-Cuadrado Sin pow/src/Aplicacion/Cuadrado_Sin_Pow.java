/*
10. Escriba un programa que calcule x^y, donde tanto x como y son enteros positivos, sin utilizar la función pow ().
 */
package Aplicacion;

import java.util.Scanner;

public class Cuadrado_Sin_Pow {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite un numero positivo para x: ");
        int x = entrada.nextInt();
        
        System.out.print("Digite un numero positivo para y: ");
        int y = entrada.nextInt();
        
        int res = 1;
        
        for (int i = 1; i <= y; i++) {
            res *= x;
        }
        System.out.println("El resultado de la potencia de "+x+"^"+y+" es: "+res);
    }
    
}
