package Bucles;

/* Ejercicio 20
Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje20 {
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

            for(int j=1; j<(i*2)+1;j++){
                System.out.print(" ");
            }

            System.out.println(pinta);
        }

    }
}
