// Elliot Moyano Cutler

package T3P2;

import java.io.FileReader;
import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ejercicio2 {

    public static void main(String[] args) {

        String RUTA = "src/T3P2/numeros.txt";

        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int suma = 0;
        int totalNums = 0;
        double media;
        int num; // parseInt
        String arrayLinea[]; // Para guardar los numeros de cada linea y luego usar su .length

        String linea = "";

        try ( BufferedReader br = new BufferedReader(new FileReader(RUTA))) {
            System.out.println("Obteniendo datos del fichero " + RUTA.substring(RUTA.lastIndexOf("/") + 1));
            do {
                linea = br.readLine();
                if (linea != null) {
                    arrayLinea = linea.split(","); // guardo cada numero en cada cajon de array
                    for (String nums : arrayLinea) {
                        num = Integer.parseInt(nums); // paso a int los nums
                        if (num > mayor) {
                            mayor = num;
                        }
                        if (num < menor) {
                            menor = num;
                        }
                        suma += num;
                    }
                    totalNums += arrayLinea.length; // el total de numeros sera la suma de cada array.length
                }
            } while (linea != null);
            media = (double)suma / totalNums;
            System.out.println("Mayor valor: " + mayor);
            System.out.println("Menor valor: " + menor);
            System.out.println("Suma total: " + suma);
            System.out.println("Media: " + media);

        } catch (FileNotFoundException e) {
            System.out.println("Error: Fichero no encontrado (" + e.getMessage() + ")");
        } catch (IOException e) {
            System.out.println("Error al leer el fichero");
        }

    }

}
