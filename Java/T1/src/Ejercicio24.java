/*24. Pregunta el nombre de dos jugadores. A continuación, simula una partida de tirada
de dados: el primer jugador tira un dado de 6 caras y saca una puntuación. Luego hace
lo mismo el segundo jugador. Al final se indica que jugador ha ganado.*/

import java.util.Scanner;

public class Ejercicio24 {

    public static void main(String[] args) {
        String nombre1;
        String nombre2;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca primer nombre: ");
        nombre1 = teclado.next();
        System.out.print("Introduzca segundo nombre: ");
        nombre2 = teclado.next();
        teclado.close();
        int res1 = (int) ((Math.random() * (6 - 1 + 1)) + 1);
        int res2 = (int) ((Math.random() * (6 - 1 + 1)) + 1);
        System.out.println(res1);
        System.out.println(res2);
        if (res1 > res2) {
            System.out.println("El ganador es " + nombre1);
        } else if (res1 == res2) {
            System.out.println("Empate");
        } else {
            System.out.println("El ganador es " + nombre2);
        }
    }

}
