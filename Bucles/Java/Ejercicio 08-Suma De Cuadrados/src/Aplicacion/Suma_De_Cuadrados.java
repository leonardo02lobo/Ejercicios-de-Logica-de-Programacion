/*
8. Realice un programa que calcule y muestre en la salida estándar la suma de los cuadrados de los 10 primeros enteros mayores que cero.
 */
package Aplicacion;

public class Suma_De_Cuadrados {

    public static void main(String[] args) {
        int resultado = 0;
        
        for (int i = 0; i < 10; i++) {
            resultado += Math.pow(i, 2);
        }
        System.out.println("El resultado del cuadrado de los 10 primeros numeros es: "+resultado);
    }
    
}
