/*
17. Escribe un programa que determine el número mayor en un arreglo de números. 
Se pueden usar una búsqueda secuencial
 */
package Aplicacion;

public class Mayor {

    public static void main(String[] args) {
        int arreglo[] = {2,4,6,43,2,12,45,99,32,34,98};
        int mayor = 0;
        
        for (int i = 0; i < arreglo.length; i++) {
            if(mayor < arreglo[i]){
                mayor = arreglo[i];
            }
        }
        System.out.println("El mayor numero del arreglo es el "+mayor);
    }
    
}
