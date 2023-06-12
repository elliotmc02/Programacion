/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moyano_elliot;

import java.io.FileReader;
import java.io.BufferedReader;

import java.io.IOException;
import java.io.FileNotFoundException;

public class Juego {

    private Tablero tablero;
    String ruta;

    public Juego(String ruta) {
        this.ruta = ruta;
    }

    public void jugar() {
        try ( BufferedReader br = new BufferedReader(new FileReader(this.ruta))) {
            String linea = br.readLine();
            tablero = new Tablero(Integer.parseInt(linea.split(",")[0]), Integer.parseInt(linea.split(",")[1]));
            do {
                linea = br.readLine();
                if (linea != null) {
                    int color = Integer.parseInt(linea.split(",")[0]);
                    int columna = Integer.parseInt(linea.split(",")[1]);
                    tablero.meterFicha(color, columna - 1);
                    GUI.pasarTexto(linea);
                }
            } while (linea != null);
        } catch (FileNotFoundException e) {
            System.out.println("No se encontro el fichero [" + e.getMessage() + "]");
        } catch (IOException e) {
            System.out.println("Error al abrir el fichero [" + e.getMessage() + "]");
        }
    }

}
