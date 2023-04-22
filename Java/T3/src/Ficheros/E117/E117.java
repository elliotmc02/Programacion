package Ficheros.E117;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class E117 {

    public static void main(String[] args) {

        String ruta = "src/Ficheros/E117/fichero.txt";

        int nCaracteres = 0;
        int nPalabras = 0;
        int nLineas = 0;
        String linea = "";

        try ( BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            do {
                linea = br.readLine();
                if (linea != null) {
                    nLineas++;
                    nPalabras += linea.split(" ").length;
                    nCaracteres += linea.replace(" ", "").length();
                }
            } while (linea != null);
            System.out.println("Numero lineas: " + nLineas);
            System.out.println("Numero palabras: " + nPalabras);
            System.out.println("Numero caracteres: " + nCaracteres);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
