package Bucles;

/* Ejercicio 18
Escribe un programa que obtenga los números enteros comprendidos entre dos
números introducidos por teclado y validados como distintos, el programa debe
empezar por el menor de los enteros introducidos e ir incrementando de 7 en
7.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        int n1 = sc.nextInt();

        System.out.print("Introduzca otro número: ");
        int n2 = sc.nextInt();

        int max = 0;
        int min = 0;

        if(n1!=n2){

            if(n1>n2){
                max=n1;
                min=n2;
            }else{
                max=n2;
                min=n1;
            }

            for(int i=min; i<=max; i+=7){
                System.out.print(i+" ");
            }

        }else{
            System.out.print("Los números deben ser distintos");
        }

        sc.close();
    }
}
