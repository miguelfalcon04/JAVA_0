package Sentencia_condicional;

/* Ejercicio 6
Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
una altura h. Aplica la fórmula t = √(2h/g) siendo g = 9.81m/s^2

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la altura desde la que cae el objeto: ");
        int h = sc.nextInt();

        double g = 9.81;

        if(h<0){
            System.out.print("Introduzca una altura válida");
        }else if(h==0){
            System.out.print("Si no tiene altura tardará en caer 0 segundos");
        }else{
            System.out.printf("El objeto tardará en caer %.2f segundos",(Math.sqrt((2*h)/g)));
        }

        sc.close();
    }
}
