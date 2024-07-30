/*
3. Crear un juego donde nos genere un numero aleatorio el usuario debe adivinar el numero en el menor tiempo posible usando bucles
 */
package Aplicacion;

import java.util.Scanner;

public class Adivina_El_Numero {

    public static void main(String[] args) {
        int numero = (int)(Math.random()*100)+1;
        Scanner entrada = new Scanner(System.in);
        int res = 0;
        
        while(res != numero){
            System.out.print("Digite el numero: ");
            res = entrada.nextInt();
            
            if(res > numero){
                System.out.println("""
                                   El numero registrado es muy alto
                                   Intenta de Nuevo...
                                   """);
            }else if(res < numero){
                System.out.println("""
                                   El numero registrado es muy bajo
                                   Intenta de Nuevo...
                                   """);
            }else{
                System.out.println("El numero fue acertado");
            }
        }
    }
    
}
