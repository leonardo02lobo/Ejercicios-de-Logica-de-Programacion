/*
7. Escriba un programa que lea dos números y determine cuál de ellos es el mayor.
*/
package Aplicacion;

import java.util.Scanner;

public class Mayor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite el primer numero(puede ser con coma flotante): ");
        double num1 = entrada.nextDouble();
        
        System.out.print("Digite el segundo numero(puede ser con coma flotante): ");
        double num2 = entrada.nextDouble();
        
        if(num1 > num2){
            System.out.println("El numero "+num1+" es mayor al numero "+num2);
        }else{
            System.out.println("El numero "+num2+" es mayor al numero "+num1);
        }
    }
    
}
