package Excepciones.E111;

import java.util.InputMismatchException;
public class testGato {

    public static void main(String[] args) {

        try {
            Gato g1 = new Gato("Manolo", 14);
            Gato g2 = new Gato("Te", -7);
            g1.setNombre("Ma");
            g1.setEdad(-4);
        }
        catch (InputMismatchException e) {
            System.out.println("Valor incorrecto");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
