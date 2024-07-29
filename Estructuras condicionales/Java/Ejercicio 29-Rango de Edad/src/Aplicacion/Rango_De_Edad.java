/*
29. Escribe un programa que determine si una persona es mayor de 18 y menor de 30 años.
 */
package Aplicacion;

import java.util.Scanner;

public class Rango_De_Edad {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite la edad: ");
        int edad = entrada.nextInt();
        
        if(edad >= 18 && edad <= 30){
            System.out.println("La edad esta en el rango de 18 a 30");
        }else{
            System.out.println("La edad no esta en el rango de 18 a 30");
        }
    }
    
}
