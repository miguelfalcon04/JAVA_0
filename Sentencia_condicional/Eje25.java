package Sentencia_condicional;

/* Ejercicio 25
La tienda online BanderaDeEspaña.es vende banderas personalizadas de la
máxima calidad y nos ha pedido hacer un configurador que calcule el precio
según el alto y el ancho. El precio base de una bandera es de un céntimo de
euro el centímetro cuadrado. Si la queremos con un escudo bordado, el precio
se incrementa en 2.50 € independientemente del tamaño. Los gastos de envío
son 3.25 €. El IVA ya está incluido en todas las tarifas.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la altura de la bandera en cm: ");
        float alt = sc.nextFloat();

        System.out.print("Ahora introduzca la anchura: ");
        float anch = sc.nextFloat();

        System.out.print("¿Quiere escudo bordado? (si/no): ");
        String op = sc.next();
        double bordado=0;

        System.out.println("Gracias. Aquí tiene el desglose de su compra.");

        System.out.printf("Bandera de %.0f cm^2: %7.2f\n",(alt*anch),((alt*anch)/100));
        switch(op){
            case "no":
            System.out.printf("Sin escudo: %10.2f\n",bordado);
            break;

            case "si":
            bordado=2.50;
            System.out.printf("Con escudo: %10.2f\n",bordado);
            break;

        }
        double gasen= 3.25;
        System.out.printf("Gastos de envio: %10.2f\n",gasen);
        System.out.printf("Total: %13.2f",(float)(((alt*anch)/100)+bordado+gasen));

        sc.close();
    }
}
