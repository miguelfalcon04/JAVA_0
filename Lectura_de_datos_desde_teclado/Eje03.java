package Lectura_de_datos_desde_teclado;

/* Ejercicio 3
Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
convertir debe ser introducida por teclado

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el numero de pesetas a convertir: ");
        int pesetas = sc.nextInt();

        System.out.printf("%d pesetas son %.2f euros",pesetas,((float)pesetas/166.3860));

        sc.close();
    }
}
