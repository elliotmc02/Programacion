package T3P3;

import java.util.HashSet;

public class Paciente {

    private String nombre;
    private String apellido;
    private char sexo;
    private HashSet<String> alergias;

    public Paciente(String nombre, String apellido, char sexo, HashSet<String> alergias) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.alergias = alergias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public HashSet<String> getAlergias() {
        return alergias;
    }

    public void setAlergias(HashSet<String> alergias) {
        this.alergias = alergias;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + " Apellido: " + this.apellido + " Sexo: " + (sexo == 'M' ? "Masculino" : "Femenino") + " Alergias: " + this.alergias;
    }

}
