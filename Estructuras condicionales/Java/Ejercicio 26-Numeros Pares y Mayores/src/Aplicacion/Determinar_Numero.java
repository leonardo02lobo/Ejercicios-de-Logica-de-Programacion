/*
26. Escribe un programa que determine si un número es impar y mayor que 10.
 */
package Aplicacion;

import java.util.Scanner;

public class Determinar_Numero {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite el numero: ");
        int numero = entrada.nextInt();
        
        if((numero %2 == 0) && numero > 10){
            System.out.println("El numero es par y es mayor a 10");
        }else{
            System.out.println("""
                               El numero no cumple con uno de los dos requerimientos
                               O no es mayor a 10 o no es par""");
        }
    }
    
}
