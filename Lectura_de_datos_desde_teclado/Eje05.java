package Lectura_de_datos_desde_teclado;

/* Ejercicio 5
Escribe un programa que calcule el área de un rectángulo.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el largo: ");
        int largo = sc.nextInt();

        System.out.print("Introduzca el ancho: ");
        int ancho = sc.nextInt();

        System.out.print("Área = "+(ancho*largo));

        sc.close();
    }
}
