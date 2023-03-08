package Numeros_aleatorios;

/* Ejercicio 1
Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
también la suma total (los puntos que suman entre los tres dados).

@author Miguel Falcón
*/

public class Eje01 {
    public static void main(String[] args) {

        int suma=0;

        for(int i=1; i<=3; i++){
            int aleatorio = (int)((Math.random()*6)+1);
            suma+=aleatorio;
            System.out.printf("El dado %d resulta ser un: %d\n",i,aleatorio);
        }

        System.out.print("La suma total de los dados es: "+suma);
    }
}
