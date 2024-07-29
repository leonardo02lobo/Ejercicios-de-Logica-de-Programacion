/*
19.Escribe un programa que determine si una persona puede votar (mayor de 18 años).
*/
package Aplicacion;

import java.util.Scanner;

public class Poder_Votar {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite su edad: ");
        int edad = entrada.nextInt();
        
        if(edad >= 18){
            System.out.println("Usted puede votar");
        }else{
            System.out.println("Usted no puede votar. No cumple la edad requerida");
        }
    }
}
