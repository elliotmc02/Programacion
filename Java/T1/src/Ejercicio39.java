/*
39. Diseña un algoritmo que calcule el factorial de un número pedido por teclado. Pej: 
el factorial de 5 es: 5! = 5*4*3*2*1 = 120
 */

import java.util.Scanner;

public class Ejercicio39 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Dame un numero: ");
        int n = teclado.nextInt();
        teclado.close();
        int i, res;
        res = 1;
        System.out.print("El factorial de " + n + " es:");
        for (i = n; i > 0; i--) {
            res *= i;
            System.out.print(i + "*");
        }
        System.out.print(" = " + res + " ");
    }
}
