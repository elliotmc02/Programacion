package E83;


public class E83 {

    public static void main(String[] args) {

        Revolver winchester = new Revolver("Winchester", "modelo 1883", 1);
        
        System.out.println(winchester);
        
            winchester.disparar(6);

        
        System.out.println(winchester);

    }

}
