package T2P2;

// Elliot Moyano Cutler

public class Zanpakuto {

    private String nombre;
    private double ataque;
    private double anchura;
    private double resistencia;
    private double altura;
    private boolean estado; // true = shikai false = bankai

    // guardan los valores originales
    private final double ataqueOriginal;
    private final double resistenciaOriginal;

    public Zanpakuto(String nombre, double anchura, double altura) {
        this.nombre = nombre;
        this.anchura = anchura;
        this.altura = altura;
        this.ataque = ((Math.random() * (25 - 2 + 1)) + 2);
        this.resistencia = ((Math.random() * (150 - 70 + 1)) + 70);
        this.estado = false;
        this.ataqueOriginal = this.ataque;
        this.resistenciaOriginal = this.resistencia;
    }

    public void bankai(double atk, double res) {
        this.ataque *= atk;
        this.resistencia *= res;
        this.estado = false; // bankai
    }

    public void shikai() {
        this.ataque = this.ataqueOriginal;
        this.resistencia = this.resistenciaOriginal;
        this.estado = true; // shikai
    }

    public double getAtaque() {
        return this.ataque;
    }

    public double getResistencia() {
        return this.resistencia;
    }

    @Override
    public String toString() {
        String res = this.nombre + "[atq: " + this.ataque + ", res: "
                + this.resistencia + "]";
        if (estado) {
            res += "Shikai";
        } else {
            res += "Bankai";
        }
        return res;
    }

}
