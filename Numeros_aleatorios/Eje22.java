package Numeros_aleatorios;

/* Ejercicio 22
Realiza un programa que pinte por pantalla una serpiente con un “serpenteo”
aleatorio. La cabeza se representará con el carácter @ y se debe colocar
exactamente en la posición 13 (con 12 espacios delante). A partir de ahí,
el cuerpo irá serpenteando de la siguiente manera: se generará de forma
aleatoria un valor entre tres posibles que hará que el siguiente carácter se
coloque una posición a la izquierda del anterior, alineado con el anterior o una
posición a la derecha del anterior. La longitud de la serpiente se pedirá por
teclado y se supone que el usuario introducirá un dato correcto.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Por favot, introduzca la longitud de la serpiente: ");
        int longitud = sc.nextInt();

        String cabeza="@";
        System.out.printf("%13s\n",cabeza);

        int pos;
        String cuerpo="*";

        int x=13;
        for(int i=0; i<(longitud-1);i++){

            pos = (int)(Math.random()*3);

            switch(pos){

                case 0:
                for(int j=1; j<(x-1); j++){
                    System.out.print(" ");
                }
                x-=1;
                System.out.println(cuerpo);
                break;

                case 1:
                for(int j=1; j<(x); j++){
                    System.out.print(" ");
                }
                System.out.println(cuerpo);
                break;

                case 2:
                for(int j=1; j<(x+1); j++){
                    System.out.print(" ");
                }
                x+=1;
                System.out.println(cuerpo);
                break;

            }


        }





        sc.close();
    }
}
