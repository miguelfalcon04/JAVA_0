package Bucles;

/* Ejercicio 34
Escribe un programa que pida dos números por teclado y que luego mezcle en
dos números diferentes los dígitos pares y los impares. Se van comprobando los
dígitos de la siguiente manera: primer dígito del primer número, primer dígito
del segundo número, segundo dígito del primer número, segundo dígito del
segundo número, tercer dígito del primer número… Para facilitar el ejercicio,
podemos suponer que el usuario introducirá dos números de la misma longitud
y que siempre habrá al menos un dígito par y uno impar. Usa long en lugar de
int donde sea necesario para admitir números largos.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje34 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número: ");
        int n1 = sc.nextInt();
        int volt1=0;
        int rect1=0;

        System.out.print("Introduzca otro número: ");
        int n2 = sc.nextInt();
        int volt2=0;
        int rect2=0;

        do{

            volt1=volt1*10+n1%10;
            n1/=10;

            volt2=volt2*10+n2%10;
            n2/=10;

        }while(n1>0 || n2>0);

        int par=0;
        int imp=0;

        do{

            rect1=rect1*10+volt1%10;
            rect2=rect2*10+volt2%10;

            if((volt1%10)%2==0){
                par=par*10+(volt1%10);
            }else{
                imp=imp*10+(volt1%10);
            }

            if((volt2%10)%2==0){
                par=par*10+(volt2%10);
            }else{
                imp=imp*10+(volt2%10);
            }

            volt1/=10;
            volt2/=10;

        }while(volt1>0 || volt2>0);

        System.out.printf("El número formado por los dígitos pares es %d",par);
        System.out.printf("\nEl número formado por los dígitos impares es %d",imp);

        sc.close();
    }
}
