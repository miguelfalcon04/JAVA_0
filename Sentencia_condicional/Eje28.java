package Sentencia_condicional;

/* Ejercicio 28
Implementa el juego piedra, papel y tijera. Primero, el usuario 1 introduce
su jugada y luego el usuario 2. Si alguno de los usuarios introduce una opción
incorrecta, el programa deberá mostrar un mensaje de error.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje28 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera):");
        String j1 = sc.nextLine();

        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijera):");
        String j2 = sc.nextLine();

        if (j1 == j2){
            System.out.print("Empate");
        }

        if (j1.equals("piedra") && j2.equals("papel")){
            System.out.print("Gana el jugador 2");
        }

        if (j2.equals("piedra") && j1.equals("papel")){
            System.out.print("Gana el jugador 1");
        }

        if (j1.equals("piedra") && j2.equals("tijera")){
            System.out.print("Gana el jugador 1");
        }

        if (j2.equals("piedra") && j1.equals("tijera")){
            System.out.print("Gana el jugador 2");
        }

        if (j1.equals("papel") && j2.equals("tijera")){
            System.out.print("Gana el jugador 2");
        }

        if (j2.equals("papel") && j1.equals("tijera")){
            System.out.print("Gana el jugador 1");
        }

        sc.close();
    }
}
