/*13. Se necesita un algoritmo que calcule el coste total de baldosas cuadradas necesarias
para cubrir el suelo de una habitación rectangular. El programa solicitará como datos las
dimensiones   de   la   habitación   en   metros   (ancho   y   largo),   el   lado   de   cada   baldosa
expresado en centímetros y el precio por baldosa expresado en euros.
Con esos datos calculará el número de baldosas necesarias que hay que colocar en la
habitación (redondeando hacia arriba si el resultado no es un numero entero) y el precio
total a invertir.*/
import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        //Datos: dimensiones ancho y largo en metros
        //Lado de cada baldosa en centimetros
        //Precio por baldosa en euros
        double ancho, largo, lado, precio;
        System.out.print("Introduzca el ancho de la habitación (m):");
        Scanner teclado = new Scanner(System.in);
        ancho = teclado.nextDouble();
        System.out.print("Introduzca el largo de la habitación (m):");
        largo = teclado.nextDouble();
        System.out.print("Introduzca el lado de la baldosa (cm):");
        lado = teclado.nextDouble();
        System.out.print("Introduzca el precio de la baldosa:");
        precio = teclado.nextDouble();
        teclado.close();
        double ladometros = lado / 100;
        double res1 = ancho / ladometros;
        double res2 = largo / ladometros;
        int nbald = (int) (Math.ceil(res1 * res2));
        double preciototal = nbald * precio;
        System.out.println("Hacen falta " + nbald + " baldosas y el precio total son " + preciototal + " euros");
    }

}
