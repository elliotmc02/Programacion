package T1P1;

/*Escribe un programa que calcule el salario semanal de un trabajador teniendo en
cuenta que las horas ordinarias (las 40 primeras horas de trabajo) se pagan a 12 eu-
ros la hora. A partir de la hora 41, se pagan a 16 euros la hora.

Introduzca el número de horas trabajadas durante la semana: 36
El sueldo semanales de: 432 euros
Introduzca el número de horas trabajadas durante la semana: 40
El sueldo semanales de: 480 euros
Introduzca el número de horas trabajadas durante la semana: 55
El sueldo semanales de: 720 euros

 */
import java.util.Scanner;

public class T1P1E3 {

    public static void main(String[] args) {
        int horas;
        int paga = 12;
        int pagaextra = 16;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca el número de horas trabajadas: ");
        horas = teclado.nextInt();
        teclado.close();

        int horasextras = horas - 40;
        if (horas <= 40) {
            System.out.println("El sueldo semanal es de: " + (paga * horas) + " euros");
        } else {
            System.out.println("El sueldo semanal es de: " + ((paga * 40) + (horasextras * pagaextra)) + " euros");
        }

    }

}

// Errores

/*
EJERCICIO 3

- paga y pagaextra deberían ser constantes (final)
*/