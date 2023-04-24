package Excepciones.E109;

public class testImpar {

    public static void main(String[] args) {

        try {
            System.out.println(new Impar(24));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
