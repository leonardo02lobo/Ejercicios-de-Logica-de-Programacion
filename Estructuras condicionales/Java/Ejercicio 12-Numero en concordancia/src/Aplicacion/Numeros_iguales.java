/*
12. Escribe un programa que lea de la entrada estándar tres números. Después debe leer un 
cuarto número e indicar si el número coincide con alguno de los introducidos con anterioridad.
 */
package Aplicacion;

import java.util.Scanner;

public class Numeros_iguales {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite el primer numero: ");
        double num1 = entrada.nextDouble();
        
        System.out.println("Digite el segundo numero: ");
        double num2 = entrada.nextDouble();
        
        System.out.println("Digite el tercer numero: ");
        double num3 = entrada.nextDouble();
    }
}
