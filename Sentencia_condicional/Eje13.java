package Sentencia_condicional;

/* Ejercicio 13
Escribe un programa que ordene tres números enteros introducidos por teclado

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el primer entero: ");
        int n1 = sc.nextInt();
        System.out.print("Introduzca el segundo entero: ");
        int n2 = sc.nextInt();
        System.out.print("Introduzca el tercer entero: ");
        int n3 = sc.nextInt();
        if (n1>n2 && n1>n3 && n2>n3){
            System.out.println("El orden es " + n3 + " " + n2 + " " + n1);
        }
        if (n1>n2 && n1>n3 && n3>n2){
            System.out.println("El orden es " + n2 + " " + n3 + " " + n1);
        }
        if (n2>n1 && n2>n3 && n1>n3){
            System.out.println("El orden es " + n3 + " " + n1 + " " + n2);
        }
        if (n2>n1 && n2>n3 && n3>n1){
            System.out.println("El orden es  " + n1 + " " + n3 + " " + n2);
        }
        if (n3>n1 && n3>n2 && n1>n2){
            System.out.println("El orden es " + n2 + " " + n1 + " " + n3);
        }
        if (n3>n1 && n3>n2 && n2>n1){
            System.out.println("El orden es "+ n1 + " " + n2 + " " + n3);
        }
        sc.close();
        
    }
}
