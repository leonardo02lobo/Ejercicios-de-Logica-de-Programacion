/*
20.Escribe un programa que determine si un número está dentro de un rango (10-20).
 */
package Aplicacion;

import java.util.Scanner;

public class Rango_De_Numeros_2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite un numero: ");
        int numero = entrada.nextInt();
        
        if(numero >= 10 && numero <= 20){
            System.out.println("El numero esta en el rango de 10 a 20");
        }else{
            System.out.println("El numero no se encuentra en el rango de 10 a 20");
        }
    }
    
}
