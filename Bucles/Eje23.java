package Bucles;

/* Ejercicio 23
Escribe un programa que permita ir introduciendo una serie indeterminada
de números mientras su suma no supere el valor 10000. Cuando esto último
ocurra, se debe mostrar el total acumulado, el contador de los números
introducidos y la media.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        int suma=0;
        int cont=0;

        do{

            System.out.print("Vaya introduciendo números: ");
            n = sc.nextInt();

                cont++;

                suma+=n;

        }while(suma<10000);

        System.out.printf("El total acumulado es %d\n",suma);
        System.out.printf("Se ha introducido %d números\n",cont);
        System.out.printf("La media de números es %.2f\n",((float)suma+(float)cont));

        sc.close();
    }
}
