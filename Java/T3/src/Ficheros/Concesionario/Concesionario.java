package Ficheros.Concesionario;

import java.util.HashMap;

public class Concesionario {

    private HashMap<String, Vehiculo> coches;

    public Concesionario() {
        this.coches = new HashMap<>();
    }

    public void vaciar() {
        this.coches.clear();
    }

    public void Insertar(Vehiculo vehiculo) {
        this.coches.put(vehiculo.getMatricula(), vehiculo);
    }

    public boolean eliminar(String matricula) {
        if (this.coches.containsKey(matricula)) {
            this.coches.remove(matricula);
            return true;
        } else {
            return false;
        }
    }

    public boolean marcarKM0(String matricula) {
        if (this.coches.containsKey(matricula) && (!this.coches.get(matricula).isKm0())) {
            this.coches.get(matricula).setKm0(true);
            return true;
        } else {
            return false;
        }
    }

    public boolean desmarcarKM0(String matricula) {
        if (this.coches.containsKey(matricula) && (this.coches.get(matricula).isKm0())) {
            this.coches.get(matricula).setKm0(false);
            return true;
        } else {
            return false;
        }
    }

    public String mostrarKm0() {
        String str = "";
        for (Vehiculo coche : this.coches.values()) {
            if (coche.isKm0()) {
                str += coche.toString() + System.lineSeparator();
            }
        }
        return str;
    }

    @Override
    public String toString() {
        String str = "";
        if (this.coches.isEmpty()) {
            str = "No hay coches en el concesionario";
        } else {
            for (Vehiculo coche : this.coches.values()) {
                str += coche.toString() + System.lineSeparator();
            }
        }
        return str;
    }

    public HashMap<String, Vehiculo> getCoches() {
        return coches;
    }

}
