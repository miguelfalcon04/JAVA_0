package Bucles;

/* Ejercicio 6
Muestra los números del 320 al 160, contando de 20 en 20 utilizando un bucle
do-while.

@author Miguel Falcón
*/

public class Eje06 {
    public static void main(String[] args) {

        int n = 320;

        do{
            System.out.print(n+" ");
            n=n-20;
        }while(n>=160);

    }
}
