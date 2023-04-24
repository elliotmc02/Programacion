/*
Sea el array relleno con las notas: 6,3,9,7,5,8,10,2,4 y 5
Crea un programa que, a partir de ese array, muestre por pantalla la media ponderada de
las notas.
*/



package Array;


public class E47 {

    public static void main(String[] args) {

        int lista[] = {6,3,9,7,5,8,10,2,4,5};
        int i, media, suma = 0;
        for (i = 0; i < lista.length; i++) {
            suma+=lista[i];
        }
        System.out.println(suma / lista.length);
    }

}
