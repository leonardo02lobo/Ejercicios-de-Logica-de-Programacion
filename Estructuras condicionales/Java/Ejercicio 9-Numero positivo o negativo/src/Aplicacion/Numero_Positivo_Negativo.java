/*
9. Comprobar si un número digitado por el usuario es positivo o negativo.
 */
package Aplicacion;

import java.util.Scanner;

public class Numero_Positivo_Negativo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite el numero: ");
        double num = entrada.nextDouble();
        
        if(num > 0){
            System.out.println("El numero es positivo");
        }else{
            System.out.println("El numero es negativo");
        }
    }
    
}
