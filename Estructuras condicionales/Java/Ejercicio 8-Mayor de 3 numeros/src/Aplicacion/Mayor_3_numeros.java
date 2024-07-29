/*
8. Escriba un programa que lea tres números y determine cuál de ellos es el mayor.
*/
package Aplicacion;

import java.util.Scanner;

public class Mayor_3_numeros {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite el primer numero(puede ser de coma flotante): ");
        double num1 = entrada.nextDouble();
        
        System.out.print("Digite el segundo numero(puede ser de coma flotante): ");
        double num2 = entrada.nextDouble();
        
        System.out.print("Digite el tercer numero(puede ser de coma flotante): ");
        double num3 = entrada.nextDouble();
        
        if(num1 > num2){
            if(num1 > num3){
                System.out.println("El numero mayor es "+num1);
            }else{
                System.out.println("El numero mayor es "+num3);
            }
        }else{
            if(num2 > num3){
                System.out.println("El numero mayor es "+num2);
            }else{
                System.out.println("El numero mayor es "+num3);
            }
        }
        /*
        Otra forma
        
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("El numero mayor es " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("El numero mayor es " + num2);
        } else {
            System.out.println("El numero mayor es " + num3);
        }
        */
    }
    
}
