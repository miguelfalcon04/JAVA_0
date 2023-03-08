package Numeros_aleatorios;

/* Ejercicio 9
Realiza un programa que vaya generando números aleatorios pares entre 0
y 100 y que no termine de generar números hasta que no saque el 24. El
programa deberá decir al final cuántos números se han generado.

@author Miguel Falcón   
*/

public class Eje09 {
    public static void main(String[] args) {

        int alea;
        int cont=0;

        do{

            alea=(int)(Math.random()*101);

            if(alea%2==0){
                System.out.print(alea+" ");
                cont++;
            }

        }while(alea!=24);

        System.out.print("\nSe han generado "+cont+" números hasta encontrar el 24");
        
    }
}
