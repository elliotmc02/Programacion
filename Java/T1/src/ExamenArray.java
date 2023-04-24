/*
e pide realizar un programa para controlar la plazas de un aparcamiento. 
El aparcamiento dispone de 24 plazas de dos tamaños diferentes: 14 plazas pequeñas y 10
plazas grandes.
La asignación de cada vehículo se hace automáticamente según su tamaño, teniendo
en cuenta además lo siguiente:
• Cada vehículo sólo puedo ocupar una plaza.
• Un vehículo pequeño siempre ocupará primero una plaza pequeña, salvo que
estén todas ocupadas. En ese caso podrá aparcar en una grande.
• Un vehículo grande sólo puede ocupar una plaza grande. Si están todas ocupadas 
no podrá aparcar (aunque estén libres todas las pequeñas).
• De todas las plazas libres que haya, siempre se ocupará primero la de menor
número.

El programa debe generar un menú con 4 opciones:

1. Aparcar vehículo: se indica el tamaño del vehículo y se devuelve la plaza ocupada 
si se ha podido aparcar. En caso contrario se indica que no ha sido posible. Finalmente 
se preguntará si se quiere aparcar otro vehículo.
2. Sacar vehículo: se debe indicar la plaza que se quiere dejar libre y se libera
esa plaza. Si esa plaza ya está libre, se indicará. Una vez hecho se le preguntará 
al usuario si quiere sacar otro vehículo.
3. Mostrar aparcamiento: muestra todas las plazas del aparcamiento indicando
si están libres u ocupadas.
4. Salir del programa.

*/
import java.util.Scanner;

public class ExamenArray {

    public static void main(String[] args) {

        String[] PG = new String[10];
        String[] PP = new String[14];
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        int libre;
        int plaza;
        boolean encontrado = false;
        String otro;
        String tamaño;
        for (int i = 0; i < PG.length; i++) {
            PG[i] = "L";
        }
        for (int i = 0; i < PP.length; i++) {
            PP[i] = "L";
        }
        
        do {
            System.out.println("1. Aparcar vehículo");
            System.out.println("2. Sacar vehículo");
            System.out.println("3. Mostrar aparcamiento");
            System.out.println("4. Salir del programa");
            System.out.print("Opcion? ");
            opcion = teclado.nextInt();
            
            if (opcion == 1) {
                do {
                    System.out.print("Tamaño del vehículo (G/P) ?: ");
                    tamaño = teclado.next();
                    if (tamaño.equals("G")) {
                        for (int i = 0; i < PG.length; i++) {
                            if (PG[i].equals("L") && encontrado==false) {
                                libre = i;
                                PG[i] = "0";
                                encontrado = true;
                                System.out.println("Vehiculo aparcado en G" + libre);
                            }
                        }
                    }
                    else if (tamaño.equals("P")) {
                        for (int i = 0; i < PP.length; i++) {
                            if (PP[i].equals("L") && encontrado==false) {
                                libre = i;
                                PP[i] = "0";
                                encontrado = true;
                                System.out.println("Vehiculo aparcado en P" + libre);
                            }
                        }
                        
                    }
                    encontrado = false;
                    System.out.print("Aparcar otro (S/N)?: ");
                    otro = teclado.next();
                } while (!otro.equals("N"));
            }
            else if (opcion == 2) {
                do {
                    System.out.print("Tamaño del vehículo (G/P) ? ");
                    tamaño = teclado.next();
                    System.out.print("Número de plaza? ");
                    plaza = teclado.nextInt();
                    if (tamaño.equals("G")) {
                        if (PG[plaza].equals("0")) {
                            System.out.println("La plaza queda disponible.");
                            PG[plaza] = "L";
                        }
                        else {
                            System.out.println("IMPOSIBLE: en esa plaza no hay ningun vehiculo");
                        }
                    }
                    else if (tamaño.equals("P")) {
                        if (PP[plaza].equals("0")) {
                            System.out.println("La plaza queda disponible.");
                            PP[plaza] = "L";
                        }
                        else {
                            System.out.println("IMPOSIBLE: en esa plaza no hay ningun vehiculo");
                        }
                    }
                    System.out.print("Sacar otro (S/N)? ");
                    otro = teclado.next();
                } while (!otro.equals("N"));
            }
            else if (opcion == 3) {
                System.out.println("Situación del aparcamiento:");
                System.out.print("Plazas G = ");
                for (int i = 0; i < PG.length; i++) {
                    System.out.print(PG[i]);
                    if (i!=PG.length - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.print("\nPlazas P = ");
                for (int i = 0; i < PP.length; i++) {
                    System.out.print(PP[i]);
                    if (i!=PP.length - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println("");
            }
        } while (opcion!=4);
        teclado.close();
    }
}
