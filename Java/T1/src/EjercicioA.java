
import java.util.Scanner;

public class EjercicioA {

    public static void main(String[] args) {
        int num1, num2;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca valor 1:");
        num1 = teclado.nextInt();
        System.out.print("Introduzca valor 2:");
        num2 = teclado.nextInt();
        teclado.close();
        if (num1 > num2) {
            System.out.println("El mayor es: " + num1);
            System.out.println("El menor es: " + num2);

        } else {
            System.out.println("El mayor es: " + num2);
            System.out.println("El menor es: " + num1);
        }
    }

}
