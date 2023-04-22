package T1P3;

import java.util.Scanner;

public class T1P3E1 {

    public static void main(String[] args) {

        // Apartado A
        System.out.println("\nAPARTADO A");
        Scanner teclado = new Scanner(System.in);
        int n;

        do {
            System.out.print("Dame un número mayor que 1: ");
            n = teclado.nextInt();
            if (n <= 1) {
                System.out.println("Error. Debe ser mayor que 1.");
            }
        } while (n <= 1);

        // Apartado B y C
        System.out.println("\nAPARTADO B Y C");

        int matriz[][] = new int[n][n];
        int suma = 0;

        // relleno la matriz con numeros aleatorios
        for (int i = 0; i < matriz.length; i++) {
            for (int k = 0; k < matriz[i].length; k++) {
                matriz[i][k] = (int) ((Math.random() * (20 - 2 + 1)) + 2);
                if (matriz[i][k] >= 2 && matriz[i][k] <= 9) {
                    System.out.print("0");
                }
                System.out.print(matriz[i][k] + " ");
                suma += matriz[i][k];
            }
            System.out.println("");
        }

        // Apartado D
        System.out.println("\nAPARTADO D");
        System.out.println("La suma es: " + suma);

        //Apartado E
        System.out.println("\nAPARTADO E");
        int copia[][] = new int[n][n];

        // copio el array y cambio los valores >=10
        for (int i = 0; i < copia.length; i++) {
            for (int k = 0; k < copia[i].length; k++) {
                copia[i][k] = matriz[i][k];
                if (copia[i][k] >= 10) {
                    copia[i][k] = 9;
                }
                if (copia[i][k] >= 2 && copia[i][k] <= 9) {
                    System.out.print("0");
                }
                System.out.print(copia[i][k] + " ");
            }
            System.out.println("");
        }

        //Apartado F
        System.out.println("\nAPARTADO F");

        int num;
        do {
            System.out.print("Dame un número entre 1 y " + n + ": ");
            num = teclado.nextInt();

            if (num <= 0 || num > n) {
                System.out.println("Error. Debe estar entre 1 y " + n);
            }
        } while (num <= 0 || num > n);

        teclado.close();

        int tmp[][] = new int[n][n];
        num -= 1; // hago esto porque las filas de los arrays empiezan por 0, si el usuario me pide la fila 1, se refiere a la fila 0 del array

        // Guardo la fila en un array temporal
        for (int k = 0; k < copia[num].length; k++) {
            tmp[num][k] = copia[num][k];
            copia[num][k] = matriz[num][k];
            matriz[num][k] = tmp[num][k];
        }

        System.out.println("\nMatriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int k = 0; k < matriz[i].length; k++) {
                if (matriz[i][k] >= 2 && matriz[i][k] <= 9) {
                    System.out.print("0");
                }
                System.out.print(matriz[i][k] + " ");
            }
            System.out.println("");
        }

        System.out.println("\nCopia");
        for (int i = 0; i < copia.length; i++) {
            for (int k = 0; k < copia[i].length; k++) {
                if (copia[i][k] >= 2 && copia[i][k] <= 9) {
                    System.out.print("0");
                }
                System.out.print(copia[i][k] + " ");
            }
            System.out.println("");
        }

    }

}

// Comentarios

/*
EJERCICIO 1

Línea 31: si pones (matriz[i][k] < 10), escribes menos xD
 */
