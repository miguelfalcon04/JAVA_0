package Bucles;

/* Ejercicio 21
Realiza un programa que vaya pidiendo números hasta que se introduzca un
numero negativo y nos diga cuantos números se han introducido, la media de
los impares y el mayor de los pares. El número negativo sólo se utiliza para
indicar el final de la introducción de datos pero no se incluye en el cómputo.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        int cont=0;
        int contimp=0;
        int maxpar=0;

        double sumaimp=0;

        do{

            System.out.print("Vaya introduciendo números: ");
            n = sc.nextInt();

            if(n>0){

                cont++;

                if(n%2!=0){
                    contimp++;
                    sumaimp+=n;
                }

                if(n%2==0 && n>maxpar){
                    maxpar=n;
                }

            }

        }while(n>0);

        System.out.printf("Se han introducido %d números\n",cont);
        System.out.printf("La media de los impares es %.2f\n",((float)sumaimp/(float)contimp));
        System.out.printf("El mayor de los pares es %d\n",maxpar);

        sc.close();
    }
}
