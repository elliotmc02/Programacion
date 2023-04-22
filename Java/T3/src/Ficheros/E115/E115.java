package Ficheros.E115;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E115 {

    public static void main(String[] args) {

        String ruta = "src/Ficheros/E115/numeros.txt";

        try ( BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            int mayor = Integer.MIN_VALUE;
            int menor = Integer.MAX_VALUE;
            int contadorMayor = 0;
            int contadorMenor = 0;
            int num;
            String linea = "";
            do {
                linea = br.readLine();
                if (linea != null) {
                    num = Integer.parseInt(linea);
                    System.out.println(num);
                    if (mayor < num) {
                        mayor = num;
                        contadorMayor = 1;
                    } else if (mayor == num) {
                        contadorMayor++;
                    }
                    if (menor > num) {
                        menor = num;
                        contadorMenor = 1;
                    } else if (menor == num) {
                        contadorMenor++;
                    }
                }
            } while (linea != null);
            
            System.out.println("Mayor: " + mayor + " aparece " + contadorMayor + " veces");
            System.out.println("Menor: " + menor + " aparece " + contadorMenor + " veces");
            

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
