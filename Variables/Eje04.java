package Variables;

/* Ejercicio 4
Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
convertir deberá estar almacenada en una variable.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el numero de euros a convertir: ");
        int euros = sc.nextInt();

        System.out.print(euros+" euros son "+(euros*166.3860)+ " pesetas");

        sc.close();
    }
}
