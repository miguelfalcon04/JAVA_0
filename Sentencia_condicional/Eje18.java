package Sentencia_condicional;

/* Ejercicio 18
Escribe un programa que diga cuál es la primera cifra de un número entero
introducido por teclado. Se permiten números de hasta 5 cifras.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número de no más de 5 cifras: ");
        int n = sc.nextInt();

        if(n>=0 && n<=99999){

        if(n<=9){
            System.out.print("La primera cifra es "+n);
        }

        if(n>=10 && n<=99){
            System.out.print("La primera cifra es "+n/10);
        }

        if(n>=100 && n<=999){
            System.out.print("La primera cifra es "+n/100);
        }

        if(n>=1000 && n<=9999){
            System.out.print("La primera cifra es "+n/1000);
        }

        if(n>=10000){
            System.out.print("La primera cifra es "+n/10000);
        }
    }else{
        System.out.print("El número debe ser menos de 5 cifras y mayor de 0");
    }

        sc.close();
    }
}
