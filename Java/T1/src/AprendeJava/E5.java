/*
Escribe un programa que pida 10 números por teclado y que luego muestre los
números introducidos junto con las palabras “máximo” y “mínimo” al lado del
máximo y del mínimo respectivamente.
 */
package AprendeJava;

import java.util.Scanner;

public class E5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int[] lista = new int[10];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        
        for (int i = 0; i < lista.length; i++) {
            
            System.out.print("Dame un número: ");
            lista[i] = teclado.nextInt();

            if (lista[i] > max) {
                max = lista[i];
            }

            if (lista[i] < min) {
                min = lista[i];
            }
        }
        System.out.println();
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i]);
            if (lista[i] == max) {
                System.out.print(" máximo");
            }
            
            if (lista[i] == min) {
                System.out.print(" mínimo");
            }
            System.out.println();
        }
    }

}
