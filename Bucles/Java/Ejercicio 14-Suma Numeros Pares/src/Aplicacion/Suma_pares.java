/*
14. Escribe un programa que imprima la suma de los números pares del 1 al 100.
 */
package Aplicacion;

public class Suma_pares {

    public static void main(String[] args) {
        int suma = 0;
        
        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 0){
                suma += i;
            }
        }
        System.out.println("La suma de los numeros pares es: "+suma);
    }
    
}
