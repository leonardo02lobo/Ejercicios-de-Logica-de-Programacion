/*
10. Escriba un programa que lea de la entrada estándar un carácter e indique en la salida
estándar si el carácter es una vocal minúscula, es una vocal mayúscula o no es una vocal.
 */
package Aplicacion;

import java.util.Scanner;

public class Determinar_Vocal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite el caracter(indique un solo caracter): ");
        char caracter = entrada.next().charAt(0);

        if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' | caracter == 'u') {
            System.out.println("La vocal es minuscula");
        }else if (caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' | caracter == 'U') {
            System.out.println("La vocal es mayuscula");
        }else{
            System.out.println("No es una vocal");
        }

    }

}
