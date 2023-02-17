package Sentencia_condicional;

/* Ejercicio 3
Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre del día de la semana.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número de la semana: ");
        int dia = sc.nextInt();

        switch(dia){

            case 1:
                System.out.print("Lunes");
            break;

            case 2:
                System.out.print("Martes");
            break;

            case 3:
            System.out.print("Miércoles");
            break;

            case 4:
            System.out.print("Jueves");
            break;

            case 5:
            System.out.print("Viernes");
            break;

            case 6:
            System.out.print("Sábado");
            break;

            case 7:
            System.out.print("Domingo");
            break;
        }

        if(dia>7){
            System.out.print("Introduzca un número válido");
        }

        sc.close();
    }
}
