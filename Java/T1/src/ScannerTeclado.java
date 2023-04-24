import java.util.Scanner;
public class ScannerTeclado {

    public static void main(String[] args) {
        int edad;
        String nombre;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduzca su nombre:");
        nombre=teclado.nextLine();
        System.out.println("Introduzca su edad:");
        edad=teclado.nextInt();
        System.out.println("El nombre es "+nombre+" y tiene "+edad+" años");
        teclado.close();
    }
    
}
