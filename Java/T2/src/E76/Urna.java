package E76;

public class Urna {

    private int negras;
    private int blancas;

    public Urna(int negras, int blancas) {
        this.negras = negras;
        this.blancas = blancas;
    }

    public int mostrarBolas() {
        return this.negras + this.blancas;
    }

    public char extraerBola(int cantidad) {
        int suma = this.mostrarBolas();
        int num = (int) ((Math.random() * suma) + 1);
        
        for (int i = 0; i < cantidad; i++) {
            if (num <= this.negras) { 
                this.negras--;
                return 'n';
            } 
            else if (num <= this.blancas) { 
                this.blancas--;
                return 'b';
            }
        }
        return 0;
    }
    
    public void meterBola(char color) {
        if (color == 'n') {
            this.negras++;
        } 
        else {
            this.blancas++;
        }
    }
    

}
