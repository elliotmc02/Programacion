/*
- Crea un array de 100 cajones con valores aleatorios
entre 1 y 100
- Pide un numero entero por teclado entre 1 y 100 (num)
- Crea otro array con los "num" ultimos valores del array original
- Muestralo por pantalla
 */
package Array;

import java.util.Scanner;

public class Alberto2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int lista[] = new int[100];
        int i, num;

        for (i = 0; i < lista.length; i++) {
            lista[i] = (int) ((Math.random() * (100)) + 1);
            //System.out.print(lista[i] + " ");
        }
        //System.out.println("");
        do {
            System.out.print("Dame un numero entre 1 y 100: ");
            num = teclado.nextInt();
        } while (num < 0 || num > 100);

        int ultLista[] = new int[num];
        int k = 0;
        for (i = lista.length - num; i < lista.length; i++) {

            ultLista[k] = lista[i];
            if (k == ultLista.length - 1) {
                System.out.println(ultLista[k] + " ");
            } else {
                System.out.print(ultLista[k] + ", ");
            }
            k++;

        }
    }
}
