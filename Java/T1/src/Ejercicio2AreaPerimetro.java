
import java.util.Scanner;

public class Ejercicio2AreaPerimetro {

    public static void main(String[] args) {
        double radio;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca el radio:");
        radio = teclado.nextDouble();
        teclado.close();
        double area = Math.PI * Math.pow(radio, 2);
        double peri = 2 * Math.PI * radio;
        System.out.println("Area:" + area);
        System.out.println("Perimetro:" + peri);
    }

}
