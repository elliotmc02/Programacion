/*
Crea un programa que implemente el siguiente juego entre la maquina y un usuario:
•Se coloca un marcador con victorias de la maquina y victorias del jugador.
Ambos valores empezarán en 0 al comenzar el juego..
•Se le pide al usuario que introduzca o el 0 o un numero entero entre 5 y 15.
Nota: Hay que controlar que esto ocurra correctamente. Si no es así se vuelve a pedir.
•Si el jugador introduce 0, el programa se acaba. Sino, el juego sigue.
•A continuación, la maquina saca un numero aleatorio entre 1 y 20;
•Se comprueba cual de los dos valores es el mayor (el de la máquina o el del
jugador) y se decide si gana la maquina o el jugador. 
•Se le suma uno al marcador de victorias del que haya ganado. En caso de
empate, no se suma nada.
•El juego se repite hasta que el jugador ponga un 0 como número jugado.

Importante:  Debes informar en todo momento al jugador de lo que va sucediendo en el juego
tal y como se muestra en el siguiente ejemplo de ejecución
 */

import java.util.Scanner;

public class T1P2E2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int vMaquina = 0; // victorias maquina
        int vJugador = 0; // victorias jugador
        int num; // numero del jugador
        int maquina; // numero de la maquina
        do {
            System.out.println("Victorias maquina: " + vMaquina);
            System.out.println("Victorias jugador: " + vJugador);
            
            do { // compruebo que el usuario introduce o el 0 o un numero entre 5 y 15
                System.out.print("\nIntroduce un numero entre 5 y 15 (0 para salir): ");
                num = teclado.nextInt();
            } while (num != 0 && (num < 5 || num > 15));
            
            if (num != 0) { // si el numero no es 0, empezara el juego
                maquina = (int) ((Math.random() * (20)) + 1);
                System.out.println("La maquina ha sacado el numero " + maquina);
                
                if (maquina > num) {
                    vMaquina++;
                    System.out.println("Has perdido!");
                }

                else if (maquina < num) {
                    vJugador++;
                    System.out.println("Tu ganas!");
                }

                else {
                    System.out.println("Empate");
                }
            }
        } while (num != 0); // si el jugador no elige el 0, no se acabara el juego
        teclado.close();
        System.out.println("Game over!");
    }
}
