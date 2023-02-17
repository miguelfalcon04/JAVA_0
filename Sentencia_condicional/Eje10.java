package Sentencia_condicional;

/* Ejercicio 10
Escribe un programa que nos diga el horóscopo a partir del día y el mes de
nacimiento.

@author Miguel Falcón   
*/

import java.util.Scanner;
public class Eje10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Este programa te dice tu horoscopo");
        System.out.print("Dime el dia de tu nacimiento: ");
        int dia = sc.nextInt();
        System.out.print("Dime el número de mes de tu nacimiento: ");
        int mes = sc.nextInt();
        String horoscopo = "";
        switch (mes){
            case 1:
                if (dia<21){
                    horoscopo = "capricornio";
                }else{
                    horoscopo = "acuraio";
                }
            break;
            case 2:
                if (dia<20){
                    horoscopo = "acuario";
                }else{
                    horoscopo = "piscis";
                }
            break;
            case 3:
                if (dia<21){
                    horoscopo = "piscis";
                }else{
                    horoscopo = "aries";
                }
            break;
            case 4:
                if (dia<21){
                    horoscopo = "aries";
                }else{
                    horoscopo = "tauro";
                }
            break;
            case 5:
                if (dia<20){
                    horoscopo = "tauro";
                }else{
                    horoscopo = "geminis";
                }
            break;
            case 6:
                if (dia<22){
                    horoscopo = "geminis";
                }else{
                    horoscopo = "cancer";
                }
            break;
            case 7:
                if (dia<22){
                    horoscopo = "cancer";
                }else{
                    horoscopo = "leo";
                }
            break;
            case 8:
                if (dia<24){
                    horoscopo = "leo";
                }else{
                    horoscopo = "virgo";
                }
            break;
            case 9:
                if (dia<23){
                    horoscopo = "virgo";
                }else{
                    horoscopo = "libra";
                }
            break;
            case 10:
                if (dia<23){
                    horoscopo = "libra";
                }else{
                    horoscopo = "escorpio";
                }
            break;
            case 11:
                if (dia<23){
                    horoscopo = "escorpio";
                }else{
                    horoscopo = "sagitario";
                }
            break;
            case 12:
                if (dia<21){
                    horoscopo = "sagitario";
                }else{
                    horoscopo = "capricornio";
                }
            break;
        }
        System.out.println("Tu horoscopo es "+horoscopo);

        sc.close();        
    }
}
