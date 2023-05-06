package Colecciones.E133;

public class Empleado {

    private String nombre;
    private String apellido;
    private char sexo;
    private int sueldo;
    private int anios;

    public Empleado(String nombre, String apellido, char sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.sueldo = 800;
        this.anios = (int)(Math.random() * 11);
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

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getAnios() {
        return anios;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellido=" + apellido + ", sexo=" + sexo + ", sueldo=" + sueldo + ", anios=" + anios + '}';
    }
    
    

}
