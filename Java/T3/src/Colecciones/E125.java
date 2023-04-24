package Colecciones;

import java.util.Scanner;
import java.util.ArrayList;

import java.util.InputMismatchException;

public class E125 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        int opcion;
        int numero;
        
        System.out.println("1. Agregar numero ");
        System.out.println("2. Buscar numero ");
        System.out.println("3. Eliminar numero ");
        System.out.println("4. Modificar numero");
        System.out.println("5. Insertar en posicion");
        System.out.println("6. Mostrar contenido");
        System.out.println("7. Salir");
        
        try {

            do {
                System.out.print("\nOpcion: ");

                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.print("Numero: ");
                        lista.add(sc.nextInt());
                        System.out.println("Numero añadido");
                        break;
                    case 2:
                        System.out.print("Numero: ");
                        numero = sc.nextInt();
                        System.out.println((lista.contains(numero) ? "Se encuentra en la lista, en la posicion " + lista.indexOf(numero) : "No se encuentra en la lista"));
                        break;
                    case 3:
                        System.out.print("Numero: ");
                        numero = sc.nextInt();
                        if (lista.contains(numero)) {
                            lista.remove(lista.indexOf(numero));
                            System.out.println("Numero eliminado");
                        } else {
                            System.out.println("El numero no esta en la lista");
                        }
                        break;
                    case 4:
                        System.out.print("Numero que quieres cambiar: ");
                        numero = sc.nextInt();
                        if (lista.contains(numero)) {
                            System.out.print("Nuevo numero: ");
                            lista.set(lista.indexOf(numero), sc.nextInt());
                        } else {
                            System.out.println("El numero no esta en la lista");
                        }
                        break;
                    case 5:
                        System.out.print("Numero: ");
                        numero = sc.nextInt();
                        System.out.println("Posicion: ");
                        int posicion = sc.nextInt();
                        lista.add(posicion, numero);
                        break;
                    case 6:
                        System.out.print("Lista: ");
                        for (Integer x : lista) {
                            System.out.print(x + " ");
                        }
                        break;
                    case 7:
                        System.out.println("nos vemos mostro");
                        break;
                }

            } while (opcion != 7);
        } catch (InputMismatchException e) {
            System.out.println("cadenas no: " + e.getMessage());
        }
    }

}
