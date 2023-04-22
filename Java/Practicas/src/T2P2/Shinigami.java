package T2P2;

// Elliot Moyano Cutler

public abstract class Shinigami {

    protected String nombre;
    protected double vida;
    protected String origen;
    protected double poder;
    protected int edad;
    private Zanpakuto espada;

    public Shinigami(String nombre, String origen, int edad, Zanpakuto espada) {
        this.nombre = nombre;
        this.origen = origen;
        this.edad = edad;
        this.espada = espada;
        this.vida = 1500;
        this.poder = ((Math.random() * (50 - 5 + 1)) + 5);
    }

    public abstract void invocarBankai();

    public abstract void pelear(Shinigami defensor);

    public Zanpakuto getEspada() {
        return espada;
    }

    @Override
    public String toString() {
        return this.nombre + "[vida: " + this.vida + ", poder: " + this.poder
                + "]" + "\n" + this.espada.toString();
    }

}
