

package E94;


public class Campeones extends Personajes {

    double magia;
    int nivel;
    String rol;
    Habilidad habilidades[];
    
    public Campeones(String nombre, int x, int y, double vida, double escudo, double ataque, String rol, Habilidad habilidad)  {
        super(nombre, x, y, vida, escudo, ataque);
        this.nivel = 1;
        this.habilidades = new Habilidad[4];
        this.habilidades[0] = habilidad;
        this.rol = rol;
        this.coords[0] = (int)((Math.random() * (1920 - 1000 + 1)) + 1000);
        this.coords[1] = (int)((Math.random() * (1920 - 1000 + 1)) + 1000);
        switch(rol) {
            case "tanque":
                this.rol = rol;
                this.magia = 100;
                break;
            case "support":
                this.rol = rol;
                this.magia = 300;
                break;
            case "mago":
                this.rol = rol;
                this.magia = 500;
                break;
            case "jungla":
                this.rol = rol;
                this.magia = 200;
                break;
            default:
                this.rol = "carry";
                this.magia = 300;
                break;
        }
    }
    
    public void subirNivel(Habilidad nueva) {
        int contador = 0;
        boolean hMetida = false;
        this.nivel++;
        double random = Math.random() * 9 +1;
        this.vida += random;
        this.escudo = random / 10 + this.escudo;
        this.ataque = random / 10 + this.ataque;
        if (this.nivel == 4 || this.nivel == 6 || this.nivel == 8) {
            while(contador < this.habilidades.length || !hMetida) {
                if (this.habilidades[contador] == null) {
                    this.habilidades[contador] = nueva;
                    hMetida = true;
                }
                contador++;
            }
        }
    }
    
    @Override
    public String toString() {
        String res = super.toString() + "\nRol: " + this.rol;
        res += "\nHabilidades: ";
        for (int i = 0; i < this.habilidades.length; i++) {
            res += "\n" + this.habilidades[i].toString();
        }
        return res;
    }
    
}
