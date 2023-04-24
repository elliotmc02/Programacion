/*
Crea dos arrays de enteros tamaño 5.  A continuación:
•Rellena el primero con números aleatorios entre el 2 y el 50. 
•Rellena el segundo con valores que introduzca el usuario por teclado.
•Crea un tercer array cuyos valores en cada celda van a ser la suma de las celdas
correspondientes de los otros dos arrays. Es decir, para la celda 1: la suma de las
celdas 1 del 1er y del 2º array. Para la celda 2: la suma de las celdas 2 del  1er y del 2º
array y así sucesivamente.
•Muestra el tercer array por pantalla.
•Muestra la suma de todos los elementos del tercer array.
 */
package Array;

import java.util.Scanner;

public class E56 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int[] random = new int[5];
        int[] usuario = new int[5];
        int[] sumas = new int[5];
        int suma = 0;
        for (int i = 0; i < random.length; i++) {
            random[i] = (int) ((Math.random() * (49)) + 2);
            System.out.print("Dame un numero: ");
            usuario[i] = teclado.nextInt();
            sumas[i] = random[i] + usuario[i];
        }
        for (int i = 0; i < sumas.length; i++) {
            System.out.print(sumas[i]);
            if (i != sumas.length - 1) {
                System.out.print(", ");
            }
            suma += sumas[i];
        }
        System.out.println("\n" + suma);
    }
}
