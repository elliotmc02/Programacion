package Colecciones.E131;

import java.util.ArrayList;

public class E131 {

    public static void main(String[] args) {
        
        ARAS a1 = new ARAS();
        
        a1.meter("Clave1", "Valor1");
        a1.borrar("Clave1");
        
        ArrayList<String> al = new ArrayList<>();
        al.add("hola");
        al.add("paco");
        System.out.println(al.toString().replaceAll("[\\[\\]]", ""));
        
        
    }

}
