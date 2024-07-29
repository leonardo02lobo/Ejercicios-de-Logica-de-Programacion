/*
24. Escribe un programa que determine si una cadena de texto empieza con 
una letra específica.
 */
package Aplicacion;

import java.util.Scanner;

public class Caracter_Unico {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite el texto: ");
        String texto = entrada.nextLine();
        
        System.out.print("Digite la letra especifica con la cual empieza la frase: ");
        char letra = entrada.next().charAt(0);
        
        if(texto.charAt(0) == letra){
            System.out.println("La letra coincide");
        }else{
            System.out.println("La letra no coincide");
        }
    }
    
}
