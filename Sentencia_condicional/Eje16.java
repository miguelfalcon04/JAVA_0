package Sentencia_condicional;

/* Ejercicio 16
Realiza un programa que nos diga si hay probabilidad de que nuestra pareja nos
está siendo infiel. El programa irá haciendo preguntas que el usuario contestará
con verdadero o falso. Cada pregunta contestada como verdadero sumará 3
puntos. Las preguntas contestadas con falso no suman puntos. A continuación
se listan las preguntas del test.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int puntos = 0;
        System.out.println("¿Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente?");
        System.out.println("(1)Si , (2)No");
        int v =sc.nextInt();
        if (v==1){
            puntos=puntos+3;
        }
        v=0;
        System.out.println("¿Ha aumentado sus gastos de vestuario?");
        System.out.println("(1)Si , (2)No");
        v =sc.nextInt();
        if (v==1){
            puntos=puntos+3;
        }
        v=0;
        System.out.println("¿Ha perdido el interés que mostraba anteriormente por ti?");
        System.out.println("(1)Si , (2)No");
        v =sc.nextInt();
        if (v==1){
            puntos=puntos+3;
        }
        v=0;
        System.out.println("¿Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)?");
        System.out.println("(1)Si , (2)No");
        v =sc.nextInt();
        if (v==1){
            puntos=puntos+3;
        }
        v=0;
        System.out.println("¿No te deja que mires la agenda de su teléfono móvil?");
        System.out.println("(1)Si , (2)No");
        v =sc.nextInt();
        if (v==1){
            puntos=puntos+3;
        }
        v=0;
        System.out.println("¿A veces tiene llamadas que dice no querer contestar cuando estás tú delante?");
        System.out.println("(1)Si , (2)No");
        v =sc.nextInt();
        if (v==1){
            puntos=puntos+3;
        }
        v=0;
        System.out.println("¿Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a?");
        System.out.println("(1)Si , (2)No");
        v =sc.nextInt();
        if (v==1){
            puntos=puntos+3;
        }
        v=0;
        System.out.println("¿Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo?");
        System.out.println("(1)Si , (2)No");
        v =sc.nextInt();
        if (v==1){
            puntos=puntos+3;
        }
        v=0;
        System.out.println("¿Has notado que últimamente se perfuma más?");
        System.out.println("(1)Si , (2)No");
        v =sc.nextInt();
        if (v==1){
            puntos=puntos+3;
        }
        v=0;
        System.out.println("¿Se confunde y te dice que ha estado en sitios donde no ha ido contigo?");
        System.out.println("(1)Si , (2)No");
        v =sc.nextInt();
        if (v==1){
            puntos=puntos+3;
        }
        v=0;
        System.out.println("Su puntuación es de: " + puntos);
        if (puntos<=10){
            System.out.println( "¡Enhorabuena! tu pareja parece ser totalmentefiel.");
        }
        if (puntos>=11 && puntos<=22){
            System.out.println( "Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
        }
        if (puntos>=23){
            System.out.println( "Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
        }

        sc.close();        
    }
}
