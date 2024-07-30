/*
1. Crear el algoritmo de fizz-buzz que muestre en consola los números del 1 
al 100, sustituyendo los siguientes:
- Múltiplos de 3 “fizz”
- Múltiplos de 5 “buzz”
- Múltiplos de 3 y 5 a la vez “fizz-buzz”
 */
package Aplicacion;

public class Fizz_Buzz {

    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if(i % 3 == 0  && i % 5 == 0){
                System.out.println(i+": Fizz-Buzz");
            }else if(i % 3==0){
                System.out.println(i+": Fizz");
            }else if(i % 5 == 0){
                System.out.println(i+": Buzz");
            }else{
                System.out.println(i);
            }
        }
    }
    
}
