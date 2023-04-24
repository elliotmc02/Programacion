/*
 Realizar   un   programa   que   pida   al   usuario   un   numero   N   entre   3   y   5   y,   a
continuación, cree una matriz NxN (N filas, N columnas) cuyos elementos se le van a ir
pidiendo al usuario.
*/

package Array;

import java.util.Scanner;

public class E58 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int n;
        do {
            System.out.print("Dame un numero entre el 3 y 5: ");
            n = teclado.nextInt();
        } while(n<3||n>5);
        
        int matriz[][] = new int [n][n];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int k = 0; k < matriz[i].length; k++) {
                System.out.print("Dame un numero para la fila " + i + " y columna " + k + ": ");
                matriz[i][k] = teclado.nextInt();
            }
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int k = 0; k < matriz[i].length; k++) {
                System.out.print(matriz[i][k]);
                if (k != matriz[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
        
    }

}
