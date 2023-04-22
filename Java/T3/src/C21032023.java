
import java.util.Scanner;

public class C21032023 {

    public static void main(String[] args) {

        String texto = "Lana Rhoades, \nnombre artístico de Amara Maple, nació en septiembre de 1996 en la ciudad de Chicago (Illinois), en una familia de ascendencia checoslovaca. \nComenzó trabajando de camarera en la \ncadena de restaurantes The Tilted Kilt.";

        String nLetras = texto.replace(" ", "");
        System.out.println(nLetras.length());

        Scanner sc = new Scanner(System.in);
        System.out.print("Dame un numero positivo: ");
        int n1 = sc.nextInt();
        System.out.print("Dame otro numero: ");
        int n2 = sc.nextInt();

        System.out.println(n1 < n2 ? texto.substring(n1, n2) : texto.substring(n2, n1));
        
        String nPalabras[] = texto.split(" ");
        
        System.out.println("Numero de palabras: " + nPalabras.length);
        
        String nLineas[] = texto.split("\n");
        
        System.out.println("Numero de lineas: " + nLineas.length);
        
        String ultimaPalabra = texto.substring(texto.lastIndexOf(" "));
        
        System.out.println(ultimaPalabra + texto);

    }

}
