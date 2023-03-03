package Bucles;

/* Ejercicio 31
Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
mitad (división entera entre 2) de la altura más uno.
Ejemplo:

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje31 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la altura de la L: ");
        int alt = sc.nextInt(); 

        for(int i=1; i<=(alt-1);i++){
            System.out.println("*");
        }

        for(int i=0; i<((alt/2)+1);i++){
            System.out.print("* ");
        }

        sc.close();
    }
}
