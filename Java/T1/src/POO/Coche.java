/*
h) Crea el método chequear() el cual devolverá un valor booleano. Verdadero si el
coche tiene gasolina y falso en caso contrario. Además, el coche sólo podrá
arrancar si este método devuelve true.
i) Crea la el método pintar() el cual “pintará” el coche con el color que se le pase
como parámetro.
j) Implementa el método toString() para la clase coche.
*/

package POO;


public class Coche {

    String color;
    double anchura;
    double altura;
    int puertas;
    int ruedas;
    boolean encendido;
    int gasolina;
    boolean tieneGas;
    
    public Coche(String color, double anchura, double altura, int puertas) {
        
        this.color = color;
        this.anchura = anchura;
        this.altura = altura;
        this.puertas = puertas;
        this.ruedas = 4;
        this.encendido = false;
        this.gasolina = 50;
        
    }
    
    public void arrancar(int consume){
        if (!encendido && this.gasolina >= 20 && tieneGas) {
            System.out.println("Coche arrancado");
            this.encendido = true;
            this.gasolina -= consume;
        }
        else {
            System.out.println("Ya está arrancado");
        }
    }
    public void parar(){
        if (encendido) {
            System.out.println("Coche apagado");
            this.encendido = false;
        }
        else {
            System.out.println("Ya está apagado");
        }
    }
    public void desplazarse(int consume){
        if (encendido && this.gasolina >= 5) {
            System.out.println("Desplazandose");
            this.gasolina -= consume;
        }
        else {
            System.out.println("No se puede desplazar");
        }
    }
    public void repostar(int litros){
        this.encendido = false;
        if (!encendido) {
            this.gasolina += litros;
            System.out.println("Llenando deposito, ahora hay " + this.gasolina);
            if (this.gasolina > 50) {
                this.gasolina = 50;
            }
        }
        else {
            System.out.println("Apague el coche");
        }
    }
    public void chequear() {
        
        tieneGas = this.gasolina > 0;
    } 
    public void pintar(String colorNuevo) {
        this.color = colorNuevo;
        System.out.println("Color nuevo: " + this.color);
    }
    @Override
    public String toString() {
        String res = "";
        res += "Es de color " + this.color + ", es " + this.anchura + " de ancho y " + this.altura + " de alto, tiene " + this.puertas
                + " y " + this.ruedas + " ruedas, tiene actualmente " + this.gasolina + " litros de gasolina";
        return res;
    }

    
    
    
}
