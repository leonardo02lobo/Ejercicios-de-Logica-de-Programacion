/*
34.Escribe un programa que determine el tipo de figura geométrica dada la 
cantidad de lados. Las figuras que existen son: 
• Triangulo
• Cuadrado
• hexágono
 */
package Aplicacion;

import java.util.Scanner;

public class Figuras {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite la cantidad de lados: ");
        int lados = entrada.nextInt();
        
        if(lados == 3){
            System.out.println("Es un Triangulo");
        }else if(lados == 4){
            System.out.println("Es un cuadrado");
        }else if(lados == 6){
            System.out.println("Es un hexagono");
        }else{
            System.out.println("Es otra figura");
        }
    }
    
}
