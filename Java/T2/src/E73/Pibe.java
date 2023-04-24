package E73;


public class Pibe {

    String nombre;
    int vidas;
    double ptEsfuerzo;
    int ptHambre;
    boolean vivo;
    final double MAX_ESFUERZO = 10;
    final int MAX_HAMBRE = 3;
    final int MAX_VIDAS = 7;

    public Pibe(String nombre) {
        this.nombre = nombre;
        this.ptEsfuerzo = MAX_ESFUERZO;
        this.ptHambre = MAX_HAMBRE;
        this.vidas = MAX_VIDAS;
        this.vivo = true;
    }

    public void jugar() {
        System.out.println(this.nombre + " esta jugando...solo...");
        this.ptEsfuerzo -= 3;
        this.ptHambre -= 1;

        this.comprobarExistencia();
    }

    public void comunicarse() {
        System.out.println(this.nombre + " esta hablando");
        this.ptEsfuerzo -= 1;

        this.comprobarExistencia();
    }

    public void comer() {
        System.out.println(this.nombre + " esta comiendo");
        this.ptEsfuerzo -= 2;
        this.ptHambre += 2;

        if (this.ptHambre > MAX_HAMBRE) {
            this.ptHambre = MAX_HAMBRE;
        }

        this.comprobarExistencia();
    }

    public void dormir() {
        System.out.println(this.nombre + " esta dormio");
        this.ptEsfuerzo += 5;

        if (this.ptEsfuerzo > MAX_ESFUERZO) {
            this.ptEsfuerzo = MAX_ESFUERZO;
        }
    }

    private void comprobarExistencia() {
        if (this.ptEsfuerzo <= 0 || this.ptHambre <= 0) {
            this.vidas -= 1;
            if (this.vidas <= 0) {
                System.out.println(this.nombre + " la ha palmao");
                this.vivo = false;
                this.ptEsfuerzo = -1;
                this.ptHambre = -1;
                this.vidas = -1;
            } else {
                System.out.println(this.nombre + " ha perdido una vida");
                this.ptEsfuerzo = MAX_ESFUERZO;
                this.ptHambre = MAX_HAMBRE;
            }
        }
    }
    @Override
    public String toString() {
        String res;

        res = this.nombre + "\n";
        res += "Esfuerzo: " + this.ptEsfuerzo + " Hambre: " + this.ptHambre +
                " Vidas: " + this.vidas;
        res += "\n";
        if (this.vivo) {
            res += "its alive";
        }
        else {
            res += "its dead";
        }
        
        return res;
    }
}
