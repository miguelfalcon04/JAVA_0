package Lectura_de_datos_desde_teclado;

/* Ejercicio 6
Escribe un programa que calcule el área de un triángulo.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la base: ");
        int base = sc.nextInt();

        System.out.print("Introduzca la altura: ");
        int altura = sc.nextInt();

        System.out.printf("Área = %.2f",((float)(base*altura)/2));

        sc.close();
    }
}
