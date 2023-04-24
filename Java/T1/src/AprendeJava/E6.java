/*
Escribe un programa que lea 15 números por teclado y que los almacene en un
array. Rota los elementos de ese array, es decir, el elemento de la posición 0
debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
del array.

 */
package AprendeJava;

import java.util.Scanner;

public class E6 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int[] lista = new int[15];

        for (int i = 0; i < lista.length; i++) {
            System.out.print("Dame un numero: ");
            lista[i] = teclado.nextInt();
        }

        int aux = lista[lista.length - 1];

        for (int i = lista.length - 1; i > 0; i--) {
            lista[i] = lista[i - 1];
        }
        lista[0] = aux;
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i]);
            if (i != lista.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

}
