/*
42. Escribe un algoritmo que lea por teclado un número N entero positivo y dibuje un
cuadrado de asteriscos de lado N. Pej: Si el número es 4, se obtiene:
* * * *
* * * *
* * * *
* * * *
 */

import java.util.Scanner;

public class Ejercicio42 {

    public static void main(String[] args) {

        int n, i, j;
        Scanner teclado = new Scanner(System.in);
        System.out.print("dame un numero: ");
        n = teclado.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
