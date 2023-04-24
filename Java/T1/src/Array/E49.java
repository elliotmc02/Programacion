/*
Crea un array de 100 Crea un array de 100 elementos dónde cada elemento sea un
número aleatorio entre 1 y 100. A continuación muestra por pantalla el mayor y el
menor elemento de ese array
 */
package Array;

public class E49 {

    public static void main(String[] args) {

        int lista[] = new int[100];
        int max = 0, min = 100;
        for (int i = 0; i < lista.length; i++) {
            lista[i] = (int) ((Math.random() * (100)) + 1);
            if (lista[i] > max) {
                max = lista[i];
            }
            if (lista[i] < min) {
                min = lista[i];
            }
        }
        System.out.println("Máximo es: " + max);
        System.out.println("Mínimo es: " + min);

    }

}
