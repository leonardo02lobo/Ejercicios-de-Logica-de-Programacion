/*
14. Hacer un programa que simule un cajero automático con un saldo inicial
de 1000 dólares.
 */
package Aplicacion;

import java.util.Scanner;

public class Cajero_Automatico {

    public static void main(String[] args) {
        double saldoInicial = 1000;
        Scanner entrada = new Scanner(System.in);

        System.out.print("""
                           Cajero Automatico
                           1. Ingresar Saldo
                           2. Retirar Saldo
                           Opcion:
                           """);
        int opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Digite el saldo a ingresar: ");
                double saldo = entrada.nextDouble();

                saldoInicial += saldo;
                break;
            case 2:
                System.out.print("Digite el saldo a retirar: ");
                double retirar = entrada.nextDouble();

                if (retirar > saldoInicial) {
                    System.out.println("No se puede realizar el retiro, esa cantidad excede su saldo");
                } else {
                    saldoInicial -= retirar;
                }
                break;
        }
        System.out.println("Su saldo actual es de " + saldoInicial + "$");
    }

}
