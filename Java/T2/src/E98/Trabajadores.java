

package E98;


public class Trabajadores extends Cliente{

    String puesto;
    
    public Trabajadores(String nombre, String clave, String puesto) {
        super(nombre, clave);
        this.puesto = puesto;
    }
    
    @Override
    public int calcularDescuento(int cantidad) {
        int descuentoCliente = 8;
        int descuento = (int)((cantidad % 75) * descuentoCliente) / 100 * cantidad;
        return cantidad - descuento;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nPuesto: " + this.puesto;
    }
}
