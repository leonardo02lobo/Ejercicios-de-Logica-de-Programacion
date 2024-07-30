/*
16. Escribe un programa que imprima los primeros 10 números de la serie de Fibonacci.
 */
package Aplicacion;

public class Sucesion_Fibonacci_2 {

    public static void main(String[] args) {
        int fibonacci = 0;
        int num1 = 1;
        int num2;
        
        for (int i = 0; i < 10; i++) {
            num2 = fibonacci;
            fibonacci += num1;
            num1 = num2;
            System.out.print(num1+" ");
        }
    }
    
}
