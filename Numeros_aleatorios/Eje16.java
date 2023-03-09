package Numeros_aleatorios;

/* Ejercicio 16
Realiza un simulador de máquina tragaperras simplificada que cumpla los
siguientes requisitos:
a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
figuras posibles: corazón, diamante, herradura, campana y limón.
b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento, ha
perdido”.
c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien,
ha recuperado su moneda”.
d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado
10 monedas”.

@author Miguel Falcón
*/

public class Eje16 {
    public static void main(String[] args) {

        int tirada;
        String figura="";
        int cora=0;
        int diamante=0;
        int herradura=0;
        int campana=0;
        int limon=0;

        for (int i=0; i<3;i++){

            tirada=(int)(Math.random()*5);

            switch(tirada){

                case 0:
                figura="corazón";
                cora++;
                break;

                case 1:
                figura="diamante";
                diamante++;
                break;

                case 2:
                figura="herradura";
                herradura++;
                break;

                case 3:
                figura="campana";
                campana++;
                break;

                case 4:
                figura="limón";
                limon++;
                break;

            }

            System.out.print(figura+" ");

        }

        System.out.println("");

        if(cora==3 || diamante==3 || herradura==3 || campana==3 || limon==3 ){
            System.out.print("Enhorabuena, ha ganado 10 monedas");
        }
        else if(cora==2 || diamante==2 || herradura==2 || campana==2 || limon==2){
            System.out.print("Bien, ha recuperado su moneda");
        }else{
            System.out.print("Lo siento, ha perdido");
        }

    }
}
