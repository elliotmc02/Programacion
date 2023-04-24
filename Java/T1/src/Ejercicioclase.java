import java.util.Scanner;
public class Ejercicioclase {

    public static void main(String[] args) {
        int num;
        Scanner teclado=new Scanner(System.in);
        System.out.print("Introduzca un numero del 1 al 12: ");
        num=teclado.nextInt();
        teclado.close();
        if (num>=1&&num<=3) {
            System.out.println("Hace mal tiempo");
        }
        else if (num>=4&&num<=6) {
            System.out.println("Se está de lujo");
        }
        else if (num>=7&&num<=9) {
            System.out.println("Mucho calor");
        }
        else if (num>=10&&num<=12) {
            System.out.println("Empieza a ponerse turbio");
        }
        else {
            System.out.println("Error");
        }
    }

}
