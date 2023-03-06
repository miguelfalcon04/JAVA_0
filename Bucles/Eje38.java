package Bucles;

/* Ejercicio 38
Realiza un programa que pinte un reloj de arena relleno hecho de asteriscos. El
programa debe pedir la altura. Se debe comprobar que la altura sea un número
impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de error.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje38 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la altura del reloj de arena: ");
        int alt = sc.nextInt();

        if(alt>=3 && alt%2!=0){

            for(int i=; i<alt;i++){
            }

        }else{
            System.out.print("Introduzca bien los datos");
        }
        

        sc.close();
    }
}
