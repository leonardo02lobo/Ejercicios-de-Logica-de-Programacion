/*
17. Escribe un programa que determine si un año es bisiesto
 */
package Aplicacion;

import java.util.Scanner;

public class Anio_Bisiesto {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite un anio: ");
        int anio = entrada.nextInt();
        
        if(anio % 4 == 0){
            System.out.println("Es un anio bisiesto");
        }else{
            System.out.println("No es un anio bisiesto");
        }
    }
    
}
