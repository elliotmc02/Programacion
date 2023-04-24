/*
Usando   arrays:   escribe   un   programa   que   pida   10   números   naturales   y   a
continuación, indique cuál es el valor máximo de esa sucesión de números, el número
de veces que aparece y sus respectivas posiciones. Ejemplo:
7 10 143 10 52 143 72 10 143 7
El valor máximo es el 143
Aparece 3 veces en las posiciones 2,5,8
*/

package Array;

import java.util.Scanner;

public class E55 {

    public static void main(String[] args) {
        
        int[] lista = new int[10];
        int max = 0, veces = 0;
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < lista.length; i++) {
            System.out.print("Dame un numero: ");
            lista[i] = teclado.nextInt();
            if (lista[i] > max) {
                max = lista[i];
            }
        }
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == max) {
                veces++;
            }
        }
        System.out.println("");
        System.out.print("Aparece " + veces + " veces en las posiciones ");
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == max) {
                if (i != lista.length-1) {
                    System.out.print(i + ", ");
                }
            }
        }
        teclado.close();
    }
}
