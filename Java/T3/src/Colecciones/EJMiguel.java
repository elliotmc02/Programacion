/*
Miguel Rueda: Escribe un programa que cuente la cantidad de veces que aparece cada letra en 
una cadena dada, y que guarde el resultado en un mapa, donde la clave es la 
letra y el valor es la cantidad de veces que aparece. DespuÃ©s, imprime por 
pantalla el mapa resultante.

Por ejemplo, si la cadena es "hola mundo", el mapa resultante serÃ­a:
{h=1, o=2, l=1, a=1, m=1, u=1, n=1, d=1}
 */
package Colecciones;

import java.util.HashMap;

public class EJMiguel {

    public static void main(String[] args) {

        String t = "hola mundo me llamo manolo";
        String tT = t.replace(" ", "");
        HashMap<Character, Integer> mapa = new HashMap<>();
        char letra;

        for (int i = 0; i < tT.length(); i++) {
            letra = tT.charAt(i);
            if (!mapa.containsKey(letra)) {
                mapa.put(letra, 1);
            } else {
                int v = mapa.get(letra);
                v++;
                mapa.put(letra, v);
            }
        }

        System.out.println(mapa);

    }

}
