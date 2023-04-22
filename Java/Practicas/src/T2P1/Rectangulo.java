package T2P1;

//Elliot Moyano Cutler

public class Rectangulo {

    private final double base;
    private final double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double area() {
        return this.base * this.altura;
    }

    public double perimetro() {
        return (2 * (this.base + this.altura));
    }

    @Override
    public String toString() {
        return "Rectangulo con base " + this.base + " y altura " + this.altura + "\nArea: " + this.area() 
                + "\nPerimetro: " + this.perimetro();
    }

}
