package Sentencia_condicional;

/* Ejercicio 15
Escribe un programa que pinte una pirámide rellena con un carácter introducido
por teclado que podrá ser una letra, un número o un símbolo como *, +, -, $, &,
etc. El programa debe permitir al usuario mediante un menú elegir si el vértice
de la pirámide está apuntando hacia arriba, hacia abajo, hacia la izquierda o
hacia la derecha.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Elija el caracter para pintar la pirámide: ");
        char c = sc.next().charAt(0);

        System.out.print("Elija hacia adonde apunta el vertice\n");
        System.out.print("1. Arriba\n");
        System.out.print("2. Abajo\n");
        System.out.print("3. Derecha\n");
        System.out.print("4. Izquierda\n");
        int punta = sc.nextInt();

        switch(punta){
            case 1:
            System.out.println("  "+c);
            System.out.println(" "+c+c+c);
            System.out.println(""+c+c+c+c+c);
            break;

            case 2:
            System.out.println(""+c+c+c+c+c);
            System.out.println(" "+c+c+c);
            System.out.println("  "+c);
            break;

            case 3:
            System.out.println(c);
            System.out.println(c + " " + c);
            System.out.println(c + " " + c + " " + c);
            System.out.println(c + " " + c);
            System.out.println(c);
            break;

            case 4:
            System.out.println(" " + " " + c);
            System.out.println(" " + c + c);
            System.out.println(c +""+ c +""+ c);
            System.out.println(" " + c + c);
            System.out.println(" " + " " + c);
            break;

        }

        sc.close();
    }
}
