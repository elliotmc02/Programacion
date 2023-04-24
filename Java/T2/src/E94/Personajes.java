package E94;

public class Personajes {

    protected String nombre;
    protected int coords[];
    protected double vida;
    protected double escudo;
    protected double ataque;

    public Personajes(String nombre, int x, int y, double vida, double escudo, double ataque) {
        this.nombre = nombre;
        this.coords = new int[2];
        this.coords[0] = x;
        this.coords[1] = y;
        this.vida = vida;
        this.escudo = escudo;
        this.ataque = ataque;
    }

    public void desplazarse(int x, int y) {
        if (x < 0) {
            x = 0;
        }
        if (y < 0) {
            y = 0;
        }
        this.coords[0] += x;
        this.coords[1] += y;
    }
    @Override
    public String toString() {
        return "Nombre del personaje: " + this.nombre + "\nVida: " + this.vida + "\nEscudo: " + this.escudo +
                "\nAtaque: " + this.ataque + "\nPosicion: " + this.coords[0] + ", " + this.coords[1];
    }

}
