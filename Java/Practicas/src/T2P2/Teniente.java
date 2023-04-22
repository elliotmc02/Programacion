package T2P2;

// Elliot Moyano Cutler

public class Teniente extends Puro {

    public Teniente(int escuadron, String nombre, String origen, int edad, Zanpakuto espada) {
        super(escuadron, nombre, origen, edad, espada);
    }

    @Override
    public String toString() {
        return this.nombre + "[vida: " + this.vida + ", poder: " + this.poder
                + "] Teniente del " + this.escuadron + " escuadron" + "\n"
                + this.getEspada().toString();
    }

    @Override
    public void invocarBankai() {
        System.out.println(this.nombre + " aun no puede invocar su bankai");
    }

    @Override
    public void pelear(Shinigami defensor) {
        if (defensor instanceof Teniente) { // si es teniente
            //defensor = ((Sustituto) defensor);
            double ataqueTotal = this.getEspada().getAtaque() - defensor.getEspada().getResistencia();
            if (ataqueTotal < 0) {
                ataqueTotal *= -1;
            }
            defensor.vida -= ataqueTotal;
        } else if (defensor instanceof Capitan || defensor instanceof Sustituto) { // si es capitan
            double ataqueTotal = this.getEspada().getAtaque() - (this.getEspada().getResistencia() + defensor.poder);
            if (ataqueTotal < 0) {
                ataqueTotal *= -1;
            }
            defensor.vida -= ataqueTotal;
        }
    }
}
