/*
31.Escribe un programa que determine si la suma de dos números es un número impar.
 */
package Aplicacion;

import java.util.Scanner;

public class Suma_Par {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite el primer numero(entero): ");
        int num1 = entrada.nextInt();
        
        System.out.print("Digite el segundo numero(entero): ");
        int num2 = entrada.nextInt();
        
        int res = num1+num2;
        
        if(res % 2 == 0){
            System.out.println("La suma de los dos numeros es un numero par");
        }else{
            System.out.println("La suma de los dos numeros es un numero impar");
        }
    }
    
}
