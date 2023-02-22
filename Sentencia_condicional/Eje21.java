package Sentencia_condicional;

/* Ejercicio 21
Calcula la nota de un trimestre de la asignatura Programación. El programa
pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
Si la media de los dos controles da un número mayor o igual a 5, el alumno
está aprobado y se mostrará la media. En caso de que la media sea un número
menor que 5, el alumno habrá tenido que hacer el examen de recuperación que
se califica como apto o no apto, por tanto se debe preguntar al usuario ¿Cuál
ha sido el resultado de la recuperación? (apto/no apto). Si el resultado
de la recuperación es apto, la nota será un 5; en caso contrario, se mantiene
la nota media anterior.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nota del primer control: ");
        float n1= sc.nextFloat();

        System.out.print("Nota del segundo control: ");
        float n2= sc.nextFloat();

        float media=((n1+n2)/2);

        if(media>=5){
            System.out.printf("Tu nota de Programación es %.2f",media);
        }else{
            System.out.print("¿Cuál ha sido el resultado de la recuperación (apto/ no apto): ");
            String resultado = sc.next();

            if(resultado.equalsIgnoreCase("apto")){
                System.out.print("Tu nota de Programción es de 5");
            }else{
                System.out.printf("Tu nota de programación es %.2f",media);
            }
        }

        sc.close();
    }
}
