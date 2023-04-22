/*
113.- Crea un programa que vaya pidiendo frases por teclado al usuarios hasta que
introduzca una frase vacía.
Para cada frase que el usuario introduzca, se almacenará una debajo de otra en un
fichero de texto llamado EJ112.dat Este fichero no debe existir al ejecutarse el
programa.
 */
package Ficheros.E113;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;

public class E113 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String texto = "";
        try {
            String ruta = "src/Ficheros/E113/EJ113.dat";

            File fichero = new File(ruta);
            
            if (!fichero.exists()) {
                fichero.createNewFile();
            }

            FileWriter fw = new FileWriter(fichero);
            BufferedWriter bw = new BufferedWriter(fw);
            System.out.println("Ve introduciendo frases: ");
            do {
                texto = sc.nextLine();
                bw.write(texto + "\n");
            } while (!texto.equals(""));
            bw.close();
            fw.close();
            sc.close();

        } catch (IOException e) {
            System.out.println("Error al cerrar datos");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado");
            System.out.println(e.getMessage());
        }

    }

}
