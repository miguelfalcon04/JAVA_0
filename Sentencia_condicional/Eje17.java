package Sentencia_condicional;

/* Ejercicio 17
Escribe un programa que diga cuál es la última cifra de un número entero
introducido por teclado.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        int n = sc.nextInt();

        int ult = n%10;

        System.out.printf("La última cifra de %d es %d",n,ult);

        sc.close();
    }
}
