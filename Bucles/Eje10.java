package Bucles;

/* Ejercicio 10
Escribe un programa que calcule la media de un conjunto de números positivos
introducidos por teclado. A priori, el programa no sabe cuántos números se
introducirán. El usuario indicará que ha terminado de introducir los datos
cuando meta un número negativo.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        int conjunto=0;
        int suma=0;

        do{

            System.out.print("Introduzca un número: ");
            n = sc.nextInt();
            if(n>0){
                suma=suma+n;
                conjunto++;
            }

        }while(n>0);

        System.out.printf("La media de los %d numeros es %.2f",conjunto,((float)suma/(float)conjunto));

        sc.close();
    }
}
