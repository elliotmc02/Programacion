import java.util.Scanner;
public class EjercicioClaseWhile {

    public static void main(String[] args) {
        String usuario, pass;
        int intento=3;
        Scanner teclado=new Scanner(System.in);
        System.out.print("Introduzca nombre de usuario: ");
        usuario=teclado.next();
        System.out.print("Introduzca la contraseña: ");
        pass=teclado.next();
        while ((!usuario.equals("Albertoj36")||!pass.equals("medacAlberto"))&&intento!=0) {
            if (intento!=1) {    
                intento--;
                System.out.println("Datos incorrectos, le quedan "+intento+" intentos: ");
                System.out.print("Introduzca nombre de usuario: ");
                usuario=teclado.next();
                System.out.print("Introduzca la contraseña: ");
                pass=teclado.next();
            }
            else if (intento==1) {
                intento--;
                System.out.println("Sin intentos");
                teclado.close();
            }
        }
        if (usuario.equals("Albertoj36")&&pass.equals("medacAlberto")) {
                System.out.println("Datos correctos");
                teclado.close();
        }
    }
}
