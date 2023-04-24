package Excepciones.E110;


public class testPiscina {

    public static void main(String[] args) {

        Piscina p = new Piscina((int)(Math.random() * 100) + 1);
        System.out.println("Piscina creada con " + p.MAXNIVEL + " de agua");
        System.out.println("Poner agua");
        for (int i = 0; i < 5; i++) {
            try {
                p.ponerAgua((int)(Math.random() * 25) + 1);
                System.out.println(p.getNivel());
            }
            catch (ErrorPiscina e) {
                System.out.println(e.getMessage());
            }
        }
        
        System.out.println("Quitar agua");
        for (int i = 0; i < 5; i++) {
            try {
                p.quitarAgua((int)(Math.random() * 25) + 1);
                System.out.println(p.getNivel());
            }
            catch (ErrorPiscina e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
