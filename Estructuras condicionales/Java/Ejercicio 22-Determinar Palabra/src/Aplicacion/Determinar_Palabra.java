/*
22. Escribe un programa que determine si una palabra es "hola"
 */
package Aplicacion;

import java.util.Scanner;

public class Determinar_Palabra {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String frase = "hola";

        System.out.print ("Digite una frase: ");
        String fraseNueva = entrada.nextLine();

        if (fraseNueva.equals(frase)) {
            System.out.println("La frase coincide");
        } else {
            System.out.println("La frase no coincide");
        }
    }

}
