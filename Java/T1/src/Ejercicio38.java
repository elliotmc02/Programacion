/*
38. Queremos realizar un algoritmo que vaya pidiendo una sucesión de notas por
teclado hasta que se introduzca el valor -1. Tras eso se mostrará la media ponderada de
las notas introducidas.  Importante:  Hay que controlar que los valores de las notas
introducidas sea el correcto (entre 0 y 10)
b) Realiza una variante del ejercicio anterior donde el primer valor que se solicita indica
el número total de calificaciones que se deben introducir.
 */

import java.util.Scanner;

public class Ejercicio38 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n, aux, veces, i;
        aux = 0;
        i = 0;
        System.out.print("Introduzca el total de notas: ");
        veces = teclado.nextInt();
        do {
            System.out.print("Introduzca una nota: ");
            n = teclado.nextInt();
            i++;
            if (n >= 0 && n <= 10) {
                aux += n;
            } else {
                System.out.println("Número erróneo.");
            }
        } while (n >= 0 && i < veces);
        teclado.close();
        int res = aux / veces;
        System.out.println(res);
    }

}
