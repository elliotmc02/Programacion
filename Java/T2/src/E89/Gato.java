

package E89;


public class Gato extends Mamifero{

    String pelaje;
    
    public Gato(String nombre, String raza, int nPatas, int mediaVida, String pelaje) {
        super(nombre, raza, nPatas, mediaVida);
        this.pelaje = pelaje;
    }
    
    public String getPelaje() {
        return this.pelaje;
    }
    
    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }
    
    public void cazar() {
        System.out.println("Mi gato de " + this.nPatas + " patas está cazando");
    }
    
    @Override
    public String comunicarse() {
        return "miau";
    }
    @Override
    public void dormir() {
        System.out.println("15 horas dormidas");
    }
    
    
    @Override
    public String toString() {
        return super.toString() + "\nPelaje: " + this.pelaje;
    }
    
}
