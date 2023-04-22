package E83;

public class Revolver {

    private final String marca;
    private final String modelo;
    private boolean martillo;
    private Bala tambor[];

    public Revolver(String marca, String modelo, int tambor) {
        this.marca = marca;
        this.modelo = modelo;
        this.tambor = new Bala[tambor];
        this.martillo = false;
        // A) Mismo calibre y longitud
        for (int i = 0; i < tambor; i++) {
            this.tambor[i] = new Bala();
        }

    }

    public String disparar(int disparos) {
        int vecesDisparadas = 0;
        for (int i = 0; i < this.tambor.length; i++) {
            if (this.tambor[i] != null && vecesDisparadas <= disparos) {
                this.tambor[i] = null;
                this.martillo = true;
                vecesDisparadas++;
                return this.tambor[i].toString();

            } 
            else {
                return "No hay bala en este hueco";
            }
        }
        this.martillo = false;
        return "";
    }
    
    @Override
    public String toString() {
        String res = "Datos del arma";
        res += "\nMarca: " + this.marca + "\nModelo: " +
                this.modelo + "\nTamaño del tambor: " + this.tambor.length +"\n";
        
        for (int i = 0; i < tambor.length; i++) {
            if (tambor[i] != null) {
                res += tambor[i].toString();
            }
            else {
                res += "No hay bala";
            }
            res += "\n";
        }
        return res;
    }

}
