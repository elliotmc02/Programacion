package Excepciones;


import java.util.Scanner;

public class E102 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe una palabra: ");
        String p = sc.next();
        System.out.print("Dame un número entero: ");
        int n = sc.nextInt();

        try {
            System.out.println("El caracter en la posicion " + n + " es " + p.charAt(n));
        }
        catch(Exception e) {
            System.out.println("No existe la posición " + n + " en la cadena");
        }

    }

}
