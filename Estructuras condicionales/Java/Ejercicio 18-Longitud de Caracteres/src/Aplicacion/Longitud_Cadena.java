/*
18.Escribe un programa que determine si una cadena de texto tiene más de  10 caracteres
 */
package Aplicacion;

import java.util.Scanner;

public class Longitud_Cadena {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite una cadena de texto: ");
        String texto = entrada.nextLine();
        
        if(texto.length() >= 10){
            System.out.println("La cadena tiene mas de 10 caracteres");
        }else{
            System.out.println("La cadena tiene "+texto.length()+" Caracteres");
        }
    }
    
}
