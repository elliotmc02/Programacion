package Excepciones.E110;

public class Piscina {

    public final int MAXNIVEL;
    private int nivel;

    public Piscina(int tope) {
        if (tope < 0) tope = 0;
        this.MAXNIVEL = tope;
        this.nivel = 0;
    }

    public int getNivel() {
        return this.nivel;
    }

    public void quitarAgua(int cantidad) throws ErrorPiscina {
        if ((this.nivel - cantidad) < 0) {
            throw new ErrorPiscina("Por debajo de 0");
        }
        this.nivel -= cantidad;
    }

    public void ponerAgua(int cantidad) throws ErrorPiscina {
        if ((this.nivel + cantidad) > this.MAXNIVEL) {
            throw new ErrorPiscina("No puede quedar por encima del maximo");
        }
        this.nivel += cantidad;
    }
}
