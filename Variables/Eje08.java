package Variables;

/* Ejercicio 8
Escribe un programa que declare 5 variables de tipo char. A continuación, crea
otra variable como cadena de caracteres y asígnale como valor la concatenación de las anteriores 5 variables. Por último, muestra la cadena de caracteres
por pantalla ¿Qué problemas te encuentras? ¿cómo lo has solucionado?

@author Miguel Falcón
*/

public class Eje08 {
    public static void main(String[] args) {

        char a ='A';
        char b ='B';
        char c ='C';
        char d='D';
        char e='E';

        String cadena= ""+a+b+c+d+e;

        System.out.print(cadena);

    }
}
