package Bucles;

/* Ejercicio 5
Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando
un bucle while.

@author Miguel Falcón
*/

public class Eje05 {
    public static void main(String[] args) {

        int n = 320;

        while(n>=160){
            System.out.print(n+" ");
            n=n-20;
        }

    }
}
