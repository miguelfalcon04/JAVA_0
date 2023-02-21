package Sentencia_condicional;

/* Ejercicio 20
Realiza un programa que diga si un número entero positivo introducido por
teclado es capicúa. Se permiten números de hasta 5 cifras.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número menor o igual de 5 cifras: ");
        int n = sc.nextInt();
        int save = n;

        int nvolteado=0;
        int cont=0;

        do{

            nvolteado=nvolteado*10+n%10;
            n=n/10;
            cont++;

        }while(n>0);

        if(cont<=5){
            if(nvolteado==save){
                System.out.printf("%d es un número capicúa",save);
            }else{
                System.out.printf("%d no es un número capicúa",save);
            }
        }else{
            System.out.print("El número debe ser menor de 5 cifras");
        }

        sc.close();
    }
}
