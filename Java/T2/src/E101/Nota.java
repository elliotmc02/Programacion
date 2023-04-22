package E101;


public class Nota {

    String nota;
    int duracion;
    

    public Nota(String nota, int duracion) {
        this.nota = nota;
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "[" + this.nota + ", " + this.duracion + "]";
    }
    
    
    
}
