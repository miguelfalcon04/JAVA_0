package Sentencia_condicional;

/* Ejercicio 12
Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
que se imparten en el curso. Cada pregunta acertada sumará un punto. El
programa mostrará al final la calificación obtenida. Pásale el minicuestionario a
tus compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos
en las diferentes asignaturas del curso.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = 0;
        System.out.println("Este programa realiza un mini cuestionario");
        System.out.println("Examen tipo test");
        System.out.println("1-Cual es un lenguaje de alto nivel: ");
        System.out.printf("%5s %5s %5s \n","a)Java","b)Compilador","c)Máquina");
        System.out.print("Respuesta: ");
        String r = sc.nextLine();
        if(r.equals("a")){
            System.out.println("Correcto");
            p++;
        }else{
            System.out.println("Incorrecto");
        }
        System.out.println("");
        System.out.println("2-Cual es un lenguaje de bajo nivel: ");
        System.out.printf("%5s %5s %5s \n","a)Java","b)Compilador","c)Python");
        System.out.print("Respuesta: ");
        r = sc.nextLine();
        if(r.equals("b")){
            System.out.println("Correcto");
            p++;
        }else{
            System.out.println("Incorrecto");
        }

        System.out.println("");
        System.out.println("3-Cual es un lenguaje de bajo nivel: ");
        System.out.printf("%5s %5s %5s \n","a)Java","b)Compilador","c)Python");
        System.out.print("Respuesta: ");
        r = sc.nextLine();
        if(r.equals("a")){
            System.out.println("Correcto");
            p++;
        }else{
            System.out.println("Incorrecto");
        }

        System.out.println("");
        System.out.println("4-Cual es un lenguaje de bajo nivel: ");
        System.out.printf("%5s %5s %5s \n","a)Java","b)Compilador","c)Python");
        System.out.print("Respuesta: ");
        r = sc.nextLine();
        if(r.equals("a")){
            System.out.println("Correcto");
            p++;
        }else{
            System.out.println("Incorrecto");
        }

        System.out.println("");
        System.out.println("5-Cual es un lenguaje de bajo nivel: ");
        System.out.printf("%5s %5s %5s \n","a)Java","b)Compilador","c)Python");
        System.out.print("Respuesta: ");
        r = sc.nextLine();
        if(r.equals("a")){
            System.out.println("Correcto");
            p++;
        }else{
            System.out.println("Incorrecto");
        }

        System.out.println("");
        System.out.println("6-Cual es un lenguaje de bajo nivel: ");
        System.out.printf("%5s %5s %5s \n","a)Java","b)Compilador","c)Python");
        System.out.print("Respuesta: ");
        r = sc.nextLine();
        if(r.equals("a")){
            System.out.println("Correcto");
            p++;
        }else{
            System.out.println("Incorrecto");
        }

        System.out.println("");
        System.out.println("7-Cual es un lenguaje de bajo nivel: ");
        System.out.printf("%5s %5s %5s \n","a)Java","b)Compilador","c)Python");
        System.out.print("Respuesta: ");
        r = sc.nextLine();
        if(r.equals("a")){
            System.out.println("Correcto");
            p++;
        }else{
            System.out.println("Incorrecto");
        }

        System.out.println("");
        System.out.println("8-Cual es un lenguaje de bajo nivel: ");
        System.out.printf("%5s %5s %5s \n","a)Java","b)Compilador","c)Python");
        System.out.print("Respuesta: ");
        r = sc.nextLine();
        if(r.equals("a")){
            System.out.println("Correcto");
            p++;
        }else{
            System.out.println("Incorrecto");
        }

        System.out.println("");
        System.out.println("9-Cual es un lenguaje de bajo nivel: ");
        System.out.printf("%5s %5s %5s \n","a)Java","b)Compilador","c)Python");
        System.out.print("Respuesta: ");
        r = sc.nextLine();
        if(r.equals("a")){
            System.out.println("Correcto");
            p++;
        }else{
            System.out.println("Incorrecto");
        }

        System.out.println("");
        System.out.println("10-Cual es un lenguaje de bajo nivel: ");
        System.out.printf("%5s %5s %5s \n","a)Java","b)Compilador","c)Python");
        System.out.print("Respuesta: ");
        r = sc.nextLine();
        if(r.equals("a")){
            System.out.println("Correcto");
            p++;
        }else{
            System.out.println("Incorrecto");
        }

        System.out.println("Has sacado "+p+" puntos");

        sc.close();
    }
}
