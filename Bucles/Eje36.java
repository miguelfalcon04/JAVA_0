package Bucles;

/* Ejercicio 36
Escribe un programa que diga si un número introducido por teclado es o no
capicúa. Los números capicúa se leen igual hacia delante y hacia atrás. El
programa debe aceptar números de cualquier longitud siempre que lo permita
el tipo, en caso contrario el ejercicio no se dará por bueno. Se recomienda usar
long en lugar de int ya que el primero admite números más largos.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje36 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número: ");
        int n1 = sc.nextInt();
        int save=n1;
        int volt1=0;

        do{

            volt1=volt1*10+n1%10;
            n1/=10;

        }while(n1>0);

        if(save==volt1){
            System.out.print("El número es capicua");
        }else{
            System.out.print("El número no es capicua");
        }

        sc.close();
    }
}
