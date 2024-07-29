/*
28. Escribe un programa que determine si una cadena de texto tiene entre 5 y 10 caracteres.
 */
package Aplicacion;

import java.util.Scanner;

public class Longitud {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite la cadena de texto: ");
        String texto = entrada.nextLine();
        
        if(texto.length() >= 5 && texto.length() <= 10){
            System.out.println("La cadena de texto esta entre 5 a 10 caracteres");
        }else{
            System.out.println("La cadena no esta en el rango de 5 a 10 caracteres");
        }
    }
    
}
