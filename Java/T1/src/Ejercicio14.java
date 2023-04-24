/*14. Un partido de fútbol tiene una duración de 90 minutos. El minuto 1 se considera que
abarca desde los 0 segundos hasta los 59 segundos. El minuto 2 abarca desde los 60
segundos hasta los 119 segundos... así sucesivamente hasta el último minuto, que es el
minuto 90 y abarca desde los 5340 segundos hasta los 5400 segundos.
Crea un programa que pida al usuario el número de segundos transcurridos y muestre el
minuto en que nos encontramos.*/
import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca los segundos:");
        double seg = input.nextDouble();
        input.close();
        int min = (int) (seg / 60) + 1;
        System.out.println("Estamos en el minuto " + min);
    }

}
