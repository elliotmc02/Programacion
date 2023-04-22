package E83;

public class Bala {

    private int calibre;
    private int longitud;

    public Bala(int cal, int lon) {
        
        this.calibre = cal;
        this.longitud = lon;
        
    }
    
    public Bala() {
        this.calibre = 9;
        this.longitud = 40;
    }
    
    public String toString() {
        return "Bala de calibre " + this.calibre + "mm y longitud " + 
                this.longitud + "mm";
    }

}
