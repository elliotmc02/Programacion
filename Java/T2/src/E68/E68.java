package E68;

/*
68.- Crea la clase  Cafetera  con los atributos  capacidadMaxima  y  cantidadActual.
También se necesitan los siguientes métodos:
•El constructor debe indicar  la capacidad máxima en 1000 cc y la capacidad
actual en 0 (cafetera vacía).
•echarCafe: recibe una cantidad de café y lo anota en la capacidad actual. Hay
que controlar que la cantidad recibida no sea mayor que la capacidad máxima (si
es así, la cafetera se llena completamente y se desecha el sobrante)
•llenarCafetera: pone la cafetera a su valor máximo de cantidad.
•VaciarCafetera: tira todo el café de la cafetera.
•servirTaza: recibe un numero que indica la capacidad de la taza y hace que la
cafetera pierda esa cantidad de café. Hay que controlar si la cafetera puede servir
la taza.
•cantidadCafe: muestra cuanto café queda en la cafetera: Queda xxxxxxx cc de
café en la cafetera.
*/

import java.util.Scanner;
public class E68 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Cafetera cafetera1 = new Cafetera();

        System.out.print("Cantidad de café a la cafetera: ");
        int cantidad = teclado.nextInt();
        
        cafetera1.echarCafe(cantidad);
        cafetera1.llenarCafetera();
        cafetera1.vaciarCafetera();
        
        System.out.print("Cantidad para servir a la taza: ");
        cantidad = teclado.nextInt();
        
        cafetera1.servirTaza(cantidad);
        cafetera1.cantidadCafe();
    }

}
