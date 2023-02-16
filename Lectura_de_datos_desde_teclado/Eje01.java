package Lectura_de_datos_desde_teclado;

/* Ejercicio 1
Realiza un programa que pida dos números y que luego muestre el resultado
de su multiplicación.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el primer número: ");
        int n1 = sc.nextInt();

        System.out.print("Introduzca el segundo número: ");
        int n2 = sc.nextInt();

        System.out.print(n1+" * "+n2+" = "+(n1*n2));

        sc.close();
    }
}
