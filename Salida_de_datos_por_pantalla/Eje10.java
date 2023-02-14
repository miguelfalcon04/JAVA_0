package Salida_de_datos_por_pantalla;

/* Ejercicio 10
Mejora el ejercicio anterior añadiéndole colores.

@author Miguel Falcón
*/

public class Eje10 {
    public static void main(String[] args) {

        String celeste = "\033[36m";
        String azul = "\033[34m";
        String rojo = "\033[31m";
        String morado = "\033[35m";

        System.out.println(rojo+"      BIENVENIDO");
        System.out.println(morado+"   A ESTE EJERCICIO\n");
        System.out.println(azul+"  Miguel Jeús Falcón");
        System.out.println(celeste+".............");
        System.out.println(".           .");
        System.out.println(". O      O  .");
        System.out.println(".           .");
        System.out.println(".   (---)   .");
        System.out.println(".............");
        
    }
}
