/*
1. Crea un array de 10 elementos
Mete en cada cajon un numero aleatorio
entre 10 y 23

Intercambia los valores del 1er y ultimo cajon
Muestra en horizontal el contenido
del array (separados por espacio)

2. Pide un numero al usuario
Crea un array y del tamaño indicado
en el numero del usuario

Pide tantas notas (0 y 10) como cajones tenga
el array (mete cada nota en la celda
correspondiente del array)

Muestra la suma y la media
 */

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        // EJERCICIO 1
        /*
        int [] lista = new int[10];
        int max = 23, min = 10, tmp, i;
        
        for(i = 0; i < lista.length; i++) {
           
            int num = (int)((Math.random() * (max - min + 1)) + 1);
            lista[i] = num;
        }
        
        tmp = lista[0];
        lista[0] = lista[lista.length-1];
        lista[lista.length-1] = tmp;
        
        for(i = 0; i < lista.length; i++) {
            
            System.out.print(lista[i] + " ");
            
        }
         */
        // EJERCICIO 2
        Scanner teclado = new Scanner(System.in);
        System.out.print("Dame el tamaño del array: ");
        int nLista = teclado.nextInt();
        int i, suma = 0, media, nota;
        int[] lista = new int[nLista];

        for (i = 0; i < lista.length; i++) {

            do {
                System.out.print("Dame un numero: ");
                nota = teclado.nextInt();

                if (nota < 0 || nota > 10) {
                    System.out.println("Debe ser un numero entre el 0 y 10.");
                }

            } while (nota < 0 || nota > 10);
            lista[i] = nota;

        }

        for (i = 0; i < lista.length; i++) {

            //System.out.print(lista[i] + " ");
            //System.out.println("");
            suma += lista[i];

        }
        System.out.println("Suma: " + suma);
        media = suma / lista.length;
        System.out.println("Media: " + media);

    }
}
