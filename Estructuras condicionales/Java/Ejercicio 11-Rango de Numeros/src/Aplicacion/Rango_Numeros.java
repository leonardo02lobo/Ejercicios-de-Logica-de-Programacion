/*
11. Escriba un programa que solicite una edad (un entero) e indique en la salida estándar
si la edad introducida está en el rango [18-25].
*/
package Aplicacion;

import java.util.Scanner;

public class Rango_Numeros {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite un numero entero: ");
        int numero = entrada.nextInt();
        
        if(numero >= 18 && numero <= 25){
            System.out.println("El numero esta en el rango de 18 a 25");
        }else{
            System.out.println("El numero no esta en el rango de 18 a 25");
        }
    }
    
}
