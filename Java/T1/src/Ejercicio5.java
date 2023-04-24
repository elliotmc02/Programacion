/*5.   Diseña   un   algoritmo   que   pida   por   teclado   un   tiempo   expresado   en   segundos   y
muestre por pantalla ese valor expresado en horas, minutos y segundos.*/
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca segundos:");
        int num = teclado.nextInt();
        int hora = num / 3600;
        int resto = num % 3600;
        int min = resto / 60;
        int segundos = resto % 60;
        System.out.println(hora + " hora " + min + " minuto " + segundos + " segundos");
    }

}
