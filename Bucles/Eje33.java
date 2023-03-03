package Bucles;

/* Ejercicio 33
Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El
programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
dos asteriscos menos en la base para simular la curvatura de las esquinas
inferiores.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje33 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la altura de la U: ");
        int alt = sc.nextInt();

        for(int i=1; i<=(alt-1); i++){
            System.out.print("*");
            for(int j=0; j<=(alt-2);j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }

        for(int i=0; i<=alt;i++){
            if(i==0 || i==alt){
                System.out.print(" ");
            }else{
                System.out.print("*");
            }
        }

        sc.close();
    }
}
