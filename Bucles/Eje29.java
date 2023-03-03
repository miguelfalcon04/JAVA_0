package Bucles;

/* Ejercicio 29
Escribe un programa que muestre por pantalla todos los números enteros
positivos menores a uno leído por teclado que no sean divisibles entre otro
también leído de igual forma.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje29 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el número límite: ");
        int n = sc.nextInt();

        System.out.print("Introduce el dividendo: ");
        int div = sc.nextInt();

        for(int i=n; i>=0; i--){
            if(i%div!=0){
                System.out.print(i+" ");
            }
        }

        sc.close();
    }
}
