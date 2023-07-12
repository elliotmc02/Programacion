/*
En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.

Tened en cuenta que los textos pueden venir de un array de tipo String. Por ejemplo:

String[] nombres = {"", "", "", ""}
 */
package CursoJavaBasico;

import java.util.ArrayList;
import java.util.Scanner;

public class E3 {

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String texto;
        System.out.println("Escriba \"salir\" para salir: ");
        while (true) {
            texto = sc.nextLine();
            if (texto.equalsIgnoreCase("salir")) {
                break;
            }
            lista.add(texto);
        }
        System.out.println(lista.toString().replaceAll(",", " "));
    }

}
