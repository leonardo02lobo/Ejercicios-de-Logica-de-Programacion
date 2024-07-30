/*
33. Escribe un programa que determine el nombre del día de la semana dado un número (1-7).
 */
package Aplicacion;

import java.util.Scanner;

public class Dia_De_La_Semana {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite un numero para determinar el dia: ");
        int dia = entrada.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Hoy es Lunes");
                break;
            case 2:
                System.out.println("Hoy es Martes");
                break;
            case 3:
                System.out.println("Hoy es Miercoles");
                break;
            case 4:
                System.out.println("Hoy es Jueves");
                break;
            case 5:
                System.out.println("Hoy es Viernes");
                break;
            case 6:
                System.out.println("Hoy es Sabado");
                break;
            case 7:
                System.out.println("Hoy es Domingo");
                break;
            default:
                System.out.println("No existe el dia");
                break;
        }
    }

}
