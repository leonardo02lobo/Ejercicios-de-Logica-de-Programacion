/*
9. Escriba un programa que lea valores enteros hasta que se introduzca un 
valor en el rango [20-30] o se introduzca el valor 0. El programa debe entregar la suma de los 
valores mayores a 0 introducidos
 */
package Aplicacion;

import java.util.Scanner;

public class Contar_Numeros {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = 1;
        int cont = 0;

        while (numero != 0 && !(numero >= 20 && numero <= 30)) {
            System.out.print("Digite un numero: ");
            numero = entrada.nextInt();

            if (numero > 0) {
                cont++;
            }
        }

        System.out.println("EL total de numeros mayores a 0 es: " + cont);
    }
}
