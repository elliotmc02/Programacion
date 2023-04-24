package Colecciones;

import java.util.Collection;
import java.util.HashMap;

public class EJMapa {

    public static void main(String[] args) {

        
        HashMap<String, Integer> mapa = new HashMap<>();
        Collection<Integer> valores = mapa.values();
        
        
        
        mapa.put("pitochocho", 13);
        mapa.put("Juanmarica", 24);
        mapa.put("Juanmayayo", 7);
        mapa.put("casilla2", 13);
        
        System.out.println(valores.toString());
        System.out.println(mapa.values());
        System.out.println(mapa.entrySet());
        
        

    }

}
