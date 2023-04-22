/*
112.- Diseña una aplicación que pida al usuario su nombre y edad. Estos datos deben
guardarse en el fichero de texto datos.txt. Si este fichero ya existe, debe borrarse su
contenido, y en caso de no existir, debe crearse.
Dime tu nombre>> David
Dime tu edad>> 41
Datos guardados en fichero datos.txt
 */
package Ficheros.E112;

import java.io.FileWriter;
import java.io.File;
import java.io.BufferedWriter;
import java.util.Scanner;
import java.io.IOException;
import java.util.InputMismatchException;

public class E112 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            String ruta = "src/Ficheros/E112/ficheroE112.txt";

            File fichero = new File(ruta);

            if (!fichero.exists()) {
                fichero.createNewFile();
            }

            FileWriter fw = new FileWriter(fichero);
            BufferedWriter bw = new BufferedWriter(fw);
            System.out.print("Dime tu nombre: ");
            bw.write(sc.next() + "\n");
            System.out.print("Dime tu edad: ");
            bw.write(sc.next());
            bw.close();
            fw.close();
            sc.close();
            System.out.println("Datos guardados en: " + ruta.substring(ruta.lastIndexOf("/") + 1));
        } catch (IOException e) {
            System.out.println("Error cerrando datos");
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error introduciendo datos");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
