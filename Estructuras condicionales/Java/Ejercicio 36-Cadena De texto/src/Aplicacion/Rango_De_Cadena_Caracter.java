/*
36. Escribe un programa que determine si una cadena de texto tiene una 
longitud específica y si contiene un carácter específico.
 */
package Aplicacion;

import java.util.Scanner;

public class Rango_De_Cadena_Caracter {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite una cadena de texto: ");
        String texto = entrada.nextLine();

        System.out.print("Digite la longitud especifica de la cadena: ");
        int longitud = entrada.nextInt();

        System.out.print("Digite un caracter especifico en el texto: ");
        char letra = entrada.next().charAt(0);

        boolean band = false;
        for (int i = 0; i < texto.length(); i++) {
            if (letra == texto.charAt(i)) {
                band = true;
                break;
            }
        }

        if (texto.length() == longitud && band) {
            System.out.println("La longitud es correcta y tiene el caracter indicado");
        }else{
            System.out.println("Ups... Algunos resultados no pueden coincidir con lo esperado");
        }
    }

}
