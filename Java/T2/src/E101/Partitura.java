package E101;

public class Partitura {

    String nombre;
    String autor;
    private Nota notas[];

    public Partitura(String nombre, String autor) {
        this.nombre = nombre;
        this.autor = autor;
        this.notas = new Nota[100];
    }

    public int numNotas() {
        int contador = 0;
        for (int i = 0; i < this.notas.length; i++) {
            if (this.notas[i] != null) {
                contador++;
            }
        }
        return contador;
    }

    public boolean addNota(Nota nueva) {
        /*        int contador = 0;
        while (contador < this.notas.length) {
        if (this.notas[contador] == null) {
        this.notas[contador] = nueva;
        return true;
        }
        contador++;
        }
        return false;*/
        for (int i = 0; i < this.notas.length; i++) {
            if (this.notas[i] == null) {
                this.notas[i] = nueva;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String res = this.autor + ", " + this.nombre;
        for (int i = 0; i < this.notas.length; i++) {
            //if (this.notas[i] != null) {
                res += this.notas[i].toString();
                if (i % 10 == 0) {
                    res += "\n";
                }
            //}
        }
        return res;
    }

}
