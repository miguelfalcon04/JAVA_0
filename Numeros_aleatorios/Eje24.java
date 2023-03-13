package Numeros_aleatorios;

/* Ejercicio 24
Escribe un programa que, dado un número introducido por teclado, elija al azar
uno de sus dígitos.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número entero positivo: ");
        int n = sc.nextInt();
        int volt1=0;
        int cont=0;

        do{

            volt1=volt1*10+n%10;
            cont++;
            n/=10;

        }while(n>0);

        int azar = (int)(Math.random()*(cont+1));

        int volt2=0;
        cont=0;

        do{

            volt2=volt2*10+volt1%10;
            cont++;
            volt1/=10;

        }while(azar!=cont);

        System.out.println(volt2%10);

        sc.close();
    }
}
