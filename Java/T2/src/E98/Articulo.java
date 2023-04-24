

package E98;


public class Articulo {

    private final String nombre;
    private int precio;
    
    public Articulo(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    @Override
    public String toString() {
        return this.nombre + ", " + this.precio;
    }
    
    public int getPrecio() {
        return this.precio;
    }
    
}
