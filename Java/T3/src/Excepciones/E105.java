package Excepciones;

import java.util.Scanner;
import java.util.InputMismatchException;

public class E105 {

    public static void main(String[] args) {
        boolean correcto = false;
        Scanner sc = new Scanner(System.in);
        int res;
        do {
            try {
                System.out.print("Dame un numerador: ");
                int num = sc.nextInt();
                if (num >= 100) throw new Exception();
                    //throw new Exception("Error valores entre rango no permitido \nIntroduzca un valor valido");
                
                System.out.print("Dame un denominador: ");
                int den = sc.nextInt();
                if (den <= -5) throw new Exception();
                    //throw new Exception("Error valores entre rango no permitido \nIntroduzca un valor valido");

                res = num / den;
                System.out.println(res);
                correcto = true;
            } catch (ArithmeticException e) {
                System.out.println("Error dividir entre 0. \nEl denominador no puede ser 0");
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Error intentando introducir cadena \nIntroduzca un numero");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println(e);
                //System.out.println("Error valores entre rango no permitido \nIntroduzca un valor valido");
                sc.nextLine();
            }
        } while (!correcto);
        sc.close();
    }

}
