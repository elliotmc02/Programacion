package E101;


public abstract class Instrumento {

    String marca;
    int mes;
    int anio;
    Partitura P;
    boolean roto;
    boolean tocando;
    
    public Instrumento(String marca, int mes, int anio, Partitura P) {
        this.marca = marca;
        this.mes = mes;
        this.anio = anio;
        this.P = P;
        this.tocando = false;
    }
    public Instrumento(String marca, int mes, int anio) {
        this.marca = marca;
        this.mes = mes;
        this.anio = anio;
        this.tocando = false;
        this.P = new Partitura("Desconocido","Desconocido");
        String ValoresPosibles[] = {"do","re","mi","fa","sol","la","si"};
        Nota notasNuevas;
        int random = (int)((Math.random() * (100 - 10 + 1)) + 10);
        for (int i = 0; i < random; i++) {
            notasNuevas = new Nota(ValoresPosibles[(int)(Math.random() * ValoresPosibles.length)], (int)((Math.random() * (5)) + 1));
            this.P.addNota(notasNuevas);
        }
    }
    
    public boolean aniadirNota() {
        String ValoresPosibles[] = {"do","re","mi","fa","sol","la","si"};
        Nota notasNuevas = new Nota(ValoresPosibles[(int)(Math.random() * ValoresPosibles.length)], (int)((Math.random() * (5)) + 1));
        return this.P.addNota(notasNuevas);
    }
    
    public String tocarPartitura() {
        if (!roto) {
            this.tocando = true;
            return this.P.toString(); 
        }
        return "El Instrumento está roto";
    }
    
    public void PararDeTocar() {
        this.tocando = false;
    }
    
    
}
