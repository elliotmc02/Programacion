package E98;

public class Bonificados extends Cliente{

    String fechaCaducidad;
    
    public Bonificados(String nombre, String clave, String fecha) {
        super(nombre, clave);
        this.fechaCaducidad = fecha;
    }
    
    @Override
    public int calcularDescuento(int cantidad) {
        int descuentoCliente = 5;
        int descuento = (int) ((cantidad % 75) * descuentoCliente) / 100 * cantidad;
        return cantidad - descuento;
    }
    @Override
    public String toString() {
        return super.toString() + "\nFecha caducidad: " + this.fechaCaducidad;
    }
}
