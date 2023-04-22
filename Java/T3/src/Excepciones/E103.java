package Excepciones;


public class E103 {

    public static void main(String[] args) {
        

        try {
            System.out.println("Programa automatico");
            throw new RuntimeException("soy una excepcion");
        }
        catch (RuntimeException e) {
            System.out.println("Programa terminado");
        }
        
        
    }

}
