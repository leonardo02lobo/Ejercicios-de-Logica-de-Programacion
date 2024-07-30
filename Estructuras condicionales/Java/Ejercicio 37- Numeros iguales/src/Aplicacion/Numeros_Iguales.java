/*
37. Escribe un programa que determine si dos números son iguales, y si no, cuál es mayor
 */
package Aplicacion;

import java.util.Scanner;

public class Numeros_Iguales {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite el primer numero: ");
        double num1 = entrada.nextDouble();
        
        System.out.print("Digite el segundo numero: ");
        double num2 = entrada.nextDouble();
        
        if(num1 != num2){
            if(num1 > num2){
                System.out.println("El numero "+num1+" es mayor a "+num2);
            }else{
                System.out.println("El numero "+num2+" es mayor a "+num1);
            }
        }else{
            System.out.println("Los numeros son iguales");
        }
    }
    
}
