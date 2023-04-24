/*
Crea un programa que cree una matriz de tamaño NxM (tamaños introducido por
teclado)   e   introduzca   en   ella  los  valores   también  a   través   del   teclado  teclado.  A
continuación deberá mostrar por pantalla cuántos valores son mayores que cero, cuántos
son menores que cero y cuántos son igual a cero (es decir, se muestran 3 números).
*/

package Array;

import java.util.Scanner;

public class E61 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int fila = 0, columna = 0;
        do {
            if (fila <= 0) {
                System.out.print("Tamaño fila mayor que 0: ");
                fila = teclado.nextInt();
            }
            if (fila > 0) {
                System.out.print("Tamaño columna mayor que 0: ");
                columna = teclado.nextInt();
            }
        } while (fila <=0 || columna <=0);

        int matriz[][] = new int [fila][columna];
        
        int mayor0 = 0, menor0 = 0, igual0 = 0;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int k = 0; k < matriz[i].length; k++) {
                System.out.print("Introduce fila " + i + " columna " + k + ": ");
                matriz[i][k] = teclado.nextInt();
                if (matriz[i][k] > 0) {
                    mayor0++;
                }
                else if (matriz[i][k] < 0) {
                    menor0++;
                }
                else {
                    igual0++;
                }
            }
        }
        System.out.println("Mayores que 0: " + mayor0);
        System.out.println("Menores que 0: " + menor0);
        System.out.println("Iguales que 0: " + igual0);
        
    }

}
