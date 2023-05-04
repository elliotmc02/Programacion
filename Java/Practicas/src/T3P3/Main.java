package T3P3;

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

public class Main {

    public static void main(String[] args){

        String RUTA = "src/T3P3/datos.dat";

        Scanner sc = new Scanner(System.in);

        Hospital h = new Hospital();
        HashMap<String, Paciente> pacientes = h.getHospital();

        String opcion;

        String DNI;
        String nombre;
        String apellido;
        char sexo;
        HashSet<String> alergias;
        String res;


        do {
            System.out.print("1. Añadir paciente \n2. Eliminar paciente \n3. Mostrar sexo \n4. Mostrar alergias \n5. Mostrar datos \n6. Guardar datos \n7. Cargar datos \n8. Salir \nOpcion: ");
            opcion = sc.nextLine();

            // Switch para cada opcion
            switch (opcion) {
                case "1":
                    System.out.print("DNI: ");
                    DNI = sc.nextLine();
                    System.out.print("Nombre: ");
                    nombre = sc.nextLine();
                    System.out.print("Apellido: ");
                    apellido = sc.nextLine();
                    String stringSexo;
                    do {
                        System.out.print("Sexo (M/F): ");
                        stringSexo = sc.nextLine();
                    } while (!stringSexo.equalsIgnoreCase("f") && !stringSexo.equalsIgnoreCase("m"));
                    sexo = (stringSexo.equalsIgnoreCase("m") ? 'M' : 'F');
                    alergias = new HashSet<>();
                    do {
                        System.out.print("Tiene alergias? (S/N): ");
                        res = sc.nextLine();
                    } while (!res.equalsIgnoreCase("si") && !res.equalsIgnoreCase("no"));
                    if (res.equalsIgnoreCase("si")) {
                        do {
                            System.out.print("Alergias: ");
                            alergias.add(sc.nextLine());
                            do {
                                System.out.print("Quiere añadir otra alergia? (Si/No): ");
                                res = sc.nextLine();
                            } while (!res.equalsIgnoreCase("si") && !res.equalsIgnoreCase("no"));
                        } while (!res.equalsIgnoreCase("no"));
                    }
                    h.aniadirPaciente(DNI, new Paciente(nombre, apellido, sexo, alergias));
                    break;
                case "2":
                    do {
                        System.out.print("Quiere borrar a alguien en especifico? (Si/No): ");
                        res = sc.nextLine();
                    } while (!res.equalsIgnoreCase("si") && !res.equalsIgnoreCase("no"));
                    if (res.equals("si")) {
                        System.out.print("DNI: ");
                        h.eliminar(sc.nextLine());
                    } else {
                        h.eliminar();
                    }
                    break;
                case "3":
                    do {
                        System.out.print("Sexo (M/F): ");
                        stringSexo = sc.nextLine();
                    } while (!stringSexo.equalsIgnoreCase("f") && !stringSexo.equalsIgnoreCase("m"));
                    sexo = (stringSexo.equalsIgnoreCase("m") ? 'M' : 'F');
                    h.mostrarSexo(sexo);
                    break;
                case "4":
                    h.mostrarAlergias();
                    break;
                case "5":
                    do {
                        System.out.print("Quiere mostrar a alguien en especifico? (Si/No): ");
                        res = sc.nextLine();
                    } while (!res.equalsIgnoreCase("si") && !res.equalsIgnoreCase("no"));
                    if (res.equals("si")) {
                        System.out.println("DNI: ");
                        System.out.println(h.mostrarDatos(sc.nextLine()));
                    } else {
                        System.out.println(h.mostrarDatos());
                    }
                    break;
                case "6":
                    if (h.getHospital().isEmpty()) {
                        System.out.println("No hay nada que grabar");
                    } else {
                        try ( BufferedWriter bw = new BufferedWriter(new FileWriter(RUTA))) {
                            for (String pac : pacientes.keySet()) {
                                stringSexo = (pacientes.get(pac).getSexo() == 'M' ? "Masculino" : "Femenino");
                                bw.write(pac + "/" + pacientes.get(pac).getNombre()+ "/" + pacientes.get(pac).getApellido()+ "/" + stringSexo + "/" + pacientes.get(pac).getAlergias().toString().replaceAll("[\\[\\]]", "") + "/" + System.lineSeparator());
                            }
                        } catch (IOException e) {
                            System.out.println("Error al escribir fichero (" + e.getMessage() + ")");
                        }
                    }
                    break;
                case "7":
                    // primero compruebo que no este vacio el .dat
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
                            try ( BufferedReader br = new BufferedReader(new FileReader(RUTA))) {
                                String linea;
                                h.eliminar();
                                do {
                                    linea = br.readLine();
                                    if (linea != null) {
                                        alergias = new HashSet<>();
                                        DNI = linea.split("/")[0];
                                        nombre = linea.split("/")[1];
                                        apellido = linea.split("/")[2];
                                        stringSexo = linea.split("/")[3];
                                        alergias.addAll(Arrays.asList(linea.split("/")[4].split(", "))); 
                                        sexo = (stringSexo.equalsIgnoreCase("masculino") ? 'M' : 'F');
                                        h.aniadirPaciente(DNI, new Paciente(nombre, apellido, sexo, alergias));
                                    }
                                } while (linea != null);
                            } catch (FileNotFoundException e) {
                                System.out.println("Fichero no encontrado (" + e.getMessage() + ")");
                            } catch (IOException e) {
                                System.out.println("Error al leer fichero (" + e.getMessage() + ")");
                            }
                        
                    }
                    break;
                case "8":
                    System.out.println("Nos vemos");
                    return;
                default:
                    System.out.println("Opcion invalida");
            }
        } while (!opcion.equals("8"));
    }
}

                    