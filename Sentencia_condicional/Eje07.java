package Sentencia_condicional;

/* Ejercicio 7
Realiza un programa que calcule la media de tres notas.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double nota;
        double media=0;

        for (int i = 0; i<=2; i++){
            System.out.printf("Introduzca la nota %d: ",i);
            nota = sc.nextInt(); 

            media= media+nota;
        }

        System.out.printf("La media de sus notas es de %.2f",(media/3));

        sc.close();
    }
}
