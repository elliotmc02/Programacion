/*
46. El juego de las bolas:
Este es un juego donde el jugador compite contra la máquina. Para ello:
•El usuario comienza introduciendo un numero natural positivo que representará
la cantidad de bolas inicial que hay en una urna. 
•A continuación, la maquina decide quien empieza de forma aleatoria.
•En cada turno, el usuario o la máquina podrán retirar   1,2 ó 3 bolas (es decir,
eligen restar 1, 2 o 3). 
◦Si es el jugador, se le preguntará  cuantas  bolas  quiere sacar (hay que
controlar que sean 1, 2 o 3).
◦Si es la máquina, decidirá de forma aleatoria si saca 1,2 o 3 bolas.
•Los turnos se repiten de forma alternativa hasta que uno de los dos  retira la
última bola. Quien haga eso, pierde.
Mejora: haz que la máquina decida si quita 1, 2 o 3 bolas en su turno dependiendo de las
bolas que haya en la urna (y no de forma aleatoria).
 */

import java.util.Scanner;

public class Ejercicio46 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Numero de bolas: ");

        int bolas = teclado.nextInt();
        int quita;
        int empieza = (int) ((Math.random() * (2)) + 1);

        if (empieza == 1) {
            System.out.println("Empiezas tu");
        } else {
            System.out.println("Empieza la máquina");
        }

        do {

            if (empieza == 1) {
                System.out.print("Cuantas bolas quitas (1, 2 o 3): ");
                quita = teclado.nextInt();

                if (quita >= 1 && quita <= 3) {
                    bolas -= quita;
                    empieza = 2;
                    //System.out.println("Tu quitas " + quita + " bolas");
                } else {
                    System.out.println("Incorrecto, solo puede quitar 1, 2 o 3 bolas.");
                }
                if (bolas <= 0) {
                    System.out.println("La máquina gana!");
                    empieza = 0;
                }
            }

            if (empieza == 2) {

                if (bolas > 3) {
                    quita = 3;
                } else if (bolas == 3) {
                    quita = 2;
                } else if (bolas == 2) {
                    quita = 1;
                } else {
                    quita = 1;
                }

                bolas -= quita;
                empieza = 1;
                //System.out.println("La máquina quita " + quita + " bolas");

                if (bolas <= 0) {
                    System.out.println("Tú ganas!");
                    empieza = 0;
                }
            }

            /*
            if (empieza == 2) {
            
                quita = (int)((Math.random() * (3)) + 1);
                bolas -= quita;
                empieza = 1;
                //System.out.println("La máquina quita " + quita + " bolas");
                
                if (bolas <= 0) {
            
                    System.out.println("Tú ganas!");
                    empieza = 0;
                }
            }
             */
            //System.out.println("Bolas restantes: "+bolas);
        } while (bolas > 0);
        teclado.close();
    }
}
