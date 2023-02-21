package Sentencia_condicional;

/* Ejercicio 19
Realiza un programa que nos diga cuántos dígitos tiene un número entero que
puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número de no más de 5 cifras: ");
        int n = sc.nextInt();

        if(n>=-99999 && n<=99999){

        if(n<=9 && n>=-9){
            System.out.print("Tiene 1 cifra");
        }

        if(n<=-10 && n>=-99 || n>=10 && n<=99){
            System.out.print("Tiene 2 cifras");
        }

        if(n<=-100 && n>=-999 || n>=100 && n<=999){
            System.out.print("Tiene 3 cifras");
        }

        if(n<=-1000 && n>=-9999 ||n>=1000 && n<=9999){
            System.out.print("Tiene 4 cifras");
        }

        if(n<=-10000 || n>=10000){
            System.out.print("Tiene 5 cifras");
        }
    }else{
        System.out.print("El número debe ser menos de 5 cifras");
    }

        sc.close();
    }
}
