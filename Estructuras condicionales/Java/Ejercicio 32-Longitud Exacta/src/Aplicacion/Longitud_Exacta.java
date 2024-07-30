/*
32.Escribe un programa que determine si una cadena de texto tiene exactamente 8 caracteres.
 */
package Aplicacion;

import java.util.Scanner;

public class Longitud_Exacta {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite la cadena de texto: ");
        String texto = entrada.nextLine();
        
        if(texto.length() == 8){
            System.out.println("La cadena tiene exactamente 8 caracteres");
        }else{
            System.out.println("La cadena no tiene 8 caracteres");
        }
    }
    
}
