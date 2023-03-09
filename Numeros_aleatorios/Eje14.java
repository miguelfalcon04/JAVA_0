package Numeros_aleatorios;

/* Ejercicio 14
Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El
programa intentará adivinar el número que estás pensando - un número entre 0
y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el programa
debe preguntar si el número que estás pensando es mayor o menor que el que
te acaba de decir.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int opor=5;
        boolean acierta=false;
        int rango =101;
        int salto=0;

        do{

            acierta=false;

            int alea = (int)(Math.random()*rango+salto);
            System.out.println("Piensas en el "+alea);

                System.out.print("Si / No : ");
                String sn = sc.next().toLowerCase();
                opor--;
                
                if(sn.equals("si")){
                    acierta=true;
            }else{

                System.out.print("Es más bajo o más alto? ");
                String ba = sc.next().toLowerCase();

                if(ba.equals("bajo")){
                    rango=alea;
                }else{
                    rango=101;
                    rango-=alea;
                    salto=alea;
                }
            }

        }while( opor>0 && acierta==false );

        if(acierta==true){
            System.out.printf("La máquina ha acertado en %d intentos\n",(5-opor));
        }else{
            System.out.print("Se ha quedado sin intentos");
        }

        sc.close();
    }
}
