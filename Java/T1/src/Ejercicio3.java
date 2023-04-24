//3. Crea un algoritmo que calcule la media de 5 números que se le pasan por teclado.

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double num1;
        double num2;
        double num3;
        double num4;
        double num5;
        System.out.print("Introduzca el primer número:");
        num1 = teclado.nextDouble();
        System.out.print("Introduzca el segundo número:");
        num2 = teclado.nextDouble();
        System.out.print("Introduzca el tercer número:");
        num3 = teclado.nextDouble();
        System.out.print("Introduzca el cuarto número:");
        num4 = teclado.nextDouble();
        System.out.print("Introduzca el quinto número:");
        num5 = teclado.nextDouble();
        teclado.close();
        double media = (int) Math.round((num1 + num2 + num3 + num4 + num5) / 5);
        System.out.println("Media:" + media);
    }
}
