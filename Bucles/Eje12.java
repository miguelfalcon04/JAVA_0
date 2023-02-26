package Bucles;

/* Ejercicio 12
Escribe un programa que muestre los n primeros términos de la serie de
Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y
el resto se calcula sumando los dos anteriores, por lo que tendríamos que los
términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se debe
introducir por teclado.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Muestro los primeros n primeros números de la sucesión: ");
        int n = sc.nextInt();

        int n2=0;
        int n3=1;

        for(int i=0; i<n; i++){

            int aux = n2;
            n2=n3;
            n3 = aux+n3;
            System.out.print(" "+n3);

        }

        sc.close();
    }
}
