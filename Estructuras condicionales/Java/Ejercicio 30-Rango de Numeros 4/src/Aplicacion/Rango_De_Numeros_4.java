/*
30. Escribe un programa que determine si un número está en el rango de 10 a 20,
excluyendo los extremos.
 */
package Aplicacion;

import java.util.Scanner;

public class Rango_De_Numeros_4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite un numero: ");
        int edad = entrada.nextInt();
        
        if(edad > 10 && edad < 20){
            System.out.println("El numero esta en el rango de 10 a 20");
        }else{
            System.out.println("El numero no esta en el rango de 10 a 20");
        }
    }
    
}
