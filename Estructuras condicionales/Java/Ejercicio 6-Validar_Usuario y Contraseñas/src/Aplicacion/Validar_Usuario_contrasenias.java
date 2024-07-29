/*
6.Crear un sistema donde se escriba por consola el usuario y la contraseña
(El usuario y contraseña ya tiene que estar pre establecidos)
y validar si son igual a las variables pre establecidas usando condiciones 
*/
package Aplicacion;

import java.util.Scanner;

public class Validar_Usuario_contrasenias {

    public static void main(String[] args) {
        String usuario = "Admin";
        String contrasenia = "123";
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite el usuario: ");
        String usuarioV = entrada.next();
        
        System.out.print("Digite la contrasenia: ");
        String contraseniaV = entrada.next();
        
        if(usuario.equals(usuarioV) && contrasenia.equals(contraseniaV)){
            System.out.println("Usuario y contrasenia correctos");
        }else{
            System.out.println("Upss.. Algo a salido mal");
        }
    }
}
