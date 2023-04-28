package Colecciones;

import java.util.HashMap;

public class MostrarMapa {

    public static void main(String[] args) {

        HashMap<Integer, String> mapa = new HashMap<>();
        
        mapa.put(1, "Jaime chivato");
        mapa.put(2, "Jaime hermana me la chupas mañana en la caravana a las siete de la mañana con mi amiga mariana que vive en frigiliana");
        mapa.put(3, "Rulillas Farlopero");

        for (Integer llave: mapa.keySet()) {
            System.out.println("Clave: " + llave + " Valores: " + mapa.get(llave));
        }
        
        
    }

}
