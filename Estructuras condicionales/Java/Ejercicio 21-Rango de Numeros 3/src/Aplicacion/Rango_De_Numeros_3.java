/*
21.Escribe un programa que determine si un número está fuera de un rango  (5-15).
 */
package Aplicacion;

import java.util.Scanner;

public class Rango_De_Numeros_3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite un numero: ");
        int numero = entrada.nextInt();
        
        if(numero >= 5 && numero <= 15){
            System.out.println("El numero esta en el rango de 5 a 15");
        }else{
            System.out.println("El numero no se encuentra en el rango de 5 a 15");
        }
    }
    
}
