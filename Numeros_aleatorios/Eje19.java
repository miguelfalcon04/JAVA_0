package Numeros_aleatorios;

/* Ejercicio 19
Escribe un programa que muestre 50 números enteros aleatorios comprendidos
entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra luego
el máximo de los pares el mínimo de los impares y la media de todos los
números generados. 

@author Miguel Falcón
*/

public class Eje19 {
    public static void main(String[] args) {

        int n;
        int par=-100; 
        int imp=200;
        int suma=0;

        for(int i=1; i<=50; i++){

            n= (int)((Math.random()*301)-100);
            suma+=n;

            System.out.println(i+": "+n);

            if(n%2==0 && n>par){
                par=n;
            }else if(n%2!=0 && n<imp ){
                imp=n;
            }

        }

        System.out.println("El mayor de los pares es: "+par);
        System.out.println("El menos de los impares es: "+imp);
        System.out.println("La media de todos los números es: "+(suma/50));

    }
}
