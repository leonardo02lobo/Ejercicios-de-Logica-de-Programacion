/*
18. Escribe un programa que cuente cuántas vocales hay en una cadena de texto.
 */
package Aplicacion;

import java.util.Scanner;

public class Maximo_Vocales {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cont = 0;
        
        System.out.print("Digite la cadena de texto: ");
        String texto = entrada.nextLine();

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                cont++;
            }
        }
        System.out.println("La cadena de texto tiene "+cont+" vocales");
    }

}
