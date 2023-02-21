package Sentencia_condicional;

/* Ejercicio 11
Escribe un programa que dada una hora determinada (horas y minutos), calcule
los segundos que faltan para llegar a la medianoche.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la hora en la que se encuentra: ");
        int h = sc.nextInt();

        System.out.print("Introduzca los segundos en los que se encuentra: ");
        int min = sc.nextInt();

        System.out.printf("Si son las %d:%d , quedan %d segundos para medianoche",h,min,((24*3600)-((h*3600)+(min*60))));

        sc.close();
    }
}
