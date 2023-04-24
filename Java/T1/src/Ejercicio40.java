/*
40. Diseña un algoritmo que  pida dos números por teclado (m y n) y calcule el número
combinatorio de ambos.
El número combinatorio se calcula usando la expresión:  m! / n!*(m-n)!
Importante: Hay que obligar a que  m >= n.
 */

import java.util.Scanner;

public class Ejercicio40 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n, m, res;
        do {
            System.out.print("Dame el valor M (debe ser mayor): ");
            m = teclado.nextInt();
            System.out.print("Dame el valor N: ");
            n = teclado.nextInt();
            if (n > m) {
                System.out.println("Error. M debe ser mayor que N.");
            }
        } while (n > m);
        teclado.close();
        res = m / n * (m - n);
        System.out.println(res);
    }

}
