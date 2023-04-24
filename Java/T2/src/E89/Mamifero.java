

package E89;


public abstract class Mamifero {

    String nombre;
    String raza;
    int nPatas;
    int mediaVida;
    
    public Mamifero(String nombre, String raza, int nPatas, int mediaVida) {
        this.nombre = nombre;
        this.raza = raza;
        this.nPatas = nPatas;
        this.mediaVida = mediaVida;
    }
    
    public abstract String comunicarse();
    
    public void dormir() {
        System.out.println("8 horas dormidas");
    }
    
    @Override
    public String toString() {
        return "Nombre: " + this.nombre + "\nRaza: " + this.raza + "\nPatas: " + this.nPatas + "\nMedia de vida: " 
                + this.mediaVida;
    }
    
}
