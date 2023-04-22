package T1P3;


public class Tablet {

    String marca;
    String modelo;
    int ram;
    double pixeles;
    double peso;
    double tamaño;
    double version;
    boolean encendido;

    public Tablet(String marca, String modelo, int ram, double pixeles, double peso) {

        this.marca = marca;
        this.modelo = modelo;
        this.ram = ram;
        this.pixeles = pixeles;
        this.peso = peso;
        this.tamaño = 10.1;
        this.version = 11.0;
        this.encendido = false;

    }

    public void encenderse() {
        if (!encendido) {
            encendido = true;
            System.out.println("Marca: " + this.marca);
            System.out.println("Modelo: " + this.modelo);
            System.out.println("Versión de Android: " + this.version);
        } 
        else {
            System.out.println("Ya está encendida");
        }
    }

    public void apagarse() {
        if (encendido) {
            encendido = false;
            System.out.println("\nTablet apagada.");
        } else {
            System.out.println("\nYa está apagada");
        }
    }

    public String toString() {
        String res = "\n";
        res += "Características de la Tablet:\n";
        res += this.marca + " - " + this.modelo;
        res += "\nVersion de Android: " + this.version;
        res += "\nTamaño: " + this.tamaño + " pulgadas";
        res += "\nPesa " + this.peso + " gramos.";
        res += "\nCámara con " + this.pixeles + " megapixeles";
        
        if (encendido) {
            res += "\nTablet encendida";
        } 
        else {
            res += "\nTablet apagada";
        }
        return res;
    }
}
