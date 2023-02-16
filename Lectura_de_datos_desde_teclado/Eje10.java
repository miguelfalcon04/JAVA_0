package Lectura_de_datos_desde_teclado;

/* Ejercicio 10
Realiza un conversor de Mb a Kb.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca los Mb a convertir: ");
        int mb = sc.nextInt();

        System.out.printf("%d Mb son %d Kb",mb,(mb*1000));

        sc.close();
    }
}
