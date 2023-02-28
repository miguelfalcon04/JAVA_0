package Bucles;

/* Ejercicio 25
Realiza un programa que pida un número por teclado y que luego muestre ese
número al revés.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        int n = sc.nextInt();

        int nvolt=0;

        do{
            nvolt=nvolt*10+n%10;
            n=n/10;

        }while(n>0);

        System.out.print(nvolt);

        sc.close();
    }
}
