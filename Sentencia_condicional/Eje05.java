package Sentencia_condicional;

/* Ejercicio 5
Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b =0).

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el valor de a: ");
        int a = sc.nextInt();

        System.out.print("Introduzca el valor de b: ");
        int b = sc.nextInt();

        if(a!=0){
            System.out.printf("El valor de x es de : %.1f",((float)(-b)/a));
        }else{
            System.out.print("a debe ser distinto de 0");
        }

        sc.close();
    }
}
