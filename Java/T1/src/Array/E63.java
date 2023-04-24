/*
Dada una matriz MxM, crear un programa que muestre: 
a)El mayor elemento de la diagonal principal.
b)La media de los valores de la diagonal principal.
*/

package Array;


public class E63 {

    public static void main(String[] args) {

        int matriz[][] = {{8,8,5},{2,4,8},{6,8,4}};
        int max = 0;
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(matriz[i][i] + " ");
            if (matriz[i][i] > max) {
              max = matriz[i][i];
            }
            suma += matriz[i][i];
            
        }
        System.out.println("Mayor elemento: " + max);
        System.out.println("Media: " + suma / matriz.length);
    }

}
