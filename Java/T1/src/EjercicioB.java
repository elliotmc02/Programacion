import java.util.Scanner;
public class EjercicioB {

    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner teclado=new Scanner(System.in);
        System.out.print("Introduzca valor 1:");
        num1=teclado.nextInt();
        System.out.print("Introduzca valor 2:");
        num2=teclado.nextInt();
        System.out.print("Introduzca valor 3:");
        num3=teclado.nextInt();
        teclado.close();
        if (num1>num2&&num1>num3&&num2>num3) {
            System.out.println("El mayor es: "+num1);
            System.out.println("El mediano es: "+num2);
            System.out.println("El menor es: "+num3);
            
        }
        else if (num2>num1&&num2>num3&&num1>num3) {
            System.out.println("El mayor es: "+num2);
            System.out.println("El mediano es: "+num1);
            System.out.println("El menor es: "+num3);
        }
        else if (num3>num1&&num3>num2&&num2>num1) {
            System.out.println("El mayor es: "+num3);
            System.out.println("El mediano es: "+num2);
            System.out.println("El menor es: "+num1);
        }
        else if (num1>num2&&num1>num3&&num3>num2) {
            System.out.println("El mayor es: "+num1);
            System.out.println("El mediano es: "+num3);
            System.out.println("El menor es: "+num2);
        }
        else if (num1==num2&&num1==num3) {
            System.out.println("Todos los numeros son iguales");
        }
    }

}
