/*
40. Escribe un programa que determine si una cadena de texto es un palíndromo y además si su longitud es par.
 */
package Aplicacion;

import java.util.Scanner;

public class Palindromo_Par {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Escriba la palabra: ");
        String texto = entrada.nextLine();
        
        String aux = "";
        for (int i = texto.length()-1; i >= 0; i--) {
            aux += texto.charAt(i);
        }
        
        if(texto.equals(aux) && texto.length() % 2 == 0){
            System.out.println("Es palindromo y par");
        }else{
            System.out.println("Ups.. Los resultados no son los esperados");
        }
    }
    
}
