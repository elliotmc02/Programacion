package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * @author Victor C. Gonzalez
 * @version 21/03/2023/A
 */
public class E105M {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1 = 0; //Num1 = Numerador
        int num2 = 0; //Num2 = Denominador
        int polla = 0;
        boolean controlador = false;
        boolean controlador2 = false;

        /*NUMERADOR*/
        do {
            System.out.println("Introduce numerador");
            try {
                num1 = teclado.nextInt();
                if (num1 > 99) {
                    throw new Exception("Numerador no es menor que 100");
                }
                controlador = true;
            } catch (InputMismatchException e) { //AQUI SE COMPRUEBA EL TECLADO
                System.out.println("Introduce numeros no cadenas");
                teclado.nextLine();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (!controlador);

        /*DENOMINADOR*/
        do {
            System.out.println("Introduce denominador");
            try {
                num2 = teclado.nextInt();
                if (num2 < -4) {
                    throw new Exception("Numerador no es mayor que -5");
                }
                controlador2 = true;
            } catch (InputMismatchException e) { //AQUI SE COMPRUEBA EL TECLADO
                System.out.println("Introduce numeros no cadenas");
                teclado.nextLine();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (!controlador2);

        /*DIVISION*/
        try {
            polla = num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("El denominador no es divible entre 0 ");
        }

        System.out.println("El cociente es " + polla);
    }

}
