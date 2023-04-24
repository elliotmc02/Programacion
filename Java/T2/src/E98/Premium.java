

package E98;


public class Premium extends Cliente {
    
    int tarjeta;
    
    public Premium (String nombre, String clave, int tarjeta) {
        super(nombre, clave);
        this.tarjeta = tarjeta;
    }
    @Override
    public int calcularDescuento(int cantidad) {
        int descuentoCliente = 15;
        int descuento = (int)((cantidad % 75) * descuentoCliente) / 100 * cantidad;
        return cantidad - descuento;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTarjeta: " + this.tarjeta;
    }
}
