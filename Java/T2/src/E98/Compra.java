

package E98;


public class Compra {

    String fechaCompra;
    int precioTotal;
    boolean descuento;
    Articulo articulos[];
    
    public Compra(String fecha, Articulo articulos) {
        this.fechaCompra = fecha;
        for (int i = 0; i < 10; i++) {
            this.precioTotal += this.articulos[i].getPrecio();
        }
        this.articulos = new Articulo[5];
        
    }
    
    public String imprimirTicket() {
        String lista = "";
        
        for (int i = 0; i < this.articulos.length; i++) {
            lista += this.articulos[i].toString();
            
        }
        
        return lista;
    }
    
}
