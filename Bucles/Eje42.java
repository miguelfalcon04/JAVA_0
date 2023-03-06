package Bucles;

/* Ejercicio 42
Escribe un programa que pida un número entero positivo por teclado y que
muestre a continuación los 5 números consecutivos a partir del número
introducido. Al lado de cada número se debe indicar si se trata de un primo
o no.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje42 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        int n = sc.nextInt();

        boolean esPrimo=true;

        for(int i=n; i<n+5; i++){
            esPrimo=true;

                for(int k=2; k<i;k++){

                    if(i%k==0){
                        esPrimo=false;
                    }

                }

            System.out.print(i+" ");
            if(esPrimo==true){
                System.out.print("es primo\n");
            }else{
                System.out.print("no es primo\n");
            }
        }

        sc.close();
    }
}
