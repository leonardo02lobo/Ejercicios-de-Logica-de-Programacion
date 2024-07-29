/*
12. Escribe un programa que lea de la entrada estándar tres números. Después debe leer un 
cuarto número e indicar si el número coincide con alguno de los introducidos con anterioridad.
 */
package Aplicacion;

import java.util.Scanner;

public class Numeros_iguales {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite el primer numero: ");
        double num1 = entrada.nextDouble();

        System.out.print("Digite el segundo numero: ");
        double num2 = entrada.nextDouble();

        System.out.print("Digite el tercer numero: ");
        double num3 = entrada.nextDouble();

        System.out.println("Ahora vamos a determinar si el siguiente numero corresponde a alguno de los anteriores");

        System.out.print("Digite el cuarto numero: ");
        double num4 = entrada.nextDouble();

        if (num4 == num1) {
            System.out.println("El cuarto numero coincide con el primero");
        } else if (num4 == num2) {
            System.out.println("El cuarto numero coincide con el segundo");
        } else if (num4 == num3) {
            System.out.println("El cuarto numero coincide con el tercero");
        } else {
            System.out.println("El cuarto numero no coincide con ninguno de los anteriores");
        }
    }
}
