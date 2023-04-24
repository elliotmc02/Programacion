/*
Crea matriz 5x5 y rellena con valores aleatorios entre 1 y 20
muestrala en forma de matriz
b) Crea otra matriz llamada copia del mismo tamaño y vuelca el contenido de la primera matriz
en copia pero si el numero es mayor a 10 pones un 9 muestrala

c) calcula la suma de todos los elementos de copia, 
d) calcula la multiplicacion de la diagonal principal de copia

*/

package Array;

public class EP2 {

    public static void main(String[] args) {

        int matriz[][] = new int[5][5];
        System.out.println("\nOriginal");
        for (int i = 0; i < matriz.length; i++) {
            for (int k = 0; k < matriz[i].length; k++) {
                matriz[i][k] = (int)((Math.random()*(20))+1);
                System.out.print(matriz[i][k] + " ");
            }
            System.out.println();
        }
        
        int copia[][] = new int[matriz.length][matriz[0].length];
        int multi = 1;
        int suma = 0;
        
        System.out.println("\nCopia");
        
        for (int i = 0; i < matriz.length; i++) {
            for (int k = 0; k < matriz[i].length; k++) {
                copia[i][k] = matriz[i][k];
                if (copia[i][k] > 10) {
                    copia[i][k] = 9;
                }
                System.out.print(copia[i][k] + " ");
                suma+= copia[i][k];
                if (i == k) {
                   multi *= copia[i][k];
                }
            }
            System.out.println();
        }
        System.out.println("Suma: " + suma);
        System.out.println("Multiplicacion: " + multi);
    }
}
