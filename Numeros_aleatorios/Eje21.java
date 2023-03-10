package Numeros_aleatorios;

/* Ejercicio 21
Realiza un programa que genere una secuencia de cinco monedas de curso
legal lanzadas al aire. Las monedas disponibles son de 1 céntimo, 2 céntimos,
5 céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro y 2 euros. Las dos
posiciones posibles son cara y cruz.

@author Miguel Falcón
*/

public class Eje21 {
    public static void main(String[] args) {

        int ncr;
        String cr="";
        int nmon;
        String moneda="";

        for(int i=1; i<=5;i++){

            nmon=(int)(Math.random()*8);

            switch(nmon){

                case 0:
                moneda="1 céntimo - ";
                break;

                case 1:
                moneda="2 céntimos - ";
                break;

                case 2:
                moneda="5 céntimos - ";
                break;

                case 3:
                moneda="10 céntimos - ";
                break;

                case 4:
                moneda="20 céntimos - ";
                break;

                case 5:
                moneda="50 céntimos - ";
                break;

                case 6:
                moneda="1 euro - ";
                break;

                case 7:
                moneda="2 euros - ";
                break;

            }

            ncr = (int)(Math.random()*2);

            switch(ncr){

                case 0:
                cr = "cara";
                break;

                case 1:
                cr = "cruz";
                break;

            }

            System.out.println(moneda +cr);

        }
    }
}
