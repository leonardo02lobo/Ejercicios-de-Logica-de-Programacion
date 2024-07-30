/*
39. Escribe un programa que determine si un año es bisiesto y si además es divisible por 100.
 */
package Aplicacion;

import java.util.Scanner;

public class Anio_Bisiesto_Divisible {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite un anio: ");
        int anio = entrada.nextInt();
        
        if(anio % 4 == 0 && anio % 100 == 0){
              System.out.println("Es un anio bisiesto y es divisible entre 100");
        }else{
            System.out.println("Uno de los datos no son correctos");
        }
    }
    
}
