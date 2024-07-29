/*
13. Mostrar los meses del año, pidiéndole al usuario un número entre (1-12),
y mostrar el mes al que corresponde.
 */
package Aplicacion;

import java.util.Scanner;

public class Meses_del_anio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite el mes en numero (del 1 al 12): ");
        int mes = entrada.nextInt();

        switch (mes) {
            case 1:
                System.out.println("el mes es enero");
                break;
            case 2:
                System.out.println("el mes es febrero");
                break;
            case 3:
                System.out.println("el mes es marzo");
                break;
            case 4:
                System.out.println("el mes es abril");
                break;
            case 5:
                System.out.println("el mes es mayo");
                break;
            case 6:
                System.out.println("el mes es junio");
                break;
            case 7:
                System.out.println("el mes es julio");
                break;
            case 8:
                System.out.println("el mes es agosto");
                break;
            case 9:
                System.out.println("el mes es septiembre");
                break;
            case 10:
                System.out.println("el mes es octubre");
                break;
            case 11:
                System.out.println("el mes es noviembre");
                break;
            case 12:
                System.out.println("el mes es diciembre");
                break;
            default:
                System.out.println("No es ningun mes");
                break;
        }
    }

}
