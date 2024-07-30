/*
6. Realice un programa que solicite de la entrada estándar un entero del 1 al 10 y muestre en la salida 
estándar su tabla de multiplicar.
 */
package Aplicacion;

import java.util.Scanner;

public class Tabla_De_Multiplicar {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite un numero del 1 al 10(Entero): ");
        int numero = entrada.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(i+"x"+numero+"= "+(i*numero));
        }
    }
    
}
