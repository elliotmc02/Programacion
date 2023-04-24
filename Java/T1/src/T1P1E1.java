/*Realiza un programa pida por teclado al usuario un numero entero entre 10 y 30. A
continuación la máquina debe sacar un número aleatorio entre 1 y 50 y mostrarlo por
pantalla.
Finalmente, indica usando un mensaje por pantalla quien es el que tiene el número
más alto.
Debes de tener en cuenta que si el usuario no introduce un número válido, el progra-
ma mostrará un mensaje de error y acabará.*/

import java.util.Scanner;
public class T1P1E1 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int num, num2;
        int max=50;
        int min=1;
        System.out.print("Introduzca un número entero entre el 10 y 30: ");
        num=teclado.nextInt();
        teclado.close();
        num2=(int)((Math.random()*(max-min+1))+min);
        if (num>=10&&num<=30){
            System.out.println("La máquina ha sacado un "+num2);
            if (num>num2) {
                System.out.println("Tú ganas");
            }
            else if (num<num2){
                System.out.println("La máquina gana");
            }
            else {
                System.out.println("Empate");
            }
        }
        else {
            System.out.println("Numero inválido.");
        }
    }

}
