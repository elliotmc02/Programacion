

package E90;


public class Pelicula extends Multimedia {

    private final String actor;
    private final String actriz;
    
    public Pelicula(String titulo, String formato, int duracion, String actor, String actriz) {
        super(titulo, formato, duracion);
        this.actor = actor;
        this.actriz = actriz;
    }
    
    public String getActor() {
        return this.actor;
    }
    
    public String getActriz() {
        return this.actriz;
    }
    
    public boolean equals(Pelicula archivo) {
        return super.equals(archivo) && this.actor.equals(archivo.actor) && this.actriz.equals(archivo.actriz);
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nActor: " + this.actor + "\nActriz: " + this.actriz;
    }
    
}
