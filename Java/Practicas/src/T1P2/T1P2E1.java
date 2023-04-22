package T1P2;

/*
Pide por teclado un numero entero positivo o negativo pero distinto de cero (debes
controlar que eso  suceda correctamente y, en caso de que no suceda así, volver a
pedir el número). Si llamamos X al numero entero que se pide por teclado, calcula la
siguiente suma:
A continuación muestra el resultado de la suma usando el siguiente mensaje: La
suma del polinomio es: suma calculada
Nota: Este es un ejercicio de bucles. No se pueden usar arrays.
 */
import java.util.Scanner;

public class T1P2E1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int num; // numero que introduce el usuario
        double suma = 0; // suma de x^2/x

        do {
            System.out.print("Dame un numero distinto de 0: ");
            num = teclado.nextInt();
        } while (num == 0);

        teclado.close();

        for (int i = 2; i <= 9; i++) {
            suma += (Math.pow(num, i) / i); // se calcula la potencia de num y la division, y se van sumando constantemente
        }

        double sumafinal = num + suma; // se le suma el numero introducido por el usuario a la suma de las potencias y divisiones
        System.out.println("La suma del polinomio es: " + sumafinal);

    }

}


