// Elliot Moyano Cutler
package T3P2;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;

import java.io.IOException;

import java.io.File;

import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String carpeta = "src/T3P2/";

        String linea = "";
        int transformacion; // para transformarlo a int

        System.out.print("Introduzca el archivo a codificar: ");
        String RUTA = carpeta + sc.nextLine();
        String RUTAcod;

        File fichero = new File(RUTA);
        if (fichero.exists()) { // si es fichero existe, ejecutara el codigo
            RUTAcod = carpeta + (RUTA.substring(RUTA.lastIndexOf("/") + 1).split("\\.")[0]) + ".cod";
            System.out.println("Generando archivo " + RUTAcod);
            File ficheroCod = new File(RUTAcod);
            try {
                ficheroCod.createNewFile(); // creo el fichero codificado
            } catch (IOException e) {
                System.out.println("Error al crear fichero");
            }

            try ( BufferedReader br = new BufferedReader(new FileReader(RUTA));  BufferedWriter bw = new BufferedWriter(new FileWriter(RUTAcod))) {
                do {
                    linea = Integer.toString(br.read()); // pillo el tostring del caracter
                    transformacion = Integer.parseInt(linea);
                    // lo paso a int
                    if (transformacion != -1) { // ya que es caracter, null = -1bw.write(transformacion);
                        if (transformacion >= 65 && transformacion <= 122) { // si es una letra
                            switch (transformacion) {
                                case 122:
                                    transformacion = 97; // si es la Z
                                    break;
                                case 90:
                                    transformacion = 65; // si es la z
                                    break;
                                default:
                                    transformacion++; // si no es ni la z ni Z
                                    break;
                            }
                        } else if (transformacion == 32) { // espacio en blanco
                            transformacion = linea.charAt(0);
                        } else if (transformacion >= 48 && transformacion <= 57) { // digito
                            transformacion = linea.charAt(0);
                        } else if (transformacion == 10) { // salto de linea
                            transformacion = 10;
                        } else {
                            transformacion -= 5; // otro caracter
                        }
                        bw.write(transformacion);

                    }
                } while (transformacion != -1);
                System.out.println("Archivo " + RUTAcod.substring(RUTAcod.lastIndexOf("/") + 1) + " generado con exito.");
            } catch (IOException e) {
                System.out.println("Error al leer fichero");
            }

        } else {
            System.out.println("El fichero no existe");
        }

        sc.close();

    }

}

// Errores

/*
- Si llega un espacio en blanco, el enunciado te dice que en el código pongas el caracter ], no su numero en la tabla unicode como tu pones (93)

No entiendo el IF de las lineas 67 a 69

- Tu codificación no controla bien el salto de linea
*/