package Numeros_aleatorios;

/* Ejercicio 15
Realiza un generador de melodía con las siguientes condiciones:
a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa, sol,
la y si.
b) Una melodía está formada por un número aleatorio de notas mayor o igual
a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12…).
c) Cada grupo de 4 notas será un compás y estará separado del siguiente
compás mediante la barra vertical “|” (Alt + 1). El final de la melodía se marca
con dos barras.
d) La última nota de la melodía debe coincidir con la primera.

@author Miguel Falcón
*/

public class Eje15 {
    public static void main(String[] args) {

        int longitud;

        do{
            longitud = (int)(Math.random()*29);
        }while(longitud%4!=0 || longitud==0);

        System.out.println(longitud);
        int nota;
        String melodia="";
        int cont=0;
        int primeranota=0;

        for(int i=0; i<=(longitud-1); i++){

            nota = (int)(Math.random()*7);
            if(cont==0){
                primeranota=nota;
            }
            cont++;

            if(i==(longitud-1)){
                nota=primeranota;
            }

            switch(nota){

                case 0:
                melodia="do";
                break;

                case 1:
                melodia="re";
                break;

                case 2:
                melodia="mi";
                break;

                case 3:
                melodia="fa";
                break;

                case 4:
                melodia="sol";
                break;

                case 5:
                melodia="la";
                break;

                case 6:
                melodia="si";
                break;

            }

            System.out.print(melodia+" ");

            if(cont%4==0){
                System.out.print("| ");
            }

        }

        System.out.print("|");

    }
}
