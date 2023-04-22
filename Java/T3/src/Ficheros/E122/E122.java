package Ficheros.E122;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;
import java.util.InputMismatchException;

// esta mal


public class E122 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido a Hol Horse Alone");

        System.out.print("Dime tu nombre: ");
        String nombre = sc.nextLine().toLowerCase();

        String rutaJugador = "src/Ficheros/E122/Data/" + nombre.replaceAll("[\\\\/:*?\"<>|]", "") + ".dat";
        String rutaCaballos = "src/Ficheros/E122/horses.dat";
        String linea = "";
        boolean yaExiste = true;
        // comprobar si existe el fichero

        try {
            File ficheroJugador = new File(rutaJugador);

            if (!ficheroJugador.exists()) {
                ficheroJugador.createNewFile();
                yaExiste = false;
                System.out.println("Datos creados");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        // hacer con catch
        // try para writer
        try (
                 BufferedWriter bw = new BufferedWriter(new FileWriter(rutaJugador))) {

            // rellenar datos del jugador si NO existe
            if (!yaExiste) {
                System.out.println("Rellenando datos por defecto...");
                bw.write("Nombre:" + nombre + System.lineSeparator());
                bw.write("Dinero:100" + System.lineSeparator());
                bw.write("Ap. totales:0" + System.lineSeparator());
                bw.write("Ap. Ganadas:0");
            }
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }

        // try para reader
        try (
                 BufferedReader br = new BufferedReader(new FileReader(rutaJugador));  BufferedReader br2 = new BufferedReader(new FileReader(rutaCaballos))) {

            int dinero;
            int aput;
            int apug;

            System.out.println(nombre + ", bienvenido");
            br.readLine();
            String cDinero = br.readLine();
            dinero = Integer.parseInt(cDinero.split(":")[1]);
            String cAput = br.readLine();
            aput = Integer.parseInt(cAput.split(":")[1]);
            String cApug = br.readLine();
            apug = Integer.parseInt(cApug.split(":")[1]);
            System.out.println("Nombre: " + nombre);
            System.out.println("Dinero: " + dinero);
            System.out.println("Apuestas Totales: " + aput);
            System.out.println("Apuestas Ganadas: " + apug);

            // leer datos de los caballos
            String caballo;
            String listaCaballos[];
            do {
                linea = br2.readLine();
                caballo = linea;
                listaCaballos = caballo.split(": ");
                if (linea != null) {
                    System.out.println(linea);
                }
            } while (linea != null);

            // zona de la carrera
            boolean correcto = false;
            String apuestaCaballo;
            if (dinero >= 15) {
                do {
                    System.out.print("Apuesta por uno de los 3 caballos: ");
                    apuestaCaballo = sc.nextLine();
                    // comprobar si el caballo existe
                    for (int i = 0; i < listaCaballos.length; i++) {
                        if (listaCaballos[i].equalsIgnoreCase(apuestaCaballo)) {
                            correcto = true;
                        }
                    }
                    if (!correcto) {
                        System.out.println("No existe ese caballo");
                    }
                } while (!correcto);

                // apostar dinero
                int apuestaJugador = 0;
                String opcion = "N";
                correcto = false;
                do {
                    try {
                        do {
                            System.out.print("Cuanto dinero quiere apostar? (mayor que 15): ");
                            apuestaJugador = sc.nextInt();
                            if (apuestaJugador >= 15) {
                                System.out.println("Está seguro que quiere apostar " + apuestaJugador + " €?\nS/N");
                                opcion = sc.next();
                            }
                        } while (apuestaJugador < 15 || opcion.equalsIgnoreCase("N"));
                        correcto = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Solo numeros");
                    }
                } while (!correcto);

                int aleatorio = (int) (Math.random() * listaCaballos.length + 1);
                String ganador;
                switch (aleatorio) {
                    case 1:
                        ganador = listaCaballos[0];
                        break;
                    case 2:
                        ganador = listaCaballos[1];
                        break;
                    case 3:
                        ganador = listaCaballos[2];
                        break;
                    default:
                        return;
                }

                System.out.println("Ganador: " + ganador);

                if (ganador.equalsIgnoreCase(apuestaCaballo)) {
                    dinero += apuestaJugador * 1.5;
                }

            } else {
                System.out.println("No tiene suficiente dinero para apostar.");
            }
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }

    }

}
