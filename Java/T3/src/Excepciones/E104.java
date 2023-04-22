package Excepciones;

import java.util.Scanner;
import java.util.InputMismatchException;

public class E104 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 0; // Longitud del array
        boolean correcto = false;
        do {
            try {
                System.out.print("Introduzca tamaño del array: ");
                n = sc.nextInt();
                correcto = true;
            } catch (InputMismatchException | NegativeArraySizeException e) {
                System.out.println("Error, mete un numero entero");
                sc.nextLine();
            }
        } while (!correcto);

        double lista[] = new double[n];

        for (int i = 0; i < lista.length; i++) {
            try {
                System.out.print("Introduzca numero (puede ser decimal): ");
                lista[i] = sc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Error. Mete un numero valido");
                i--;
                sc.next();
            }

        }
        sc.close();
        for (double i : lista) {
            System.out.println(i);
        }
    }

}
