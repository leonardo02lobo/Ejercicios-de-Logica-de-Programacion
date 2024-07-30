/*
4. Elaborar un programa que nos permita evaluar un correo electrónico (el 
correo tiene que contener un @ para considerarse un correo 
electrónico), para ello se utiliza la clase charArt y length respectivamente 
para validar el correo
 */
package Aplicacion;

import java.util.Scanner;

public class Validar_Correo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean band = false;
        System.out.print("Digite un correo electronico: ");
        String texto = entrada.nextLine();
        
        for (int i = 0; i < texto.length(); i++) {
            if(texto.charAt(i) == '@'){
                band = true;
                break;
            }
        }
        
        if(band){
            System.out.println("El correo electronico es correcto");
        }else{
            System.out.println("El correo electronico es incorrecto");
        }
    }
}
