package Bucles;

/* Ejercicio 15
Escribe un programa que dados dos números, uno real (base) y un entero
positivo (exponente), saque por pantalla todas las potencias con base el
numero dado y exponentes entre uno y el exponente introducido. No se deben
utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
se deberán mostrar 2^1, 2^2, 2^3, 2^4 y 2^5.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la base: ");
        int base = sc.nextInt();

        System.out.print("Introduzca el exponente: ");
        int exp = sc.nextInt();

        for(int i=1; i<=exp;i++){

            System.out.println("La potencia es "+base+"^"+i);

        }

        sc.close();
    }
}
