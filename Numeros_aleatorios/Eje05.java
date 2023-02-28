package Numeros_aleatorios;

/* Ejercicio 5
Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
separados por espacios. Muestra también el máximo, el mínimo y la media
de esos números.

@author Miguel Falcón
*/

public class Eje05 {
    public static void main(String[] args) {

        int max=0;
        int min=200;
        int media=0;

        for(int i=1; i<=50;i++){

            int alea = (int)((Math.random())+100); // Math.random() lanza valores de 0 hasta 0.9 periódico al sumarle 100, 
                                                       // lo trasladamos para que incie en 100 (0+100=100), por lo que ahora lanzaría 
                                                       // valores del 100 al 100.9 periódico. Al multiplicarlo x100 corremos la coma

            media+=alea;
            System.out.println(i+" "+alea);

            if(alea>max){
                max=alea;
            }else if(alea<min){
                min=alea;
            }

        }

        System.out.println("El mayor de los números es: "+max);
        System.out.println("El menos de los números es: "+min);
        System.out.println("La media es: "+(media/50));
    }
}
