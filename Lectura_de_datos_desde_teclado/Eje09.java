package Lectura_de_datos_desde_teclado;

/* Ejercicio 9
Escribe un programa que calcule el volumen de un cono según la fórmula V = (1/3)πr2h

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la h para calcular el volumen: ");
        int h = sc.nextInt();

        System.out.print("Introduzca el radio  para calcular el volumen: ");
        int r = sc.nextInt();

        System.out.printf("V = %.2f",(((1.0/3.0)*(Math.PI)*(Math.pow(r, 2))*(h))));

        sc.close();
    }
}
