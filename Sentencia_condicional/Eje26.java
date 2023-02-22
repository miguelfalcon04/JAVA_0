package Sentencia_condicional;

/* Ejercicio 26
Realiza un programa que calcule el precio de unas entradas de cine en función
del número de personas y del día de la semana. El precio base de una entrada
son 8 euros. El miércoles (día del espectador), el precio base es de 5 euros. Los
jueves son el día de la pareja, por lo que la entrada para dos cuesta 11 euros.
Con la tarjeta CineCampa se obtiene un 10% de descuento. Si un jueves, un
grupo de 6 personas compran entradas, el precio total sería de 33 euros ya
que son 3 parejas; pero si es un grupo de 7, pagarán 3 entradas de pareja más
1 individual que son 41 euros (33 + 8).

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Venta de entradas CineCampa");

        System.out.print("Número de entradas: ");
        double n = sc.nextDouble();

        System.out.print("Día de la semana: ");
        int d = sc.nextInt();

        double precio=0;

        switch(d){

            case 3:
            precio=precio+5*n;
            break;

            case 4:
            if(n%2==0){
                precio=precio+11*(n/2);
            }else{
                precio=precio+11*(n/2)+8;
            }
            break;

            default:
            precio=precio+8*n;
        }

        System.out.print("¿Tiene tarjeta CineCampa?: (s/n): ");
        String tarjeta = sc.next();

        System.out.println("Aqui tiene sus entradas. Gracias por su compra.");

        switch(d){
            case 4:
            System.out.printf("Entradas de parejas %4.0f\n",(n/2));
            System.out.println("Precio por entrada de pareja 11.00");
            break;

            default:
            System.out.printf("Entradas individuales %10.2f\n",n);
            System.out.println("Precio por entrada individual 8.00");
        }

        System.out.printf("Total %.2f\n",(float)precio);

        double descuento=0;

        if(tarjeta.equals("s")){
            descuento=(precio*10)/100;
            System.out.printf("Descuento %.2f\n",descuento);
        }else{
            System.out.printf("Descuento %.2f\n",descuento);
        }

        System.out.printf("A pagar %.2f\n",(precio-descuento));

        sc.close();
    }
}
