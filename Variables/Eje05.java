package Variables;

/* Ejercicio 5
Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
convertir deberá estar almacenada en una variable.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el numero de pesetas a convertir: ");
        int pesetas = sc.nextInt();

        System.out.print(pesetas+" pesetas son "+((float)pesetas/166.3860)+ " euros");

        sc.close();
    }
}
