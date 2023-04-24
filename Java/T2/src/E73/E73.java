package E73;

public class E73 {

    public static void main(String[] args) {

        Pibe morales = new Pibe("Raul");
        
        System.out.println(morales);
        morales.jugar();
        morales.comunicarse();
        morales.comer();
        
        System.out.println(morales);
        
        System.out.println("me lo cargo");
        for (int i = 0; i <= 100; i++) {
            morales.jugar();
        }
        System.out.println(morales);

    }

}
