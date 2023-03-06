package Bucles;

/* Ejercicio 37
Realiza un conversor del sistema decimal al sistema de “palotes”.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje37 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número: ");
        int n1 = sc.nextInt();
        int volt1=0;
        int rect1=0;

        do{

            volt1=volt1*10+n1%10;
            n1/=10;

        }while(n1>0);

        do{

            rect1=rect1*10+(volt1%10);

            for(int i=1; i<=(volt1%10);i++){
                System.out.print("|");
            }

            System.out.print("-");

            volt1/=10;

        }while(volt1>0);

        sc.close();
    }
}
