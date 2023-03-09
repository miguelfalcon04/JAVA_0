package Numeros_aleatorios;

/* Ejercicio 13
Escribe un programa que simule la tirada de dos dados. El programa deberá
continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
dados tengan el mismo valor.

@author Miguel Falcón
*/

public class Eje13 {
    public static void main(String[] args) {

        int d1, d2;

        do{

            d1 = (int) (Math.random()*7+1);
            System.out.println("Tirada d1: "+d1);

            d2 = (int) (Math.random()*7+1);
            System.out.println("Tirada d1: "+d2);

            System.out.println("-----------");

        }while(d1!=d2);
        
    }
}
