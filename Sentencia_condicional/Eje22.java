package Sentencia_condicional;

/* Ejercicio 22
Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
por hecho que el usuario introducirá un día y hora correctos, anterior al viernes
a las 15:00h.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca en que día de la semana se encuentra: ");
        String dia = sc.nextLine();

        System.out.print("Introduzca la hora que es: ");
        int h = sc.nextInt();

        System.out.print("Introduzca los minutos que son: ");
        int min = sc.nextInt();

        int minutos;
        switch (dia){

            case "lunes":

            minutos= 1440*4+900-h*60-min;
            System.out.printf("Quedan %d minutos ",minutos);

            break;

            case "martes":

            minutos= 1440*3+900-h*60-min;
            System.out.printf("Quedan %d minutos ",minutos);

            break;

            case "miercoles":

            minutos= 1440*2+900-h*60-min;
            System.out.printf("Quedan %d minutos ",minutos);

            break;

            case "jueves":

            minutos= 1440+900-h*60-min;
            System.out.printf("Quedan %d minutos ",minutos);

            break;

            case "viernes":

            minutos= 900-h*60-min;
            System.out.printf("Quedan %d minutos ",minutos);

            break;

        }
        

        sc.close();
    }
}
