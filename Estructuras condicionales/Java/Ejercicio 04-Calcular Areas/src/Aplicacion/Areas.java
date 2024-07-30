/*
4.  Desarrollar una app para calcular el área de las siguientes figuras:
	Cuadrado = lado* lado
	Rectángulo = base* altura
	Triangulo = (base *altura) /2
	Circulo = pi .  r^2
    Y calcular su área

 */
package Aplicacion;

import java.util.Scanner;

public class Areas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite la figura");
        System.out.print("""
                           1. Cuadrado
                           2. Rectangulo
                           3. Triangulo
                           4. Circulo
                           Digite su opcion: """);
        int opcion = entrada.nextInt();

        System.out.println("");
        switch (opcion) {
            case 1 -> {
                System.out.print("Digite el lado: ");
                double lado = entrada.nextDouble();

                System.out.println("El area del cuadrado es: " + (lado * lado));
            }
            case 2 -> {
                System.out.print("Digite el lado: ");
                double lado = entrada.nextDouble();

                System.out.print("Digite la altura: ");
                double altura = entrada.nextDouble();

                System.out.println("El area del rectangulo es: " + (lado * altura));
            }
            case 3 -> {
                System.out.print("Digite el lado: ");
                double lado = entrada.nextDouble();

                System.out.print("Digite la altura: ");
                double altura = entrada.nextDouble();

                System.out.println("El area del Triangulo es: " + ((lado * altura) / 2));
            }
            case 4 -> {
                System.out.print("Digite el radio: ");
                double radio = entrada.nextDouble();

                System.out.println("El radio del circulo es: " + (Math.PI * Math.pow(radio, 2)));
            }
        }
    }
}
