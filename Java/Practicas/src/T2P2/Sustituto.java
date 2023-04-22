package T2P2;

// Elliot Moyano Cutler

public class Sustituto extends Mestizo {

    String zonaAsignada;

    public Sustituto(String zonaAsignada, String nombre, String origen, int edad, Zanpakuto espada) {
        super(nombre, origen, edad, espada);
        this.zonaAsignada = zonaAsignada;
    }

    @Override
    public void invocarBankai() {

        this.getEspada().bankai(this.hollow / 10, 2);
        System.out.println(this.nombre + " ha invocado su bankai");
    }

    @Override
    public void pelear(Shinigami defensor) {
        if (defensor instanceof Sustituto) {
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
        } else if (defensor instanceof Capitan) {
            double ataqueTotal = this.getEspada().getAtaque() - (this.getEspada().getResistencia() + defensor.poder);
            if (ataqueTotal < 0) {
                ataqueTotal *= -1;
            }
            defensor.vida -= ataqueTotal;
        }
    }

    public void vigilar() {
        System.out.println(this.nombre + " sustituto vigila " + this.zonaAsignada);
    }

    @Override
    public String toString() {
        return this.nombre + "[vida: " + this.vida + ",poder: " + this.poder
                + "] Shinigami Sustituto" + "\n" + this.getEspada().toString();
    }

}
