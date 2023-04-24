/*

i) Crea la el método pintar() el cual “pintará” el coche con el color que se le pase
como parámetro.
j) Implementa el método toString() para la clase coche.
*/

package POO;

import java.util.Scanner;

public class E66 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Color: ");
        String color = teclado.next();
        System.out.print("Anchura: ");
        double anchura = teclado.nextDouble();
        System.out.print("Altura: ");
        double altura = teclado.nextDouble();
        System.out.print("Puerta: ");
        int puerta = teclado.nextInt();
        
        
        Coche coche1 = new Coche(color,anchura,altura,puerta);
        
        System.out.println("Características coche: ");
        System.out.println("Color: " + coche1.color);
        System.out.println("Anchura: " + coche1.anchura);
        System.out.println("Altura: " + coche1.altura);
        System.out.println("Numero de puertas: " + coche1.puertas);
        System.out.println("Numero de ruedas: " + coche1.ruedas);
        int opcion;
        
        do {

            System.out.println("1: Chequear si tiene gasolina");
            System.out.println("2: Arrancar");
            System.out.println("3: Parar");
            System.out.println("4: Desplazarse");
            System.out.println("5: Repostar");
            System.out.println("6: Pintar");
            System.out.println("7: Mostrar características");
            System.out.println("0 para salir");
            System.out.print("Eliga la opcion: ");
            opcion = teclado.nextInt();
            switch (opcion){
                case 1: coche1.chequear();
                break;
                case 2: coche1.arrancar(5);
                break;
                case 3: coche1.parar();
                break;
                case 4: coche1.desplazarse(20);
                break;
                case 5: int litros; 
                    do {
                        System.out.print("Cuanta gasolina quieres meter? (Maximo 50) Hay " + coche1.gasolina + " ahora mismo: ");
                        litros = teclado.nextInt();
                    } while (litros > 50 || litros < 0);
                    coche1.repostar(litros);
                    break;
                case 6: System.out.print("\nElige el color nuevo: ");
                    String colorNuevo = teclado.next(); 
                    coche1.pintar(colorNuevo); 
                    break;
                case 7: System.out.println(coche1);
                break;
                case 0: System.out.println("Saliendo del coche");
                opcion = 0;
                break;
                default: System.out.println("Opcion incorrecta");;
                break;
            }
        } while (opcion != 0);   
    }
}
