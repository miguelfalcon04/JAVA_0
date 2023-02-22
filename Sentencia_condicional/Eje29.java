package Sentencia_condicional;

/* Ejercicio 29
Realiza un programa que calcule el precio de un desayuno. El programa
preguntará primero qué ha tomado el usuario de comer: palmera, donut o
pitufo. La palmera vale 1.40 € y el donut 1 €. En caso de tomar pitufo, el
programa debe preguntar además si era con aceite o con tortilla; el primero
vale 1’20 € y el segundo 1’60 €. Por último se pregunta por la bebida: zumo o
café a 1’50 y 1’20 respectivamente.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje29 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("¿Qué ha tomado de comer? (palmera, donut o pitufo): ");
        String comida = sc.nextLine();

        System.out.print("¿Qué ha tomado de beber? (zumo o café): ");
        String bebida = sc.nextLine();

        double total=0;

        switch(comida){

            case "palmera":
            System.out.println("Palmera: 1,40");
            total=total+1.40;
            break;

            case "donut":
            System.out.println("Donut: 1");
            total=total+1;
            break;

            case "pitufo":

            System.out.print("¿Con qué se ha tomado el pitufo? (aceite o tortilla): ");
            String pitufo = sc.nextLine();

            switch(pitufo){
                case "aceite":
                System.out.println("Pitufo con aceite: 1,20");
                total=total+1.20;
                break;

                case "tortilla":
                System.out.println("Pitufo con tortilla: 1,60");
                total=total+1.60;
                break;
            }
            break;
        }

        switch(bebida){

            case "zumo":
            System.out.println("Zumo: 1,50");
            total=total+1.50;
            break;

            case "cafe":
            System.out.println("Cafe: 1,20");
            total=total+1.20;
            break;

        }

        System.out.printf("Total desayuno: %.2f",total);

        sc.close();
    }
}
