

package E88;


public class Operario extends Empleado{

    private int codigo;
    
    public Operario(String nombre, int codigo) {
        super(nombre);
        this.codigo = codigo;
    }
    
    public int getCodigo() {
        return this.codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    @Override
    public String toString() {
        return "Soy el operario " + this.getNombre() + " con el código " + this.codigo;
    }
    
}
