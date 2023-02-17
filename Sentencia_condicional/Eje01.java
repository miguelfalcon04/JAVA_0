package Sentencia_condicional;

/* Ejercicio 1
Escribe un programa que pida por teclado un día de la semana y que diga qué
asignatura toca a primera hora ese día.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el día de la semana: ");
        String dia = sc.nextLine();

        if(dia.equals("lunes")){
            System.out.print("Programación");
        }

        if(dia.equals("martes")){
            System.out.print("SSII");
        }

        if(dia.equals("miercoles")){
            System.out.print("EEDD");
        }

        if(dia.equals("jueves")){
            System.out.print("Programación");
        }

        if(dia.equals("viernes")){
            System.out.print("FOL");
        }

        sc.close();
    }
}
