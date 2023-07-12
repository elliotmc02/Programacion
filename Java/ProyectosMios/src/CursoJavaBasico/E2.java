/*
Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.
*/

package CursoJavaBasico;

import java.util.Scanner;

public class E2 {

    public static void main(String[] args) {
        System.out.print("Precio: ");
        System.out.println(funcionIVA(new Scanner(System.in).nextDouble()));
    }

    public static double funcionIVA(double precio) {
        return precio + (precio * 0.21);
    }

}
