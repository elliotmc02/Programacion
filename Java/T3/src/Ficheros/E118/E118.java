package Ficheros.E118;

import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class E118 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String ruta;
        do {
            System.out.print("Escriba el nombre del fichero ('carpeta'/fichero.extension \nEscriba 'Salir' para salir: ");
            ruta = "src/Ficheros/" + sc.nextLine();

            if (!ruta.equalsIgnoreCase("src/Ficheros/Salir")) {

                if (ruta.equals("src/Ficheros/")) {
                    ruta = "src/Ficheros/E117/fichero.txt";
                }

                System.out.println("Abriendo " + ruta.substring(ruta.lastIndexOf("/") + 1));

                try ( BufferedReader br = new BufferedReader(new FileReader(ruta))) {
                    String linea = "";
                    do {
                        linea = br.readLine();
                        if (linea != null) {
                            System.out.println(linea);
                        }
                    } while (linea != null);
                } catch (FileNotFoundException e) {
                    System.out.println("Fichero no encontrado. Compruebe de nuevo.");
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        } while (!ruta.equalsIgnoreCase("src/Ficheros/Salir"));
        System.out.println("Saliendo...");
        sc.close();

    }

}
