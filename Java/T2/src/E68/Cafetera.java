package E68;

/*
•cantidadCafe: muestra cuanto café queda en la cafetera: Queda xxxxxxx cc de
café en la cafetera.
*/

public class Cafetera {

    int capacidadMaxima;
    int capacidadActual;
    
    public Cafetera() {
        this.capacidadMaxima = 1000; // llena
        this.capacidadActual = 0; // vacia
    }
    
    public void echarCafe(int cantidad) {
        this.capacidadActual += cantidad;
        if (this.capacidadActual > 1000) {
            this.capacidadActual = 1000;
        }
        System.out.println("Se han llenado " + cantidad + " ml, ahora hay " + this.capacidadActual + " ml");
    }
    
    public void llenarCafetera() {
        this.capacidadActual = this.capacidadMaxima;
        System.out.println("Se ha llenado la cafetera");
    }
    
    public void vaciarCafetera() {
        this.capacidadActual = 0;
        System.out.println("Se ha vaciado la cafetera");
    }
    
    public void servirTaza(int capacidad) {
        if (this.capacidadActual >= capacidad) {
            this.capacidadActual -= capacidad;
            System.out.println("Se ha llenado la taza, ahora hay " + this.capacidadActual + " ml en la cafetera");
        }
        else {
            System.out.println("No se puede llenar la taza, no hay suficiente café en la cafetera");
        }
    }
    
    public void cantidadCafe() {
        System.out.println("Queda " + this.capacidadActual + " ml de cafe en la cafetera");
    }
    
}
