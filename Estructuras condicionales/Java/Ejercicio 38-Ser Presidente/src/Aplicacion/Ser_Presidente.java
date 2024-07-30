/*
38. Escribe un programa que determine si una persona puede votar y si también es elegible para
ser presidente (mayor de 35 años).
 */
package Aplicacion;

import java.util.Scanner;

public class Ser_Presidente {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite su edad: ");
        int edad = entrada.nextInt();
        
        if(edad >= 18){
            System.out.println("Puede Votar");
        }
        if(edad >= 35){
            System.out.println("Y puede ser presidente");
        }else{
            System.out.println("No puede ser presidente");
        }
    }
    
}
