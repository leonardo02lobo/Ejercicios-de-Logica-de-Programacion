/*
2. Escribe un programa que imprima los 50 primeros números de la 
sucesión de Fibonacci empezando en 0.
- La serie Fibonacci se compone por una sucesión de números en la 
que el siguiente siempre es la suma de los dos anteriores.
0, 1, 1, 2, 3, 5, 8, 13...
 */
package Aplicacion;

public class Fibonacci {

    public static void main(String[] args) {
        int fibonacci = 0;
        int t1 = 1;
        int t2;
        
        for (int i = 0; i < 50; i++) {
            t2 = fibonacci;
            fibonacci += t1;
            t1 = t2;
            System.out.print(t1+" ");
        }
    }

}
