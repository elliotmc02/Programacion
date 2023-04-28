package E98;

public abstract class Cliente {

    String nombre;
    String clave;

    public Cliente(String nombre, String clave) {
        this.nombre = nombre;
        this.clave = clave;
        if (clave.length() > 5) {
            this.clave = clave.substring(0, 5); // elegante
            /*for (int i = 0; i < 5; i++) {
                this.clave += clave.charAt(i); poco elegante
            }*/
        }
    }
    
    public int calcularDescuento(int cantidad) {      
        return cantidad;
    }
    
    /*    public Articulo realizarCompra() {
    
    }*/
    
    /*    public String mostrarCompras() {
    
    }*/
    
    @Override
    public String toString() {
        return "Nombre: " + this.nombre + " y clave " + this.clave;
    }
    
    
}
