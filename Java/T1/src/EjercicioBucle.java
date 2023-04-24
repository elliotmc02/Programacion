import java.util.Scanner;
public class EjercicioBucle {

    public static void main(String[] args) {
        /*int num;
        Scanner teclado=new Scanner(System.in);
        System.out.print("dame un numero: ");
        num=teclado.nextInt();
        while (num<0) {
            System.out.println("Quiero un positivo");
            System.out.print("dame otro numero: ");
            num=teclado.nextInt();
        }*/
        
        String nombre;
        Scanner teclado=new Scanner(System.in);
        System.out.print("Dame un nombre: ");
        nombre=teclado.next();
        while (!nombre.equals("fin")) {
            System.out.print("Pon otro nombre: ");
            nombre=teclado.next();
        }
    }

}
