/*26. El sistema de verificación en dos pasos funciona de la siguiente manera:
•Se le pide al usuario que introduzca su nick, su email y la contraseña.
•Si el email y la contraseña son correctos (los datos se dicen en clase), el 
programa va a generar un número aleatorio de 4 cifras y lo va a mostrar por 
pantalla.
•A continuación se vuelve a pedir el email, la contraseña y, esta vez, el número 
aleatorio.
•Si todo ha ido correctamente, se mostrará el mensaje: “Verificación aceptada. 
Bienvenid@: xxxxxx (siendo xxxxxx el nick del usuario).
•Si hay algún fallo, se mostrará un mensaje de error.
Crea un algoritmo que reproduzca el comportamiento antes indicado.*/

import java.util.Scanner;

public class Ejercicio26 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nick, email, contra;
        System.out.print("Introduzca su nick: ");
        nick = teclado.next();
        System.out.print("Introduzca su email: ");
        email = teclado.next();
        System.out.print("Introduzca su contraseña: ");
        contra = teclado.next();
        if (email.equals("albertoj36@gmail.com") && contra.equals("medacAlberto")) {
            int num = (int) ((Math.random() * (9999 - 1000 - +1)) + 1000);
            System.out.println(num);
            System.out.print("Introduzca de nuevo el email: ");
            email = teclado.next();
            System.out.print("Introduzca de nuevo la contraseña: ");
            contra = teclado.next();
            System.out.print("Introduzca el número de 4 cifras: ");
            int numNuevo = teclado.nextInt();
            teclado.close();
            if (email.equals("albertoj36@gmail.com") && contra.equals("medacAlberto") && (numNuevo == num)) {
                System.out.println("Verificación aceptada. Bienvenid@: " + nick);
            } else {
                System.out.println("Error. Datos incorrectos");
            }
        } else {
            System.out.println("Error. Datos incorrectos");
        }
    }

}
