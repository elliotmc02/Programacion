package E94;


public class testMol {

    public static void main(String[] args) {

        Habilidad h1 = new Habilidad("test", 'q');
        Habilidad h2 = new Habilidad("polla", 'w');
        Habilidad h3 = new Habilidad("coño", 'e');
        Habilidad h4 = new Habilidad("gorda", 'r');
        Campeones c1 = new Campeones("paco", 100, 200, 100, 50, 35, "jungla", h1);
        
        c1.subirNivel(h2);
        c1.subirNivel(h3);
        c1.subirNivel(h4);
        System.out.println(c1);
    }

}
