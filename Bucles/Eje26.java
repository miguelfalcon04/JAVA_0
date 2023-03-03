package Bucles;

/* Ejercicio 26
Realiza un programa que pida primero un número y a continuación un dígito.
El programa nos debe dar la posición (o posiciones) contando de izquierda a
derecha que ocupa ese dígito en el número introducido.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        int n = sc.nextInt();
        int nvolt=0;

        do{

            nvolt=nvolt*10+n%10;
            n=n/10;

        }while(n>0);

        System.out.print("Introduzca un dígito: ");
        int dig = sc.nextInt();
        int nvolt2=0;

        System.out.printf("El digito %d se encuentra en las posiciones ",dig);

        int pos=1;
        do{

            nvolt2=nvolt2*10+nvolt%10;

            if(nvolt%10==dig){
                System.out.print(pos+" ");
            }

            nvolt=nvolt/10;
            pos++;

        }while(nvolt>0);

        sc.close();
    }
}
