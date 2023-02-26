package Bucles;

/* Ejercicio 17
Realiza un programa que sume los 100 números siguientes a un número entero
y positivo introducido por teclado. Se debe comprobar que el dato introducido
es correcto (que es un número positivo).

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        int n = sc.nextInt();

        int suma=0;

        if(n>0){

            for(int i=n; i<n+100;i++){
                suma=suma+i;
            }

        System.out.print("La suma es: "+suma);

        }else{
            System.out.print("El número debe ser positivo");
        }


        sc.close();
    }
}
