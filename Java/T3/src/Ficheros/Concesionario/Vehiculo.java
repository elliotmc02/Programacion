package Ficheros.Concesionario;

import java.util.HashSet;

public class Vehiculo {

    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private HashSet<String> equipamiento;
    private boolean km0;

    public Vehiculo(String matricula, String marca, String modelo, String color, HashSet<String> equipamiento, boolean km0) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.equipamiento = equipamiento;
        this.km0 = km0;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public HashSet<String> getEquipamiento() {
        return equipamiento;
    }

    public boolean isKm0() {
        return km0;
    }

    public void setKm0(boolean km0) {
        this.km0 = km0;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", equipamiento=" + equipamiento + ", km0=" + km0 + '}';
    }
}
