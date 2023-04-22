package Ficheros.E116;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E116 {

    public static void main(String[] args) {

        String ruta = "src/Ficheros/E116/fichero.txt";

        try ( BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            String primeraLinea = "";
            String ultimaLinea = "";
            String todasLineas = "";
            String lineaLarga = "";
            boolean primero = false;

            do {
                linea = br.readLine();
                if (linea != null) {
                    if (!primero) {
                        primeraLinea = linea;
                        primero = true;
                    }
                    if (linea.length() > lineaLarga.length()) {
                        lineaLarga = linea;
                    }
                    ultimaLinea = linea;
                    todasLineas += linea + "\n";
                }
            } while (linea != null);
            System.out.println("Primera linea: " + primeraLinea);
            System.out.println("Ultima linea: " + ultimaLinea);
            System.out.println("Todas lineas: \n" + todasLineas);
            System.out.println("Linea más larga: " + lineaLarga);

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
