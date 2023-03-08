package Numeros_aleatorios;

/* Ejercicio 10
Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
El carácter con el que se pinta cada línea se elige de forma aleatoria entre uno
de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud aleatoria
entre 1 y 40 caracteres.

@author Miguel Falcón
*/

public class Eje10 {
    public static void main(String[] args) {

        char caracter=' ';

        for(int i=1; i<=10; i++){

        int select= (int) (Math.random()*6);

            switch(select){
                case 0: 
                caracter='*';
                break;
    
                case 1:
                caracter='-';
                break;
    
                case 2:
                caracter='=';
                break;
    
                case 3:
                caracter='.';
                break;
    
                case 4:
                caracter='|';
                break;
    
                case 5:
                caracter='@';
                break;
    
            }

            int longitud = (int) ((Math.random()*40)+1);

            for(int j=0; j<longitud; j++){
                System.out.print(caracter);
            }

            System.out.println("");

        }
        
    }
}
