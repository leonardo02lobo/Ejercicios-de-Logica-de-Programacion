/*
15. Hacer un menú que considere las siguientes opciones:
Ejercicios de Lógica de Programación 
Caso 1: Cubo de un numero
Caso 2: Numero par o impar
Case 3: salir.
Y desarrollar los casos
 */
package Aplicaciones;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("""
                           Digite su opcion:
                           1. Cubo un numero
                           2. Numero par o impar
                           3. Salir
                           Opcion: 
                           """);
        int opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Digite el numero: ");
                double cubo = entrada.nextDouble();
                System.out.println("El resultado es: " + Math.pow(cubo, 3));
                break;
            case 2:
                System.out.print("Digite el numero: ");
                int numero = entrada.nextInt();

                if (numero % 2 == 0) {
                    System.out.println("El numero es par");
                } else {
                    System.out.println("El numero es impar");
                }
                break;
            case 3:
                System.out.println("Hasta luego");
                break;
        }
    }

}
