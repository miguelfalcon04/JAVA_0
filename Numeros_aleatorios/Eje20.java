package Numeros_aleatorios;

/* Ejercicio 20
Realiza un programa que pinte por pantalla una cuba con cierta cantidad de
agua. La capacidad será indicada por el usuario. La cuba se llenará con una
cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que
pueda admitir. El ancho de la cuba no varía.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, indique la capacidad de la cuba en litros: ");
        int capacidad = sc.nextInt();

        int litros = (int)(Math.random()*(capacidad+1));

        for(int i=capacidad; i>0; i--){
            System.out.print("*");

            if(i==litros || i<litros){
                System.out.print("====");
            }else{
                System.out.print("    ");
            }

            System.out.println("*");

        }

        System.out.println("******");

        System.out.printf("La cuba tiene una capacida de %d litros y contiene %d litros de agua",capacidad,litros);

        sc.close();
    }
}
