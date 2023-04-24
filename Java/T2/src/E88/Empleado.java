

package E88;


public class Empleado {

    private final String nombre;
    
    public Empleado(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    @Override
    public String toString() {
        return "Soy el empleado " + this.nombre;
    }
    
}
