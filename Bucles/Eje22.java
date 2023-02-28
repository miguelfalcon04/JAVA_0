package Bucles;

/* Ejercicio 22
Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.

@author Miguel Falcón
*/

public class Eje22 {
    public static void main(String[] args) {

        for(int i=2; i<=100;i++){
        boolean esprimo = false;
            for(int j=2; j<=(i-1);j++){
                if(i%j==0){
                    esprimo=true;
                }
            }
            if(esprimo==false){
                System.out.print(i+" ");
            }
        }

    }
}
