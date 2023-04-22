package Ficheros.Concesionario;

import java.util.Scanner;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Arrays;

import java.io.FileNotFoundException;
import java.io.IOException;

import java.io.FileReader;
import java.io.BufferedReader;

import java.io.FileWriter;
import java.io.BufferedWriter;

public class Principal {

    public static void main(String[] args) throws InterruptedException {

        String RUTA = "src/Ficheros/Concesionario/stock.dat";

        Scanner sc = new Scanner(System.in);

        Concesionario c = new Concesionario();
        HashMap<String, Vehiculo> coches = c.getCoches();

        String opcion;

        String matricula;
        String marca;
        String modelo;
        String color;
        HashSet<String> equipamiento;
        String km0;
        boolean vKm0;
        String decision;

        System.out.println("Cargando aplicacion...");
        Thread.sleep(1500);
        System.out.println("Aplicacion cargada con exito");

        System.out.println("<<< CONCESIONARIO >>>");

        do {
            System.out.println("<---- MENU ---->");
            System.out.print("1. Añadir vehiculo \n2. Borrar vehiculo \n3. Poner KM-0 \n4. Quitar KM-0 \n5. Imprimir concesionario \n6. Imprimir KM-0 \n7. Cargar datos \n8. Grabar datos \n9. Salir \nOpcion: ");
            opcion = sc.nextLine();

            // Switch para cada opcion
            switch (opcion) {
                case "1":
                    System.out.println("Datos del vehiculo");
                    System.out.print("Matricula: ");
                    matricula = sc.nextLine();
                    System.out.print("Marca: ");
                    marca = sc.nextLine();
                    System.out.print("Modelo: ");
                    modelo = sc.nextLine();
                    System.out.print("Color: ");
                    color = sc.nextLine();
                    equipamiento = new HashSet<>();
                    do {
                        System.out.print("Equipamiento: ");
                        equipamiento.add(sc.nextLine());
                        do {
                            System.out.print("Quiere añadir otro mas? (Si/No): ");
                            decision = sc.nextLine();
                        } while (!decision.equalsIgnoreCase("si") && !decision.equalsIgnoreCase("no"));
                    } while (!decision.equalsIgnoreCase("no"));

                    do {
                        System.out.print("KM0 (Si/No): ");
                        km0 = sc.nextLine();
                    } while (!km0.equalsIgnoreCase("si") && !km0.equalsIgnoreCase("no")); // para controlar que responda si o no
                    vKm0 = km0.equalsIgnoreCase("si"); // Si km0 es "si", sera true
                    System.out.println("Añadiendo vehiculo...");
                    Thread.sleep(1000);
                    c.Insertar(new Vehiculo(matricula, marca, modelo, color, equipamiento, vKm0));
                    System.out.println("Vehiculo añadido");
                    break;
                case "2":
                    System.out.print("Matricula del vehiculo que desea borrar: ");
                    matricula = sc.nextLine();
                    System.out.println("Eliminando vehiculo...");
                    Thread.sleep(1000);
                    System.out.println(c.eliminar(matricula) ? "Vehiculo eliminado" : "No existe ese vehiculo");
                    break;
                case "3":
                    System.out.print("Matricula del vehiculo que desea poner de KM0: ");
                    matricula = sc.nextLine();
                    System.out.println("Poniendo en KM0...");
                    Thread.sleep(1000);
                    System.out.println(c.marcarKM0(matricula) ? "Vehiculo puesto en KM0" : "No existe, o ya esta puesto de tipo KM0");
                    break;
                case "4":
                    System.out.print("Matricula del vehiculo que desea quitar de KM0: ");
                    matricula = sc.nextLine();
                    System.out.println("Quitando de KM0...");
                    Thread.sleep(1000);
                    System.out.println(c.desmarcarKM0(matricula) ? "Vehiculo quitado de KM0" : "No existe o ya no era del tipo KM0");
                    break;
                case "5":
                    System.out.println(c.toString());
                    break;
                case "6":
                    System.out.println(c.mostrarKm0());
                    break;
                case "7":
                    int nLineas = 0;
                    try ( BufferedReader br = new BufferedReader(new FileReader(RUTA))) {
                        String linea;
                        do {
                            linea = br.readLine();
                            if (linea != null) {
                                nLineas++;
                            }
                        } while (linea != null);
                    } catch (FileNotFoundException e) {
                        System.out.println("Fichero no encontrado (" + e.getMessage() + ")");
                    } catch (IOException e) {
                        System.out.println("Error al leer fichero (" + e.getMessage() + ")");
                    }
                    if (nLineas == 0) {
                        System.out.println("No hay nada que cargar");
                    } else {
                        do {
                            System.out.print("Desea cargar los datos?(Si/No): ");
                            decision = sc.nextLine();
                        } while (!decision.equalsIgnoreCase("si") && !decision.equalsIgnoreCase("no"));
                        if (decision.equalsIgnoreCase("si")) {
                            System.out.println("Cargando datos...");
                            Thread.sleep(1000);
                            try ( BufferedReader br = new BufferedReader(new FileReader(RUTA))) {
                                String linea;
                                c.vaciar();
                                do {
                                    linea = br.readLine();
                                    if (linea != null) {
                                        equipamiento = new HashSet<>();
                                        matricula = linea.split(";")[0];
                                        marca = linea.split(";")[1];
                                        modelo = linea.split(";")[2];
                                        color = linea.split(";")[3];
                                        equipamiento.addAll(Arrays.asList(linea.split(";")[4].split(", ")));
                                        km0 = linea.split(";")[5];
                                        vKm0 = km0.equals("true");
                                        c.Insertar(new Vehiculo(matricula, marca, modelo, color, equipamiento, vKm0));
                                    }
                                } while (linea != null);
                                System.out.println("Datos cargados con exito");
                            } catch (FileNotFoundException e) {
                                System.out.println("Fichero no encontrado (" + e.getMessage() + ")");
                            } catch (IOException e) {
                                System.out.println("Error al leer fichero (" + e.getMessage() + ")");
                            }
                        }
                    }
                    break;
                case "8":
                    if (c.getCoches().isEmpty()) {
                        System.out.println("No hay nada que grabar");
                    } else {
                        System.out.println("Grabando datos...");
                        Thread.sleep(1000);
                        try ( BufferedWriter bw = new BufferedWriter(new FileWriter(RUTA))) {
                            for (Vehiculo vehic : coches.values()) {
                                km0 = (vehic.isKm0() ? "true" : "false");
                                bw.write(vehic.getMatricula() + ";" + vehic.getMarca() + ";" + vehic.getModelo() + ";" + vehic.getColor() + ";" + vehic.getEquipamiento().toString().replaceAll("[\\[\\]]", "") + ";" + km0);
                            }
                            System.out.println("Datos grabados con exito");
                        } catch (IOException e) {
                            System.out.println("Error al escribir fichero (" + e.getMessage() + ")");
                        }
                    }
                    break;
                case "9":
                    if (!c.getCoches().isEmpty()) {
                        System.out.println("Grabando datos antes de salir...");
                        Thread.sleep(1000);
                        try ( BufferedWriter bw = new BufferedWriter(new FileWriter(RUTA))) {
                            for (Vehiculo vehic : coches.values()) {
                                km0 = (vehic.isKm0() ? "true" : "false");
                                bw.append(vehic.getMatricula() + ";" + vehic.getMarca() + ";" + vehic.getModelo() + ";" + vehic.getColor() + ";" + vehic.getEquipamiento().toString().replaceAll("[\\[\\]]", "") + ";" + km0 + System.lineSeparator());
                            }
                            System.out.println("Datos grabados con exito");
                        } catch (IOException e) {
                            System.out.println("Error al leer fichero (" + e.getMessage() + ")");
                        }
                    }
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opcion invalida");
            }
        } while (!opcion.equals("9"));
    }
}
