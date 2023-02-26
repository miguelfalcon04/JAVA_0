package Bucles;

/* Ejercicio 19
Realiza un programa que pinte una pirámide por pantalla. La altura se debe
pedir por teclado. El carácter con el que se pinta la pirámide también se debe
pedir por teclado.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la altura: ");
        int alt = sc.nextInt();

        System.out.print("Introduzca el caracter con el que pintar la pirámde: ");
        String pinta = sc.next();

        for(int i=0; i<alt;i++){
            for(int k=i; k<alt-1; k++){
                System.out.print(" ");
            }

            for(int j=1; j<i*2;j++){
                System.out.print(pinta);
            }

            System.out.println("");
        }

        sc.close();
    }
}
