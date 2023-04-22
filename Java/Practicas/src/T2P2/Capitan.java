package T2P2;

// Elliot Moyano Cutler

public class Capitan extends Puro {

    public Capitan(int escuadron, String nombre, String origen, int edad, Zanpakuto espada) {
        super(escuadron, nombre, origen, edad, espada);
    }

    @Override
    public String toString() {
        return this.nombre + "[vida: " + this.vida + ", poder: " + this.poder
                + "] Capitan del " + this.escuadron + " escuadron" + "\n"
                + this.getEspada().toString();
    }

    @Override
    public void pelear(Shinigami defensor) {
        if (defensor instanceof Capitan) {
            //defensor = ((Sustituto) defensor);
            double ataqueTotal = this.getEspada().getAtaque() - defensor.getEspada().getResistencia();
            if (ataqueTotal < 0) {
                ataqueTotal *= -1;
            }
            defensor.vida -= ataqueTotal;
        } else if (defensor instanceof Teniente) {
            double ataqueTotal = (this.getEspada().getAtaque() + this.poder) - defensor.getEspada().getResistencia();
            if (ataqueTotal < 0) {
                ataqueTotal *= -1;
            }
            defensor.vida -= ataqueTotal;
        } else if (defensor instanceof Sustituto) {
            double ataqueTotal = this.getEspada().getAtaque() - (this.getEspada().getResistencia() + defensor.poder);
            if (ataqueTotal < 0) {
                ataqueTotal *= -1;
            }
            defensor.vida -= ataqueTotal;
        }
    }

    @Override
    public void invocarBankai() {
        this.getEspada().bankai(this.escuadron * 1.5, 1.5);
        System.out.println(this.nombre + " ha invocado su bankai");
    }
}