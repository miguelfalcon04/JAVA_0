package Bucles;

/* Ejercicio 46
Realiza un programa que pinte por pantalla un rectángulo hueco hecho con
asteriscos. Se debe pedir al usuario la anchura y la altura. Hay que comprobar
que tanto la anchura como la altura sean mayores o iguales que 2, en caso
contrario se debe mostrar un mensaje de error.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje46 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Por fovar, introduzca la anchura del rectángulo (como mínimo 2): ");
        int anch = sc.nextInt();

        System.out.print("Ahora introduzca la altura (como mínimo 2): ");
        int alt = sc.nextInt();

        if(alt<2 || anch<2){
            System.out.print("Introduzca bien los datos");
        }else{

            for(int i = 1; i<=alt; i++){

                System.out.print("*");

                for(int j=1; j<=anch;j++){
                    if(i==1 || i==alt){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }

                System.out.println("*");

            }
        }

        sc.close();
    }
}
