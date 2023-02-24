package Bucles;

/* Ejercicio 3
Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while.

@author Miguel Falcón
*/

public class Eje03 {
    public static void main(String[] args) {

        int n=0;

        do{
            System.out.print(n+" ");
            n=n+5;
        }while(n<=100);

    }
}
