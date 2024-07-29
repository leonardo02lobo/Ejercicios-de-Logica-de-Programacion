/*
23.Escribe un programa que determine si una palabra es un palíndromo. Una 
palabra palíndroma es una palabra o frase que se lee igual de izquierda a 
derecha que de derecha a izquierda, para invertir la cadena dependemos 
de invertir la cadena con un bucle
 */
package Aplicacion;

import java.util.Scanner;

public class EsPalindromo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Escriba la palabra: ");
        String texto = entrada.nextLine();
        
        String aux = "";
        for (int i = texto.length()-1; i >= 0; i--) {
            aux += texto.charAt(i);
        }
        
        if(texto.equals(aux)){
            System.out.println("Es palindromo");
        }else{
            System.out.println("No es palindromo");
        }
    }
    
}
