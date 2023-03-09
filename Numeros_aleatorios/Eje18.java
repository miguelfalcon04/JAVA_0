package Numeros_aleatorios;

/* Ejercicio 18
Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren
sustituir el color blanco por colores más alegres. Realiza un programa que
genere de forma aleatoria una secuencia de tres colores aleatorios (uno para
cada dormitorio) de tal forma que no se repita ninguno. Los colores entre los que
debe elegir el programa son los siguientes: rojo, azul, verde, amarillo, violeta y
naranja.

@author Miguel Falcón
*/
sd
public class Eje18 {
    public static void main(String[] args) {

        int n;
        String color="";
        boolean rojo=false;
        boolean azul=false;
        boolean verde=false;
        boolean amarillo=false;
        boolean violeta=false;
        boolean naranja=false;

        for(int i=1; i<=3; i++){

            do{

                n = (int)(Math.random()*6);

            }while(rojo==false || azul==false || verde==false || amarillo==false || violeta==false || naranja==false);

            switch(n){

                case 0:
                color="rojo";
                rojo=true;
                break;

                case 1:
                color="azul";
                azul=true;
                break;

                case 2:
                color="verde";
                verde=true;
                break;

                case 3:
                color="amarillo";
                amarillo=true;
                break;

                case 4:
                color="violeta";
                violeta=true;
                break;

                case 5:
                color="naranja";
                rojo=true;
                break;

            }

            System.out.println("Color para la habitaciín nº "+i+": "+color);

        }
        
    }
}
