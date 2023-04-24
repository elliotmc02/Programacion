import java.util.Scanner;
public class EjercicioCTMS {

    public static void main(String[] args) {
        double ctms;
        double pul=2.54;
        Scanner teclado=new Scanner(System.in);
        System.out.print("Introduzca los centimetros:");
        ctms=teclado.nextDouble();
        teclado.close();
        double res=ctms/pul;
        System.out.println(ctms+" ctms son "+res+" pulgadas");
    }
}

