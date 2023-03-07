package Numeros_aleatorios;

/* Ejercicio 6
Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe adivinarlo y tiene para ello 5 oportunidades. Después 
de cada intento fallido, el programa dirá cuántas oportunidades quedan y si el número introducido es
menor o mayor que el número secreto.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opor=5;
        int alea=(int)(Math.random()*101); // Al multiplicar por 101, en vez de que Math.random() genere números aleatroios
                                           // entre 0 y 1 (exclusivo de 1), es decir, 0 <= Math.random() < 1
                                           // da resultado a un número aleatorio entre 0 y 101 (exclusivo de 101);

        boolean gana=false;

        do{
            gana=false;

            System.out.print("Introduzca su número: ");
            int n = sc.nextInt();
            opor--;

            if(n==alea){
                gana=true;
            }
            if(n<alea){
                System.out.print("Introduzca un número más alto\n");
            }
            if(n>alea){
                System.out.print("Introduzca un número más bajo\n");
            }

        }while(opor>0 && gana==false);

        if(opor==0){
            System.out.print("Se ha quedado sin oportunidades lo siento, el número era "+alea);
        }else if(gana==true){
            System.out.print("Felicidades ha acertado el número en "+ (5-opor)+ " intentos");
        }

        sc.close();
    }
}
