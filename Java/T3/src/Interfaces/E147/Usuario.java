package Interfaces.E147;

import java.util.ArrayList;

public class Usuario {

    private String password;
    private ArrayList<Integer> stats;

    public Usuario(String password, ArrayList<Integer> stats) {
        this.password = password;
        this.stats = stats;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Integer> getStats() {
        return stats;
    }

    public void setStats(ArrayList<Integer> stats) {
        this.stats = stats;
    }

}
