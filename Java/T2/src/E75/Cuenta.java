
package E75;


public class Cuenta {

    private String titular;
    private double cantidad;
    
    public Cuenta(String titular) {
        this.titular = titular;
    }
    
    public void ingresar(double ingresado) {
        if (ingresado > 0) {
            this.cantidad += ingresado;
        }
    }
    
    public void retirar(double retirado) {
        if (this.cantidad >= retirado) {
            this.cantidad -= retirado;
        }
        else {
            System.out.println("Error, no hay suficiente dinero");
        }
    }
    
    public String toString() {
        String res = "Datos de la cuenta";
        
        res += "\nEsta cuenta pertenece a " + this.titular + " y posee actualmente una cantidad de " + this.cantidad + "€";
        
        return res;
    }
    
    public void setTitular(String nuevo) {
        this.titular = nuevo;
    }
    
    public void setCantidad(double nuevo) {
        this.cantidad = nuevo;
    }
    
    public String getTitular() {
        return this.titular;
    }
    
    public double getCantidad() {
        return this.cantidad;
    }
    
}
