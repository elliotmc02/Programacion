// Elliot Moyano Cutler

package T3P2;

import java.util.Scanner;

import java.io.FileWriter;
import java.io.BufferedWriter;

import java.io.IOException;

import java.util.InputMismatchException;

public class ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String RUTA = "src/T3P2/numeros.txt";
        int nLineas = 0;
        int cNumeros = 0;
        
        // para comprobar que sea mayor que 2
        do {
            try { // los try para que solo me meta numeros
                System.out.print("Numero de lineas del fichero: ");
                nLineas = sc.nextInt();
                if (nLineas <= 2) {
                    System.out.println("Solo mayores que 2");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes introducir un numero");
                sc.nextLine();
            }
        } while (nLineas <= 2);

        do {
            try {
                System.out.print("Cantidad de numeros por linea: ");
                cNumeros = sc.nextInt();
                if (cNumeros <= 2) {
                    System.out.println("Solo mayores que 2");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes introducir un numero");
                sc.nextLine();
            }
        } while (cNumeros <= 2);

        // Generar fichero
        try ( BufferedWriter bw = new BufferedWriter(new FileWriter(RUTA))) {
            for (int i = 0; i < nLineas; i++) {
                for (int j = 0; j < cNumeros; j++) {
                    bw.write(Integer.toString(((int) ((Math.random() * (20 - 3 + 1)) + 3))));
                    if (j != cNumeros - 1) {
                        bw.write(",");
                    }
                }
                bw.write(System.lineSeparator());
            }
            System.out.println("El fichero " + RUTA.substring(RUTA.lastIndexOf("/") + 1) + " se ha generado con éxito");
        } catch (IOException e) {
            System.out.println("Error al escribir fichero (" + e.getMessage() + ")");
        }

        sc.close();

    }

}
