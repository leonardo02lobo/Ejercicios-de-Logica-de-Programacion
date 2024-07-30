/*
7. Realice un programa que lea de la entrada estándar números hasta que se introduzca un cero. 
En ese momento el programa debe terminar y mostrar en la salida estándar el número de valores mayores que cero 
leídos.
 */
package Aplicacion;

import java.util.Scanner;

public class Contar_Numeros {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = 1;
        int cont = 0;
        
        while(numero != 0){
            System.out.print("Digite un numero: ");
            numero = entrada.nextInt();
            
            if(numero > 0){
                cont++;
            }
        }
        
        System.out.println("EL total de numeros mayores a 0 es: "+cont);
    }
    
}
