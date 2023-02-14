package Salida_de_datos_por_pantalla;

/* Ejercicio 5
Modifica el programa anterior añadiendo colores. Puedes mostrar cada asignatura de un color diferente.

@author Miguel Falcón
*/

public class Eje05 {
    public static void main(String[] args) {

        String celeste = "\033[36m";
        String verde = "\033[32m";
        String azul = "\033[34m";
        String rojo = "\033[31m";
        String morado = "\033[35m";
        String naranja = "\033[33m";
        String blanco = "\033[37m";   
        System.out.println(rojo+"\n Lunes\tMartes\tMiérc.\tJueves.\tViernes");
        System.out.println(verde+" ======\t=======\t======\t=======\t=======");
        System.out.println(naranja+" PROG"+verde+"\tSIN\t"+celeste+"ED\t"+naranja+"PROG \t"+azul+"FOL");
        System.out.println(naranja+" PROG"+verde+"\tSIN\t"+celeste+"ED\t"+naranja+"PROG\t"+azul+"FOL");
        System.out.println(morado+" LM"+verde+"\tSIN\t"+naranja+"PROG\t"+morado+"LM\t"+azul+"FOL");
        System.out.println(morado+" LM"+verde+"\tSIN\t"+naranja+"PROG\t"+morado+"LM\t"+verde+"SIN");
        System.out.println(blanco+" BD"+naranja+"\tPROG\t"+celeste+"ED\t"+blanco+"BDATO\t"+verde+"SIN");
        System.out.println(blanco+" BD"+celeste+"\tED\tED\t"+blanco+"BDATO\t"+verde+"SIN");

    }
}
