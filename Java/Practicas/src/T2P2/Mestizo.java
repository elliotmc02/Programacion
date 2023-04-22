package T2P2;

// Elliot Moyano Cutler

public abstract class Mestizo extends Shinigami {

    double hollow;
    double quincy;

    public Mestizo(String nombre, String origen, int edad, Zanpakuto espada) {
        super(nombre, origen, edad, espada);
        this.hollow = ((Math.random() * (50 - 10 + 1)) + 10);
        this.quincy = 50 - this.hollow;
    }

}
