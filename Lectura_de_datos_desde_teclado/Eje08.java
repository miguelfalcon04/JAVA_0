package Lectura_de_datos_desde_teclado;

/* Ejercicio 8
Escribe un programa que calcule el salario semanal de un empleado en base a
las horas trabajadas, a razón de 12 euros la hora.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántas horas has trabajado esta semana?: ");
        int hs = sc.nextInt();

        System.out.printf("Tu salario semanal es de %d euros",(hs*12));

        sc.close();
    }
}
