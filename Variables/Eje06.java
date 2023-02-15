package Variables;

/* Ejercicio 6
Escribe un programa que calcule el total de una factura a partir de la base
imponible (precio sin IVA). La base imponible estará almacenada en una
variable.

@author Miguel Falcón
*/


public class Eje06 {
    public static void main(String[] args) {

        double baseImponible = 10.50;
        System.out.printf("Base imponible %8.2f\n", baseImponible);
        System.out.printf("IVA            %8.2f\n", (baseImponible * 0.21));
        System.out.printf("Total          %8.2f\n", (baseImponible * 1.21));

    }
}
