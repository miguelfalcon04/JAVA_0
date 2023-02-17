package Sentencia_condicional;

/* Ejercicio 2
Realiza un programa que pida una hora por teclado y que muestre luego buenos
días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de
6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las
horas, los minutos no se deben introducir por teclado.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la hora: ");
        int h = sc.nextInt();

        if(h>=6 && h<=12){
            System.out.print("Buenos dias");
        }

        if(h>=13 && h<=20){
            System.out.print("Buenas tardes");
        }

        if(h>=21 || h<=5){
            System.out.print("Buenas noches");
        }

        sc.close();
    }
}
