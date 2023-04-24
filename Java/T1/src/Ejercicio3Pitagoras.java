
import java.util.Scanner;

public class Ejercicio3Pitagoras {

    public static void main(String[] args) {
        double valor1;
        double valor2;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca valor1:");
        valor1 = teclado.nextDouble();
        System.out.print("Introduzca valor2:");
        valor2 = teclado.nextDouble();
        teclado.close();
        double pita = Math.sqrt(Math.pow(valor1, 2) + Math.pow(valor2, 2));
        System.out.println("Teorema de pitagoras:" + pita);
        double peri = 2 * (valor1 + valor2);
        double area = valor1 * valor2;
        System.out.println("Area:" + area);
        System.out.println("Perimetro:" + peri);
    }

}
