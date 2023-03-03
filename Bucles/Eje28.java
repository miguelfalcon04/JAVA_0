package Bucles;

/* Ejercicio 28
Escribe un programa que calcule el factorial de un número entero leído por
teclado.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje28 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número entero: ");
        int n = sc.nextInt();

        int multi=1;

        for(int i=n; i>=1; i--){
            multi*=i;
        }

        System.out.printf("%d!= %d",n,multi);

        sc.close();
    }
}
