package T2P2;

// Elliot Moyano Cutler

public abstract class Puro extends Shinigami {

    int escuadron;

    public Puro(int escuadron, String nombre, String origen, int edad, Zanpakuto espada) {
        super(nombre, origen, edad, espada);

        this.escuadron = escuadron;
        if (this.escuadron < 1 || this.escuadron > 13) {
            this.escuadron = (int) ((Math.random() * (13)) + 1);
        }
    }

    public void Shunpo() {
        System.out.println(this.nombre + " se ha desplazado usando shunpo");
    }

}
