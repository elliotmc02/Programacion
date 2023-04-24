package Excepciones.E111;

public class Gato {

    private String nombre;
    private int edad;

    public Gato(String nombre, int edad) throws Exception {
        if (nombre.length() < 3)
            throw new Exception("El nombre debe tener 3 "
                    + "caracteres como minimo");
        if (edad < 0)
            throw new Exception("La edad no puede ser negativa");
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) throws Exception {
        if (nombre.length() < 3)
            throw new Exception("El nombre debe tener 3 "
                    + "caracteres como minimo");
        this.nombre = nombre;
    }

    public void setEdad(int edad) throws Exception {
        if (edad < 0)
            throw new Exception("La edad no puede ser negativa");
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "El gatito" + this.nombre + " tiene " + this.edad + " años de edad.";
    }

}
