/*
3. Desarrollar una app, la cual por medio de la edad apta para conducir de X país,
determinar si la persona puede conducir o no
*/
package Aplicacion;

import java.util.Scanner;

public class Edad_Para_conducir {

    public static void main(String[] args) {
        final int edad_Minima = 18;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite su edad: ");
        int edad = entrada.nextInt();
        
        if(edad >= edad_Minima){
            System.out.println("Usted puede conducir ya que cumple con la edad minima");
        }else{
            System.out.println("Usted no puede conducir. No cumple con la edad minima");
        }
    }
    
}
