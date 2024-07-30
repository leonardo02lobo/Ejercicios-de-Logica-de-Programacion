/*
35. Escribe un programa que determine si un número es positivo, negativo o cero, y además si es par o impar.
 */
package Aplicacion;

import java.util.Scanner;

public class Determinar_Numero {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite un numero: ");
        int numero = entrada.nextInt();
        String parImpar = "";
        String signo = "";
        
        if(numero % 2 == 0){
            parImpar = "par";
        }else{
            parImpar = "impar";
        }
        if(numero > 0){
            signo = "positivo";
        }else if (numero < 0){
            signo = "negativo";
        }else if( numero == 0){
            signo = "cero";
        }
        System.out.println("El numero es "+signo+" y es "+parImpar);
    }
}
