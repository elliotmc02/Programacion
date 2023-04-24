

package E89;


public class Perro extends Mamifero {

    private boolean  mezcla;
    
    public Perro(String nombre, String raza, int nPatas, int mediaVida, boolean mezcla) {
        super(nombre, raza, nPatas, mediaVida);
        this.mezcla = mezcla;
    }
    
    @Override
    public String comunicarse() {
        return "guau";
    }
    @Override
    public void dormir() {
        System.out.println("18 horas dormidas");
    }
    
    public void jugar() {
        System.out.println(this.nombre + " está jugando");
    }
    
    public boolean getMezcla() {
        return this.mezcla;
    }
   
    public void setMezcla(boolean mezcla) {
        this.mezcla = mezcla;
    }
    
    @Override
    public String toString() {
        String res = super.toString();
        if (mezcla) {
            res += "\nEs de pura raza";
        }
        else {
            res += "\nNo es de pura raza";
        }
        return res;
    }
    
}
