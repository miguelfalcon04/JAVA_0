package Lectura_de_datos_desde_teclado;

/* Ejercicio 2
Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
convertir debe ser introducida por teclado.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el numero de euros a convertir: ");
        int euros = sc.nextInt();

        System.out.print(euros+" euros son "+(euros*166.3860)+ " pesetas");

        sc.close();
    }
}
