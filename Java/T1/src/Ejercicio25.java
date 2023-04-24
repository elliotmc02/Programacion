/*25. Realiza un programa que indique si un numero introducido por teclado es de 5 cifras
y además es par.*/

import java.util.Scanner;

public class Ejercicio25 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int num = teclado.nextInt();
        teclado.close();
        int c5 = num % 10;
        if (num >= 10000 && num < 100000) {
            System.out.print("Es de 5 cifras ");
            if (c5 % 2 == 0) {
                System.out.println("y es par");
            }
        } else {
            System.out.println("No es de 5 cifras");
        }
    }

}
