package Sentencia_condicional;

/* Ejercicio 24
Escribe un programa que genere la nómina (bien desglosada) de un empleado
según las siguientes condiciones:
• Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe
de proyecto), los días que ha estado de viaje visitando clientes durante el
mes y su estado civil (1 - Soltero, 2 - Casado).
• El sueldo base según el cargo es de 950, 1200 y 1600 euros según
si se trata de un prog. junior, un prog. senior o un jefe de proyecto
respectivamente.
• Por cada día de viaje visitando clientes se pagan 30 euros extra en
concepto de dietas. Al sueldo neto hay que restarle el IRPF, que será de
un 25% en caso de estar soltero y un 20% en caso de estar casado.

@author Miguel Falcón
*/

import java.util.Scanner;
public class Eje24 {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        System.out.print("1 - Programador junior\n");
        System.out.print("2 - Porg. senior\n");
        System.out.print("3 - Jefe de proyecto\n");

        System.out.print("Introduzca el cargo del empleado (1 - 3): ");
        int cargo = sc.nextInt();

        float sueldo=0;

        switch(cargo){

            case 1:
            sueldo=950;
            break;

            case 2:
            sueldo=1200;
            break;

            case 3:
            sueldo=1600;
            break;

        }

        System.out.print("¿Cuántos días ha estado de viaje visitando clientes?: ");
        int d = sc.nextInt();

        System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
        int estciv = sc.nextInt();

        int irpf=0;
        switch(estciv){

            case 1:
            irpf=25;
            break;

            case 2:
            irpf=20;
            break;

        }

        System.out.println("--------------------------------");
        System.out.printf("| Sueldo base       %10.2f |\n",sueldo);
        System.out.printf("| Dietas (%d viajes)     %2.2f |\n",d,(float)(d*30));   
        System.out.println("|------------------------------|");
        System.out.printf("| Sueldo bruto      %10.2f |\n",(sueldo+(d*30)));
        System.out.printf("| Retención IRPF(%d%%)   %2.2f |\n",irpf,(((sueldo+(d*30))*irpf)/100));
        System.out.println("|------------------------------|");
        System.out.printf("| Sueldo neto       %10.2f |\n",((sueldo+(d*30))-(((sueldo+(d*30))*irpf)/100)));
        System.out.println("--------------------------------");

        sc.close();
    }
}
