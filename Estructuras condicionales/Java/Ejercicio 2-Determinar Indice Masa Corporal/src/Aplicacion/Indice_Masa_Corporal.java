/*
2. Desarrollar una app, la cual, al ingresar tu peso y altura, determinar tu índice de masa corporal de la siguiente manera:
    -De 18.5 a 24.9: peso normal
    -De 25 a 29.9: sobre peso
    -De 30-34.5: Obesidad
El índice de masa corporal se calcula con la siguiente formula = peso/altura x altura
*/
package Aplicacion;

import java.util.Scanner;

public class Indice_Masa_Corporal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite su peso en Kg:");
        double peso = entrada.nextDouble();
        
        System.out.print("Digite su altura en m: ");
        double altura = entrada.nextDouble();
        
        double resultado = peso/Math.pow(altura, 2);
        
        if(resultado >= 18.5 && resultado <= 24.9){
            System.out.println("Usted tiene un peso normal");
        }else if(resultado >= 25 && resultado <= 29.9){
            System.out.println("Usted tiene sobre peso");
        }else if(resultado >= 30 && resultado <= 34.5){
            System.out.println("Usted tiene Obesidad");
        }
        System.out.println("El resultado de los calculos es de: "+resultado);
    }
    
}
