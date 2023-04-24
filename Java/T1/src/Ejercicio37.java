/*37. Escribe un algoritmo que pida una lista de números enteros uno a uno hasta que se
introduzca el valor 0. A continuación debe escribir por pantalla la posición de la primera
y de la última aparición del número 12 dentro de la lista. Ejemplo:
Dame un número: 8 
Dame un número: 9
Dame un número: 12
Dame un número: 7
Dame un número: 6
Dame un número: 5
Dame un número: 4
Dame un número: 12
Dame un número: 3
Dame un número: 2
Dame un número: 1
Dame un número: 0
Primera aparición en posición 3
Última aparición en posición 8
Importante: Si el número 12 no está en la lista, se mostrará el valor 0 y si el número 12 
aparece sólo una vez, tanto la primera como la última posición serán el mismo valor.
b) Mostrar también por pantalla la lista de números introducida.*/

import java.util.Scanner;

public class Ejercicio37 {

    public static void main(String[] args) {
        int num, i, prim, ult;
        prim = 0;
        ult = 0;
        i = 1;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print("Dame un número: ");
            num = teclado.nextInt();
            if (num == 12) {
                if (ult == 0) {
                    prim = i;
                    ult = prim;
                } else {
                    ult = i;
                }
            }
            i++;
        } while (num != 0);
        teclado.close();
        System.out.println("Primera aparición en posición " + prim);
        System.out.println("Última aparición en posición " + ult);
    }

}
