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

            int alea = (int)((Math.random()*100)+100); // Math.random() lanza valores de 0 hasta 0.9 periódico, al  
                                                       // multiplicarlo x100 corremos la coma dos lugares por lo que si obtenos    
                                                       // 0.99 sería 99 (tope del ejercico).
                                                       // Al sumarle 100 conseguimos que se mueva enntre el rango deseado.
                                                       // Si sale 0 Math.random() hará (0*100=0) + 100 = 100.
                                                       // Si sale 0.99 Math.random() hará (0.99*100=99) + 100 = 199.

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
