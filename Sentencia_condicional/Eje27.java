package Sentencia_condicional;

/* Ejercicio 27
Una pastelería nos ha pedido realizar un programa que haga presupuestos de
tartas. El programa preguntará primero de qué sabor quiere el usuario la tarta:
manzana, fresa o chocolate. La tarta de manzana vale 18 euros y la de fresa
16. En caso de seleccionar la tarta de chocolate, el programa debe preguntar
además si el chocolate es negro o blanco; la primera opción vale 14 euros y la
segunda 15. Por último se pregunta si se añade nata y si se personaliza con un
nombre; la nata suma 2.50 y la escritura del nombre 2.75.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double precio = 0;

        System.out.print("Elija un sabor (1.manzana, 2.fresa o 3.chocolate): ");
        int s = sc.nextInt();

        int nata =0;
        int nom = 0;

        if (s ==1 ){
            precio=precio+18;

            System.out.print("¿Quiere nata? (1.Si 2.No): ");
            nata = sc.nextInt();

            if (nata==1){
                precio=precio+2.50;
            }

            System.out.print("¿Quiere ponerle un nombre? (1.Si 2.No): ");
            nom = sc.nextInt();

            if (nom==1){
                precio=precio+2.75;
            }

            System.out.print("Total " + precio + " euros");
        }

        if (s ==2 ){
            precio=precio+16;

            System.out.print("¿Quiere nata? (1.Si 2.No): ");
            nata = sc.nextInt();

            if (nata==1){
                precio=precio+2.50;
            }

            System.out.print("¿Quiere ponerle un nombre? (1.Si 2.No): ");
            nom = sc.nextInt();

            if (nom==1){
                precio=precio+2.75;
            }
            System.out.print("Total " + precio + " euros");
        }

        if (s ==3 ){
            System.out.print("¿Qué tipo de chocolate quiere? (1. Blanco 2.Negro): ");
            int choco= sc.nextInt();

            if (choco==1){
                precio=precio+15;
            }

            if (choco==2){
                precio+=14;
            }

            System.out.print("¿Quiere nata? (1.Si 2.No): ");
            nata = sc.nextInt();

            if (nata==1){
                precio=precio+2.50;
            }

            System.out.print("¿Quiere ponerle un nombre? (1.Si 2.No): ");
            nom = sc.nextInt();

            if (nom==1){
                precio=precio+2.75;
            }

            System.out.print("Total " + precio + " euros");
        }

        sc.close();
    }
}
