package Interfaces.E147;

import java.util.ArrayList;

public class Usuario {

    String nombre;
    String password;
    ArrayList<Integer> stats;

    public Usuario(String nombre, String password, ArrayList stats) {
        this.nombre = nombre;
        this.password = password;
        this.stats = stats;
    }
}
