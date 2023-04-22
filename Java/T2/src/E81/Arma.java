

package E81;


public class Arma {

    private String nombre;
    private int resistencia;
    private int poder;
    private int nivel;
    
    public Arma(String nombre, int resistencia, int poder) {
        this.nombre = nombre;
        this.resistencia = resistencia;
        this.poder = poder;
        this.nivel = 1;
    }
    
    public String toString() {
        String res = "\nDatos del arma: ";
        
        res += "\nNombre: " + this.nombre + "\nResistencia: " + this.resistencia
                + "\nPoder: " + this.poder;
        
        return res;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    public int getResistencia() {
        return this.resistencia;
    }
    public void setResistencia(int res) {
        this.resistencia = res;
    }
    public int getPoder() {
        return this.poder;
    }
    public int getNivel() {
        return this.nivel;
    }
    public void setNivel(int niv) {
        this.nivel = niv;
    }
    public void subirNivel() {
        this.nivel++;
        this.resistencia += 2;
        this.poder++;
    }
    
}
