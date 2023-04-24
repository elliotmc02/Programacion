/*
35. Implementa un programa que solicite al usuario dos números: n y m. A continuación
debe mostrar todos los múltiplos de n entre n y m*n. Ejemplo:
Introduce primer número: 4
Introduce segundo número: 10
Los múltiplos de 4 entre 4 y 40 son: 8,12,16,20,24,28,32,36,40
 */

import java.util.Scanner;

public class Ejercicio35Clase {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Dame un numero: ");
        int n = teclado.nextInt();
        System.out.print("Dame otro numero: ");
        int m = teclado.nextInt();
        int i;
        int res = n * m;

        System.out.print("Los múltiplos de " + n + " entre " + n + " y " + res + " son: ");
        for (i = n; i <= res; i++) {

            if (i % n == 0) {
                System.out.print(i + ", ");
            }

        }

    }

}
