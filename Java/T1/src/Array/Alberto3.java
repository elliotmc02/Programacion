/*
- Crea array de 10 cajones con valores aleatorios
- Pide 2 numeros: min y max (numeros mayores a 2 y siendo max > min.
Si no, vuelvo a pedirlos)
- Crea un array y rellenalo con los valores entre min y max
EJ: min = 2
max = 8       [2, 3, 4, 5, 6, 7, 8]
- Muestralo por pantalla
 */
package Array;

import java.util.Scanner;

public class Alberto3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int lista[] = new int[10];
        int i, max, min;
        for (i = 0; i < lista.length; i++) {
            lista[i] = (int) ((Math.random() * (100)) + 1);
            System.out.print(lista[i] + " ");
        }
        System.out.println("");
        System.out.print("Dame un valor maximo (debe ser mayor que 2): ");
        max = teclado.nextInt();
        System.out.print("Dame un valor minimo (debe ser mayor que 2): ");
        min = teclado.nextInt();
        do {
            if ((max < 2) || (max <= min)) {
                System.out.print("Valor máximo debe ser mayor que 2 y mayor que el mínimo: ");
                max = teclado.nextInt();
            }
            if (min < 2) {
                System.out.print("Valor mínimo debe ser mayor que 2: ");
                min = teclado.nextInt();
            }
        } while ((max < 2) || (min < 2) || (max <= min));

        int lista2[] = new int[max - min + 1];
        int k = min;
        for (i = 0; i < lista2.length; i++) {
            lista2[i] = k;
            k++;
            if (i == lista2.length - 1) {
                System.out.println(lista2[i] + " ");
            } else {
                System.out.print(lista2[i] + ", ");
            }
        }
    }

}
