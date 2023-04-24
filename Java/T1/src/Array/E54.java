/*
Haz un programa que dado un array valores que posea una serie de números pej
2,4,6,8,1,3,5,7, y un numero que se pida por teclado, indique si ese número está
en el array o no lo está.
 */

package Array;

import java.util.Scanner;

public class E54 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int[] valores = {2, 4, 6, 8, 1, 3, 5, 7};
        int num;
        boolean encontrado = false;
        System.out.print("Dame un número: ");
        num = teclado.nextInt();
        teclado.close();
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] == num) {
                encontrado = true;
            }
        }
        if (encontrado == true) {
            System.out.println("El numero esta en el array.");
        } else {
            System.out.println("No está en el array.");
        }
    }

}
