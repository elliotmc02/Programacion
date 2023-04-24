/*15. Pedir por teclado un número entero de 4 cifras.
a) Mostrar cada una de sus cifras (una debajo de otra)
b) Crear un nuevo número con las cifras del primero pero al revés.
Nota: debe leerse por teclado un número entero NO una cadena.*/

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca un número entero de 4 cifras:");
        int numero = input.nextInt();
        int c1, c2, c3, c4;
        String s1, s2, s3, s4;
        c4 = numero % 10;
        c3 = numero % 100 / 10;
        c2 = numero % 1000 / 100;
        c1 = numero % 10000 / 1000;
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        s1 = String.valueOf(c1);
        s2 = String.valueOf(c2);
        s3 = String.valueOf(c3);
        s4 = String.valueOf(c4);
        System.out.println(s4 + s3 + s2 + s1);
    }

}
