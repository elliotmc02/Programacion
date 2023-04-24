/*
71.- Crea una clase Aritmética, la cual tendrá dos valores numéricos decimales como
propiedades de clase y los métodos necesarios para calcular (que no mostrar), la suma,
resta, multiplicación, división y potencia de esos valores. 
 */
package E71;

public class Aritmetica {

    double num1;
    double num2;

    public Aritmetica(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    double suma, resta, multi, division, potencia;

    public void cSuma() {
        this.suma = this.num1 + this.num2;
    }

    public void cResta() {
        this.resta = this.num1 - this.num2;
    }

    public void cMulti() {
        this.multi = this.num1 * this.num2;
    }

    public void cDivision() {
        this.division = this.num1 / this.num2;
    }

    public void cPotencia() {
        this.potencia = Math.pow(this.num1, this.num2);
    }

    public String toString() {
        String res = "Cálculos";
        
        res += "\nSuma: " + this.suma + "\nResta: " + this.resta 
                + "\nMultiplicación: " + this.multi + "\nDivisión: " 
                + this.division + "\nPotencia: " + this.potencia;
        
        return res;
    }

}
