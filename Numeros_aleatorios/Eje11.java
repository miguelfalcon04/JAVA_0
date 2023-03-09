package Numeros_aleatorios;

/* Ejercicio 11
Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
final aparecerá el número de suspensos, el número de suficientes, el número
de bienes, etc.

@author Miguel Falcón
*/

public class Eje11 {
    public static void main(String[] args) {

        int suspenso=0; 
        int suficiente=0; 
        int bien=0; 
        int notable=0; 
        int sobresaliente=0;

        for(int i=1; i<=20;i++){

            int nota = (int)(Math.random()*11);

            System.out.print(nota+" ");
            switch(nota){

                case 0:
                case 1:
                case 2:
                System.out.println("suspenso");
                suspenso++;
                break;

                case 3:
                case 4:
                System.out.println("suficiente");
                suficiente++;
                break;

                case 5:
                case 6:
                System.out.println("bien");
                bien++;
                break;

                case 7:
                case 8:
                System.out.println("notable");
                notable++;
                break;

                case 9:
                case 10:
                System.out.println("sobresaliente");
                sobresaliente++;
                break;

            }

        }

        System.out.printf("Hay %d suspensos, %d suficientes, %d bien, %d notables y %d sobresalientes",suspenso,suficiente,bien,notable,sobresaliente);

    }
}
