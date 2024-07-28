/*
1.Desarrollar una app, la cual al ingresar un numero determinar si es par o impar
*/
package Aplicacion;

import java.util.Scanner;

public class Par_o_Impar {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite un numero:");
        int numero = entrada.nextInt();
        
        if(numero %2 == 0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
    }
}
