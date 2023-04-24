package E89;


public class testMamifero {

    public static void main(String[] args) {
        Mamifero elefante = new Mamifero("Paqui", "Aria", 25, 3059);
        Perro pitbull = new Perro("Manolo", "rata", 432, 12, true);
        Gato peludo = new Gato("el pollas", "moral", 1, 43, "corto");
        
        elefante.comunicarse();
        elefante.dormir();
        System.out.println(elefante);
        
        pitbull.setMezcla(false);
        System.out.println(pitbull.comunicarse());
        pitbull.dormir();
        pitbull.jugar();
        System.out.println(pitbull);
        
        System.out.println(peludo.getPelaje());
        peludo.setPelaje("largo");
        System.out.println(peludo.comunicarse());
        peludo.dormir();
        peludo.cazar();
        System.out.println(peludo);
    }

}
