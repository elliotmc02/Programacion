/*
Crea un programa que encuentre el elemento de mayor valor de una matriz y...
a)... muestre la posición de su primera aparición.
b)... muestre una lista con las posiciones de todas sus apariciones.
*/

package Array;

import java.util.Scanner;

public class E62 {

    public static void main(String[] args) {

        int matriz[][] = {{8,8,5},{2,4,8},{6,8,4}};
        int max = 0;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int k = 0; k < matriz[i].length; k++) {
                if (matriz[i][k] > max) {
                    max = matriz[i][k];
                }
            }
        }
        int prim = -1;
        for (int i = 0; i < matriz.length; i++) {
            for (int k = 0; k < matriz[i].length; k++) {
                if (matriz[i][k] == max) {
                    if (prim == -1) {
                        prim = k;
                        System.out.println("Primera aparición: " + i + ". " + k);
                    }
                    System.out.println(i + ". " + k);
                }
            }
        }

    }

}
