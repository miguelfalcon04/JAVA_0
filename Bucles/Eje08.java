package Bucles;

/* Ejercicio 8
Muestra la tabla de multiplicar de un número introducido por teclado.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Se mostrará la tabla del: ");
        int n = sc.nextInt();

        for(int i =1; i<=10; i++){
            System.out.println(n+" * "+i +" = "+(n*i));
        }

        sc.close();
    }
}
