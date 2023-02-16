package Lectura_de_datos_desde_teclado;

/* Ejercicio 4
Escribe un programa que sume, reste, multiplique y divida dos números
introducidos por teclado.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca su primer número: ");
        int n1 = sc.nextInt();

        System.out.print("Introduzca su segundo número: ");
        int n2 = sc.nextInt();

        System.out.println(n1+" + "+n2+" = "+(n1+n2));
        System.out.println(n1+" - "+n2+" = "+(n1-n2));
        System.out.println(n1+" * "+n2+" = "+(n1*n2));
        System.out.printf("%d / %d = %.2f",n1,n2,((float)n1/(float)n2));

        sc.close();
    }
}
