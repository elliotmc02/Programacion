/*
45. Adivina el número:
Crea un programa que simule el juego de adivinar un número. El funcionamiento del
juego es el siguiente: 
•El programa “piensa” un número entero aleatorio entre 1 y 100.
•A continuación pide un número entero al usuario.
•Mientras el número del usuario no sea el número “pensado”, el juego no acaba.
•Si el número del usuario es mayor que el “pensado”, se debe mostrar el mensaje:
“Te has pasado!!”
•Si el número del usuario es menor que el “pensado”, se debe mostrar el mensaje:
“Te has quedado corto!!”
•Cuando el usuario meta el mismo número que el “pensado”, se muestra el
mensaje: “Lo logrates!” y el juego acaba.
 */

import java.util.Scanner;

public class Ejercicio45 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int maq = (int) ((Math.random() * (100)) + 1);
        System.out.println(maq);
        int num;

        do {

            System.out.print("Adivina el número: ");
            num = teclado.nextInt();

            if (num > maq) {
                System.out.println("Te has pasado!!");
            } else if (num < maq) {
                System.out.println("Te has quedado corto!!");
            }
        } while (num != maq);

        System.out.println("Lo lograste!");
        teclado.close();
    }

}
