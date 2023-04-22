package E82;

public class Cielo {

    Estrella cielo[][];

    public Cielo(int filas, int columnas) {
        this.cielo = new Estrella[filas][columnas];
    }

    public void ponerEstrellas(int nEstrellas) {
        int xAl;
        int yAl;
        int estrellasPuestas = 0;
        while (nEstrellas > estrellasPuestas) {
            xAl = (int) (Math.random() * cielo.length - 1);
            yAl = (int) (Math.random() * cielo[0].length - 1);
            if (this.cielo[xAl][yAl] == null) {
                this.cielo[xAl][yAl] = new Estrella(xAl, yAl);
                estrellasPuestas++;
            }

        }
    }

    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < this.cielo.length; i++) {
            for (int k = 0; k < this.cielo[i].length; k++) {
                if (this.cielo[i][k] == null) {
                    res += " ";
                }
                else {
                    res += this.cielo[i][k];
                }
            }
            res += "\n";
        }
        return res;
    }

}

/*
        for (int i = 0; i < this.cielo.length; i++) {
            for (int k = 0; k < this.cielo[i].length; k++) {
                this.cielo[i][k] = " ";
            }
        }
 */
