package Colecciones;

import java.util.Scanner;
import java.util.ArrayList;

public class E123 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> listaNumeros = new ArrayList<>();

        // pedir numeros
        System.out.print("Cuantos numeros quieres meter: ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.print("Numero: ");
            listaNumeros.add(sc.nextInt());
        }

        // mostrar lista
        System.out.println("Lista");
        for (Integer cajones : listaNumeros) {
            System.out.println(cajones);
        }

        // intercambiar el cajon 0 por el ultimo
        int tmp = listaNumeros.get(0);
        listaNumeros.set(0, listaNumeros.get(listaNumeros.size() - 1));
        listaNumeros.set(listaNumeros.size() - 1, tmp);

        // meter mas numeros
        ArrayList<Integer> listaNumeros2 = new ArrayList<>();
        System.out.print("Cuantos numeros mas quieres meter: ");
        num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.print("Numero: ");
            listaNumeros2.add(sc.nextInt());
        }
        
        for(Integer lista2: listaNumeros2) {
            listaNumeros.add(lista2);
        }
        
        // suma de todos los valores
        int suma = 0;
        for (Integer sumas : listaNumeros) {
            suma += sumas;
        }
        System.out.println("Suma: " + suma);

        // la media
        int media = suma / listaNumeros.size();
        System.out.println("Media: " + media);

        // mostrar elementos menor que la media
        System.out.println("Menores que la media");
        for (Integer lista : listaNumeros) {
            if (lista < media)
                System.out.println(lista);
        }

        // mostrar lista
        System.out.println("Lista final");
        for (Integer cajones : listaNumeros) {
            System.out.println(cajones);
        }

    }

}
