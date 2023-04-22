package T3P1;

public class NumeroE {

    int numero;

    public NumeroE(int num) throws NumeroError {
        if (num < 0) {
            throw new NumeroError();
        }
        this.numero = num;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int nuevo) throws NumeroError {
        if (nuevo < 0) {
            throw new NumeroError();
        }
        this.numero = nuevo;
    }

    public String toString() {
        return this.numero + "";
    }
}
