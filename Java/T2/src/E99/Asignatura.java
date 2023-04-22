package E99;


public abstract class Asignatura {
    
    String nombre;
    int horas;
    
    public Asignatura(String nombre, int horas) {
        this.nombre = nombre;
        this.horas = horas;
    }
    @Override
    public String toString() {
        return this.nombre + " - " + this.horas;
    }
    
}
