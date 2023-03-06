package Bucles;

/* Ejercicio 41
Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
hay dentro de un número. Se recomienda usar long en lugar de int ya que el
primero admite números más largos.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje41{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca su número: ");
        long n = sc.nextLong();
        long save=n;

        long volt=0;
        int par=0;
        int imp=0;

        do{

            volt=volt*10+n%10;

            if((n%10)%2==0){
                par++;
            }else{
                imp++;
            }

            n/=10;

        }while(n>0);

        System.out.printf("El %d contiene %d dígitos pares y %d dígitos impares",save,par,imp);

        sc.close();
    }
}