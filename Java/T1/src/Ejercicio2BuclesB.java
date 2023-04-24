
import java.util.Scanner;

public class Ejercicio2BuclesB {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int mayor, menor, contador;
        System.out.print("Introduzca un número menor:");
        menor = teclado.nextInt();
        System.out.print("Introduzca un número mayor:");
        mayor = teclado.nextInt();
        contador = menor;
        while (contador <= mayor) {
            if (contador % 2 == 0) {
                System.out.println(contador + " ");
            }
            contador++;
        }
    }

}
