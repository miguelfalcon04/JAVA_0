package Sentencia_condicional;

/* Ejercicio 9
Realiza un programa que resuelva una ecuación de segundo grado (del tipo
ax2 + bx + c = 0).

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el valor de a: ");
        double a = sc.nextDouble();

        System.out.print("Introduzca el valor de b: ");
        double b = sc.nextDouble();

        System.out.print("Introduzca el valor de c: ");
        double c = sc.nextDouble();

        double ope1 = ((-b+Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a));
        double ope2 = ((-b-Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a));

        if(a!=0){
            System.out.printf("Ambas soluciones son %.2f y %.2f",ope1, ope2);
        }else{
            System.out.print("Introduzca valores válidos");
        }

        sc.close();
    }
}
