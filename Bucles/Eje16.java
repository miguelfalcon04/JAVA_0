package Bucles;

/* Ejercicio 16
Escribe un programa que diga si un número introducido por teclado es o no
primo. Un número primo es aquel que sólo es divisible entre él mismo y la
unidad.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca su número: ");
        int nprimo = sc.nextInt();
        boolean n = true;
        int i = 1;

        while(i<nprimo-1 && n){
            i++;
            if(nprimo%i==0){
                n=false;
            }else{
                n=true;
            }
        }

        if(n){
            System.out.print(nprimo+ " es primo");
        }else{
            System.out.print(nprimo + " no es primo");
        }

        sc.close();
    }
}
