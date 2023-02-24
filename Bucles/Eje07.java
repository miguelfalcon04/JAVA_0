package Bucles;

/* Ejercicio 7
Realiza el control de acceso a una caja fuerte. La combinación será un
número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
Tendremos cuatro oportunidades para abrir la caja fuerte.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean combinacion = false;
        int oportunidades = 4;

        do{

            System.out.print("Introduzca la contraseña: ");
            int cnta = sc.nextInt();

            if(cnta==1234){
                combinacion=true;
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
            }else{
                System.out.println("Lo siento, esa no es la combinación");
                oportunidades--;
            }

        }while(oportunidades>0 && combinacion!=true);

        sc.close();
    }
}
