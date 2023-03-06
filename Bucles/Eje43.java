package Bucles;

/* Ejercicio 43
Escribe un programa que permita partir un número introducido por teclado en
dos partes. Las posiciones se cuentan de izquierda a derecha empezando por
el 1. Suponemos que el usuario introduce correctamente los datos, es decir,
el número introducido tiene dos dígitos como mínimo y la posición en la que
se parte el número está entre 2 y la longitud del número. No se permite en
este ejercicio el uso de funciones de manejo de String (por ej. para extraer
subcadenas dentro de una cadena).

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje43 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca su número: ");
        int n = sc.nextInt();
        int volt1=0;
        int volt2=0;

        System.out.print("Indique la posición donde partir: ");
        int pos = sc.nextInt();

        do{

            volt1=volt1*10+(n%10);
            n/=10;

        }while(n>0);

        int posv=1;

        do{

            volt2=volt2*10+(volt1%10);
            posv++;

            volt1/=10;

        }while(pos!=posv);

        int volt3=0;

        do{

            volt3=volt3*10+(volt1%10);
            volt1/=10;

        }while(volt1>0);

        System.out.printf("Los números partidos son %d y el %d",volt2,volt3);

        sc.close();
    }
}
