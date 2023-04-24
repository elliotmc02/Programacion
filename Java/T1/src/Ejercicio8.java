/*8. Crea un algoritmo que simule el lanzamiento de un dado de N caras. El número de
caras del dado se solicitará por teclado.*/
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca el número de caras:");
        int caras = input.nextInt();
        input.close();
        int num = (int) (Math.random() * (caras - 1 + 1)) + 1;
        System.out.println(num);
    }

}
