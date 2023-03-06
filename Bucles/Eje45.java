package Bucles;

/* Ejercicio 45
Escribe un programa que cambie un dígito dentro de un número dando la
posición y el valor nuevo. Las posiciones se cuentan de izquierda a derecha
empezando por el 1. Se recomienda usar long en lugar de int ya que el
primero admite números más largos. Suponemos que el usuario introduce
correctamente los datos.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje45{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca su número: ");
        int n = sc.nextInt();
        int volt1=0;
        int volt2=0;

        System.out.print("Indique la posición donde quiere insertar: ");
        int pos = sc.nextInt();

        System.out.print("Introduzca el dígito que quiere insertar: ");
        int dig = sc.nextInt();

        do{

            volt1=volt1*10+(n%10);
            n/=10;

        }while(n>0);

        int posv=1;

        do{

            volt2=volt2*10+(volt1%10);
            posv++;

                volt1/=10;

        }while(pos!=posv);

        int volt3=0;

        do{

            volt3=volt3*10+(volt1%10);
            volt1/=10;

        }while(volt1>0);

        System.out.printf("El número resultantes es %d%d%d",volt2,dig,volt3);

        sc.close();
    }
}