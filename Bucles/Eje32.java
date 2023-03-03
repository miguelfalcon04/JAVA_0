package Bucles;

/* Ejercicio 32
Escribe un programa que, dado un número entero positivo, diga cuáles son y
cuánto suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de
izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir
números largos.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje32 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca su número: ");
        long n = sc.nextLong();

        long volt1=0;

        do{

            volt1=volt1*10+n%10;
            n=n/10;

        }while(n>0);

        long volt2=0;
        int suma=0;

        System.out.print("Dígitos pares: ");
        do{

            volt2=volt2*10+volt1%10;

            if((volt1%10)%2==0){
                System.out.print(volt1%10+" ");
                suma+=volt1%10;
            }
            volt1=volt1/10;

        }while(volt1>0);

        System.out.print("\nSuma de los dígitos pares: "+suma);

        sc.close();
    }
}
