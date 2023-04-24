package Colecciones.E126;


public class Persona {

       private String DNI;
       private String nombre;
       private String apellido;
       private String sexo;
       private int edad;
       private double peso;

    public Persona(String DNI, String nombre, String apellido, String sexo, int edad, double peso) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
    }

    public Persona(String DNI) {
        this.nombre = "";
        this.apellido = "";
        this.edad = 0;
        this.peso = 0;
        this.DNI = DNI;
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
    
    public String toString() {
        return this.nombre + " " + this.apellido + "\nDNI: " + this.DNI + "\nEdad: " + this.edad + "\nPeso :" + this.peso;
    }
    
    
        


}
