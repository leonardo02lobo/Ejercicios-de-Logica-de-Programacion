/*
13. Escribe un programa que determine si una cadena de texto contiene la letra 'a'.
 */
package Aplicacion;

import java.util.Scanner;

public class Obtener_Letra {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean band = false;
        
        System.out.print("Digite la frase: ");
        String texto = entrada.nextLine();
        
        for (int i = 0; i < texto.length(); i++) {
            if(texto.charAt(i) == 'a'){
                band = true;
            }
        }
        if(band){
            System.out.println("Se encontro la letra a");
        }else{
            System.out.println("Esta palabra no tiene la letra a");
        }
    }
    
}
