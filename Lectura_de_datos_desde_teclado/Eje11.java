package Lectura_de_datos_desde_teclado;

/* Ejercicio 11
Realiza un conversor de Kb a Mb.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca los Kb a convertir: ");
        int kb = sc.nextInt();

        System.out.printf("%d Kb son %.2f Mb",kb,(float)(kb/1000));

        sc.close();
    }
}
