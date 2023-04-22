package E81;


public class Juego {

    public static void main(String[] args) {

        Arma dildo = new Arma("Sable negro", 5, 15); //Nombre, resistencia, poder
        Arma cerveza = new Arma("Fresquita", 5, 20);
        
        Guerrero amouranth = new Guerrero("Amouranth", 70, 25, 25, dildo); // Nombre, salud maxima, ataque, escudo, arma
        Guerrero illojuan = new Guerrero("IlloJuan", 100, 35, 50, cerveza);
        
        
        for (int i = 0; i < 10; i++) {
            amouranth.atacar(illojuan);
        }
        illojuan.cambiarArma(dildo);
        
        System.out.println(illojuan);
        System.out.println(amouranth);
    }

}
