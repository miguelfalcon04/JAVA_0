package Sentencia_condicional;

/* Ejercicio 8
Amplía el programa anterior para que diga la nota del boletín (insuficiente,
suficiente, bien, notable o sobresaliente).

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double nota;
        double media=0;

        for (int i = 1; i<=3; i++){
            System.out.printf("Introduzca la nota %d: ",i);
            nota = sc.nextInt(); 

            media= media+nota;
        }

        System.out.printf("La media de sus notas es de %.2f\n",(media/3));

        if(media/3<=2){
            System.out.print("Insuficiente");
        }

        if(media/3>2 && media/3<=4){
            System.out.print("Suficiente");
        }

        if(media/3>4 && media/3<=6){
            System.out.print("Bien");
        }

        if(media/3>6 && media/3<=8){
            System.out.print("Notable");
        }

        if(media/3>8 && media/3<=10){
            System.out.print("Sobresaliente");
        }
        sc.close();
    }
}
