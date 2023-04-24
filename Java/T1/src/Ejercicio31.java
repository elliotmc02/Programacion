/*31. Realizar un algoritmo que pida por teclado un numero entero y a continuación
muestre todos los divisores de ese número.*/

import java.util.Scanner;

public class Ejercicio31 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int num = teclado.nextInt();
        int divisor = num;
        while (num > 0 && divisor != 0) {
            if (num % divisor == 0) {
                System.out.println(divisor);
            }
            divisor--;
        }
    }

}
