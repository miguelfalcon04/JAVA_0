package Bucles;

/* Ejercicio 44
Escribe un programa que sea capaz de insertar un dígito dentro de un número
indicando la posición. El nuevo dígito se colocará en la posición indicada y el
resto de dígitos se desplazará hacia la derecha. Las posiciones se cuentan de
izquierda a derecha empezando por el 1. Suponemos que el usuario introduce
correctamente los datos. Se recomienda usar long en lugar de int ya que el
primero admite números más largos.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje44 {
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
