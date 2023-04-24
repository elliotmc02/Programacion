

package E94;


public class Minions extends Personajes {

    String tipo;
    
    public Minions(String nombre, int x, int y, double vida, double escudo, double ataque, String type) {
        super(nombre, x, y, vida, escudo, ataque);
        this.nombre = "minion";
        this.coords[0] = (int)((Math.random() * (1520 - 400 + 1)) + 400);
        this.coords[1] = (int)((Math.random() * (1520 - 400 + 1)) + 400);
        this.tipo = type;
        switch(type) {
            case "mago":
                this.tipo = type;
                this.vida = 50;
                this.escudo = 10;
                this.ataque = 10;
                break;
            case "cañon":
                this.tipo = type;
                this.vida = 12;
                this.escudo = 40;
                this.ataque = 30;
                break;
            default:
                this.tipo = "meele";
                this.vida = 75;
                this.escudo = 5;
                this.ataque = 25;
                break;
        }
    }
    
}
