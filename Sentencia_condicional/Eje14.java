package Sentencia_condicional;

/* Ejercicio 14
Realiza un programa que diga si un número introducido por teclado es par y/o
divisible entre 5.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca su número: ");
        int n = sc.nextInt();

        if(n%2==0){
            System.out.printf("%d es par",n);
        }
        if(n%5==0){
            System.out.print(" y además divisible entre 5");
        }

        sc.close();
    }
}
