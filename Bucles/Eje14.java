package Bucles;

/* Ejercicio 14
Escribe un programa que pida una base y un exponente (entero positivo) y que
calcule la potencia.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la base: ");
        int base = sc.nextInt();

        System.out.print("Introduzca el exponente: ");
        int exp = sc.nextInt();

        int num=1;

        for(int i=0; i<exp;i++){
            num=num*base;
        }

        System.out.print("La potencia es "+num);

        sc.close();
    }
}
