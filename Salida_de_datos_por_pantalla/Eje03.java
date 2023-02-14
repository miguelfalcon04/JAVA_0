package Salida_de_datos_por_pantalla;

/* Ejercicio 3
Escribe un programa que muestre por pantalla 10 palabras en inglés junto a su
correspondiente traducción al castellano. Las palabras deben estar distribuidas
en dos columnas y alineadas a la izquierda.
Ejemplo:

@author Miguel Falcón
*/

public class Eje03 {
    public static void main(String[] args) {

        System.out.printf("%-10s %s\n", "computer", "ordenador");
        System.out.printf("%-10s %s\n", "student", "alumno");
        System.out.printf("%-10s %s\n", "penguin", "pingüino");
        System.out.printf("%-10s %s\n", "machine", "maquina");
        System.out.printf("%-10s %s\n", "nature", "naturaleza");
        System.out.printf("%-10s %s\n", "light", "luz");
        System.out.printf("%-10s %s\n", "green", "verde");
        System.out.printf("%-10s %s\n", "book", "libro");
        System.out.printf("%-10s %s\n", "pyramid", "pirámide");

    }
}
