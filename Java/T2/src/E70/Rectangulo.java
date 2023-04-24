/*
70.- Crea la clase Rectángulo, la cual almacenará la base y la altura. Estos atributos
serán privados y no deben poder accederse desde el exterior. Además, la clase tendrá los
métodos necesarios para calcular el área (base * altura), el perímetro (2*(b+h)) del
rectángulo y un método para representar en texto la clase:
 */
package E70;

public class Rectangulo {

    private final double base;
    private final double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    double area;
    public void cArea() {
        area = this.base * this.altura;
    }
    double perimetro;
    public void cPerimetro() {
        perimetro = (2 * (this.base + this.altura));
    }

    public String toString() {
        String res = "";

        res += "Rectángulo con base " + this.base + " y altura " + this.altura;
        res += "\nÁrea: " + area + "\nPerímetro: " + perimetro;
        
        return res;

    }

}
