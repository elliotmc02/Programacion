/*
Crea un array de 100 elementos dónde cada elemento sea un número aleatorio entre
1 y 100. Realiza los siguientes apartados:
a) Haz un programa que muestre los valores múltiplos de 5.
b) Otro que sólo muestre los números pares.
c) Otro que muestre el mayor de todos los elementos del array y su posición (si hay
varios iguales, muestra el primero)
*/

package Array;


public class E50 {

    public static void main(String[] args) {

        int lista[] = new int[100];
        int max = 0, pos = 0;
        boolean primero = false;
        for (int i = 0; i < lista.length; i++) {
            lista[i] = (int) ((Math.random() * (100)) + 1);
            System.out.print(lista[i] + " ");
            if (lista[i] > max) {
                max = lista[i];
            }
        }
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == max && primero == false) {
                pos = i + 1;
                primero = true;
            }
        }
        System.out.println("");
        System.out.println("Multiplos de 5: ");
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] % 5 == 0) {
                System.out.print(lista[i] + " ");
            }
        }
        System.out.println("");
        System.out.println("Pares: ");
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] % 2 == 0) {
                System.out.print(lista[i] + " ");
            }
        }
        System.out.println("");
        System.out.println("Máximo y posicion: " + pos + ". " + max);
    }

}
