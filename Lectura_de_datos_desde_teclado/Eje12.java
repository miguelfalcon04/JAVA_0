package Lectura_de_datos_desde_teclado;

/* Ejercicio 12
Realiza un programa que calcule la nota que hace falta sacar en el segundo
examen de la asignatura Programación para obtener la media deseada. Hay
que tener en cuenta que la nota del primer examen cuenta el 40% y la del
segundo examen un 60%

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("¿Qué media desea obtener?: ");
        float media = sc.nextFloat();

        System.out.print("¿Qué sacó en el primer exámen?: ");
        float ex1= sc.nextFloat();

        System.out.printf("Si desea obtener un %.1f de media en este trimestre debe sacar un %.2f en el segundo exámen",media,(((media*100)-(ex1*40))/60));

        sc.close();
    }
}
