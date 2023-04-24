package Colecciones;

import java.util.HashSet;

public class prueba {

    public static void main(String[] args) {

        HashSet<String> bolsa = new HashSet<>();
        
        bolsa.add("hola");
        bolsa.add("polla");
        bolsa.add("cum");
        bolsa.add("aa");
        
        System.out.println(bolsa.size());
        bolsa.contains("migue");
        bolsa.remove("juanma");
        
        for (String x: bolsa) {
            System.out.println(x);
        }

    }

}
