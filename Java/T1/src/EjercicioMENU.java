/*Mostrar el menú y pedir la opcion al usuario

Si es 1 - Pregunta nombre al usuario y lo almacena
NO Imprime y vuelve a mostrar menú y a pedir opción

Si es 2 - Si hay nombre, lo imprime
Si no hay nombre - Dice que no hay nombre

3 - acaba el programa y dice Adios!

Si la opcion no es correcta, avisa del error
y vuelve a mostrar menú y a pedir opción

1 - dime nombre
2 - muestra nombre
3 - salir
opcion
*/

import java.util.Scanner;
public class EjercicioMENU {

    public static void main(String[] args) {
        int opcion;
        String nombre="No hay nombre";
        Scanner teclado=new Scanner(System.in);
        do{
            System.out.println("1 - Dime nombre");
            System.out.println("2 - Muestra nombre");
            System.out.println("3 - Salir");
            System.out.print("Opción: ");
            opcion=teclado.nextInt();
            switch (opcion){
                case 1: System.out.print("Cual es su nombre? ");
                        nombre=teclado.next();
                    break;
                case 2: System.out.println(nombre);
                    break;
                case 3: System.out.println("Adiós!");
                    break;
                default: System.out.println("Opción incorrecta.");
                    break;
            }
        }while (opcion!=3);
        teclado.close();
    }
}
