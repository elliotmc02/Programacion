

package E88;


public class Directivo extends Empleado {

    public Directivo(String nombre) {
        super(nombre);
    }
    
    @Override
    public String toString() {
        return "Soy " + this.getNombre() + " directivo de la empresa";
    }
    
}
