package Numeros_aleatorios;

/* Ejercicio 17
Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo
serán de 4 unidades. No hay que comprobar que los datos se introducen
correctamente; podemos suponer que el usuario los introduce bien. Dentro de
la pecera hay que colocar de forma aleatoria un pececito, que puede estar
situado en cualquiera de las posiciones que quedan en el hueco que forma el
rectángulo.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
        int alt = sc.nextInt();

        System.out.print("Ahora introduzca la anchura (como mínimo 4): ");
        int anch = sc.nextInt();

        for(int i=1; i<=alt;i++){

            for(int j=i; j<anch; j++){

                if(j==1 || j==alt){
                    System.out.print("* ");
                }

            }

            System.out.println("");
        }
        
    }
}
