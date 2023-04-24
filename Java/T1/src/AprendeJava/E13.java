/*
Escribe un programa que rellene un array de 100 elementos con números 
enteros aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuación
el programa mostrará el array y preguntará si el usuario quiere destacar el
máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
el número destacado entre dobles asteriscos
 */
package AprendeJava;

import java.util.Scanner;

public class E13 {

    public static void main(String[] args) {

        int[] lista = new int[100];
        Scanner teclado = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < lista.length; i++) {
            lista[i] = (int)(Math.random() * 501);
            if (lista[i] > max) {
                max = lista[i];
            }
            if (lista[i] < min) {
                min = lista[i];
            }
            System.out.print(lista[i] + " ");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
        System.out.print("Que quieres destacar? 1-Minimo, 2-Maximo: ");
        int opcion = teclado.nextInt();
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == max && opcion == 2) {
                System.out.println("***" + "");
            }
        }

    }

}
