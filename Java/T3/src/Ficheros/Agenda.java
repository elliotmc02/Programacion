// no terminado

package Ficheros;

import java.util.Scanner;

import java.util.InputMismatchException;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.io.FileReader;
import java.io.BufferedReader;

import java.io.FileWriter;
import java.io.BufferedWriter;

public class Agenda {

    public static void main(String[] args) {

        int opcion = -1;

        String nombre = "";
        int tlf;

        int nLineas;

        String ruta = "src/Ficheros/Agenda.txt";

        Scanner sc = new Scanner(System.in);

        do {
            // Comprobar que la agenda no esté llena
            nLineas = 0;
            try ( BufferedReader br = new BufferedReader(new FileReader(ruta))) {
                String linea = "";

                do {
                    linea = br.readLine();
                    if (linea != null) {
                        nLineas++;
                    }
                } while (linea != null);
            } catch (FileNotFoundException e) {
                System.out.println("Error, no se encontró el archivo " + e.getMessage());
                return;
            } catch (IOException e) {
                System.out.println("Error al leer archivo " + e.getMessage());
            }

            System.out.println("Contactos: " + nLineas);

            // MENU
            System.out.println("1. Nuevo contacto");
            System.out.println("2. Buscar por nombre");
            System.out.println("3. Mostrar todo");
            System.out.println("4. Salir");
            System.out.print("\nOpcion: ");

            try {
                opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion) {
                    case 1:
                        if (nLineas != 20) {
                            boolean repetido = false;
                            try { // Try para nombre
                                System.out.print("Nombre: ");
                                nombre = sc.nextLine();

                                try ( BufferedReader br = new BufferedReader(new FileReader(ruta))) {
                                    String linea = "";
                                    while (linea != null && !repetido) {
                                        linea = br.readLine();
                                        if (linea != null) {
                                            if (linea.split(" - ")[0].equalsIgnoreCase(nombre)) {
                                                repetido = true;
                                            }
                                        }
                                    }
                                } catch (IOException e) {
                                    System.out.println("Error al leer archivo " + e.getMessage());
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Error al introducir datos: " + e.getMessage());
                                sc.nextLine();
                            }
                            if (repetido) {
                                System.out.println("Ya guardado");
                            } else {
                                try ( BufferedWriter bw = new BufferedWriter(new FileWriter(ruta, true))) {
                                    System.out.print("Telefono: ");
                                    tlf = sc.nextInt();

                                    bw.write(nombre + " - " + tlf + System.lineSeparator());

                                } catch (IOException e) {
                                    System.out.println("Error escritura: " + e.getMessage());
                                }
                            }
                        } else {
                            System.out.println("Agenda llena");
                        }

                        break;
                    case 3:
                        try ( BufferedReader br = new BufferedReader(new FileReader(ruta))) {
                        String linea = "";
                        int i = 1;
                        do {
                            linea = br.readLine();
                            if (linea != null) {
                                System.out.println(i + ".-" + linea);
                                i++;
                            }
                        } while (linea != null);
                    } catch (FileNotFoundException e) {
                        System.out.println("Error archivo no encontrado " + e.getMessage());
                    } catch (IOException e) {
                        System.out.println("Error al leer el fichero: " + e.getMessage());
                    }
                    break;
                    case 4:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opcion invalida.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error al introducir por teclado " + e.getMessage());
                sc.nextLine();
            }

        } while (opcion != 4);
    }
}
