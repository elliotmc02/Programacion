/*
Crea un array 4x4
b) Rellenala de 20 en todas las celdas
c) Rellena la diagonal principal con 10
d) Muestra por pantalla en forma de matriz (filas y columnas)
pero donde haya un 10 saca un 20 y viceversa
*/

package Array;

public class EP1 {

    public static void main(String[] args) {

        int matriz[][] = new int[4][4];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int k = 0; k < matriz[i].length; k++) {
                matriz[i][k] = 20;
                if (i == k) {
                    matriz[i][k] = 10;
                }
                if (matriz[i][k] == 20) {
                    System.out.print("10 "); 
                }
                else {
                    System.out.print("20 ");
                }
            }
            System.out.println();
        }
    }
}
