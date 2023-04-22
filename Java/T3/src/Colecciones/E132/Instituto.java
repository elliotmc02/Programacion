package Colecciones.E132;

import java.util.HashMap;
import java.util.HashSet;

public class Instituto {

    private HashMap<String, String> mapa;

    public Instituto() {
        this.mapa = new HashMap<>();
    }

    public void aniadirAlumno(String nombre, String ciudad) {
        if (this.mapa.containsKey(nombre)) {
            System.out.println("Ya existe un alumno con ese nombre");
        } else {
            this.mapa.put(nombre, ciudad);
            System.out.println("Alumno añadido");
        }
    }

    public void mostrarCiudad(String ciudad) {
        int n = 0;
        if (this.mapa.containsValue(ciudad)) {
            System.out.println(ciudad);
            for (String c : this.mapa.values()) {
                if (ciudad.equals(c)) {
                    n++;
                }
            }
            System.out.println("Numero de alumnos nacidos en " + ciudad + ": " + n);
        } else {
            System.out.println("No se encuentra esa ciudad");
        }
    }

    public int cantidadCiudades() {
        return new HashSet<>(this.mapa.values()).size();
    }

    public String mostrarDatos() {
        String str = "";
        for (String clave : this.mapa.keySet()) {
            str += "\nAlumno: " + clave + " Ciudad: " + this.mapa.get(clave);
        }
        return str;
    }

    public void borrar(String nombre) {
        if (this.mapa.containsKey(nombre)) {
            this.mapa.remove(nombre);
            System.out.println("Alumno " + nombre + " borrado");
        } else {
            System.out.println("No se encuentra en la lista");
        }
    }

    public void borrar() {
        this.mapa.clear();
        System.out.println("Alumnos borrados");
    }

    public String resumen() {
        int contador = 0;
        String str = "";
        for (String ciudades : new HashSet<>(this.mapa.values())) {
            for (String alumnos : this.mapa.keySet()) {
                if (this.mapa.get(alumnos).equals(ciudades)) {
                    contador++;
                }
            }
            str += ciudades + ": " + contador + (contador != 1 ? " alumnos." : " alumno.") + "\n";
            contador = 0;
        }
        return str;
    }

}
