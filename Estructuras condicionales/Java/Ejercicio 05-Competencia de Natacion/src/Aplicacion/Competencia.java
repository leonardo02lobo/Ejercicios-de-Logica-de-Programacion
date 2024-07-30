/*
5.Desarrollar una app, la cual al ingresar una edad nos muestre en consola en que categoría
de la carrera le corresponde, las categorías son las siguientes

•	Si la persona tiene entre 18 y 40 es categoría Libre
•	Si la persona tiene entre 40 y 60 es categoría A
•	Si la persona tiene más de 60 no puede competir en la carrera
 */
package Aplicacion;

import java.util.Scanner;

public class Competencia {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite su edad: ");
        int edad = entrada.nextInt();

        if (edad > 18 && edad < 40) {
            System.out.println("Usted es categoria Libre");
        } else if (edad >= 40 && edad < 60) {
            System.out.println("Usted es categoria A");
        } else {
            System.out.println("Usted no puede competir en ninguna carrera");
        }
    }

}
