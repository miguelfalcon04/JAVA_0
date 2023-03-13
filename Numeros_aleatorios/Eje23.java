package Numeros_aleatorios;

/* Ejercicio 23
Las caras de un dado de poker tienen las siguientes figuras: As, K, Q, J, 7 y 8.
Escribe un programa que genere de forma aleatoria la tirada de cinco dados.

@author Miguel Falcón
*/

public class Eje23 {
    public static void main(String[] args) {

        for (int i=1; i<=5; i++){

            switch((int)(Math.random()*6)){

                case 0:
                System.out.printf("Tirada %d: AS\n",i);
                break;

                case 1:
                System.out.printf("Tirada %d: K\n",i);
                break;

                case 2:
                System.out.printf("Tirada %d: Q\n",i);
                break;

                case 3:
                System.out.printf("Tirada %d: J\n",i);
                break;

                case 4:
                System.out.printf("Tirada %d: 7\n",i);
                break;

                case 5:
                System.out.printf("Tirada %d: 8\n",i);
                break;

            }

        }
    }
}
