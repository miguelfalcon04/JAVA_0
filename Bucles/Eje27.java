package Bucles;

/* Ejercicio 27
Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
entre 1 y un número leído por teclado.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el número tope: ");
        int n = sc.nextInt();

        int cont=0;
        int suma=0;

        for(int i=0; i<=n; i+=3){

            if(i!=0){
                System.out.print(i+" ");
                cont++;
            }
            suma+=i;

        }

        System.out.printf("\nHay %d múltiplos de 3 entre 1 y %d\n",cont,n);
        System.out.printf("Todos los múltiplos suman %d\n",suma);

        sc.close();
    }
}
