/*
Desarrolla un programa que haga lo siguiente:
b) (0.5 puntos) Pide al usuario otros dos valores enteros que estén entre el 2 y el
120 (debes controlar que eso  suceda correctamente y, en caso de que no su-
ceda así, volver a pedir el número). 
c) (1 punto) Comprueba si el esos números se encuentran en el array ‘original’ e
indica por pantalla si se cada uno de ellos se encuentra o no (ver ejemplo).
1) (0,5 puntos) Si solo está el primero, indica la primera y la última aparición
de este en el array.
2) (0,5 puntos) Si solo está el segundo, indica la primera y la última aparición
de este en el array.
3) (0,75 puntos) Si ambos están, cambia todas las apariciones del primer nú-
mero por el segundo y luego, las apariciones del segundo por el primero.
Imprime el contenido del array en horizontal separando cada valor por un
espacio.
d) (1,25 puntos) Mueve una posición hacia adelante cada cajón del array original
(como se encuentre en este punto del programa). Es decir, el cajón 0 debe
pasar al cajón 1, el cajón 1 al cajón 2,... El último cajón debe pasar a ser el pri-
mero. Imprime el array resultante.
Ejemplo: El array 1,2,3,4,5,6 pasa a ser el array 6,1,2,3,4,5
*/

import java.util.Scanner;

public class T1P2E3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int[] original = new int[6];
    
        // Apartado A
        int num;
        System.out.println("\nApartado A");
        
        for (int i = 0; i < original.length; i++) {
            do {
            System.out.print("Introduce un numero mayor que 0: ");
            num = teclado.nextInt();
            } while (num < 0);
                original[i] = num;
                
        }
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + " ");
        }
        
        // Apartado B
        
        System.out.println();
        System.out.println("\nApartado B");
        
        int valor1, valor2 = 0;
        boolean error;
        do {
            error = false;
            System.out.print("Mete un numero entre 2 y 120: ");
            valor1 = teclado.nextInt();
            
            if (valor1 > 120 || valor1 < 2) {
                System.out.println("Error, mete un numero entre 2 y 120.");
                error = true;
            }
            if (!error) {
                System.out.print("Mete otro numero entre 2 y 120: ");
                valor2 = teclado.nextInt();

                if (valor2 > 120 || valor2 < 2) {
                    System.out.println("Error, mete un numero entre 2 y 120.");
                    error = true;
                }
            }
        } while (error);
        
        // Apartado C
        
        System.out.println("\nApartado C");
        
        int prim1 = -1, ult1 = -1, prim2 = -1, ult2 = -1;
        boolean estaPrimero = false;
        boolean estaSegundo = false;
        int tmp;
        for (int i = 0; i < original.length; i++) {
            if (original[i] == valor1) { // si encuentra el primer valor
                estaPrimero = true;
                if (ult1 == -1) {
                    prim1 = i;
                    ult1 = prim1;
                } else {
                    ult1 = i;
                }
            }
            
            if (original[i] == valor2) { // si encuentra el segundo valor
                estaSegundo = true;
                if (ult2 == -1) { 
                    prim2 = i;
                    ult2 = prim2;
                } else {
                    ult2 = i;
                }
            }
        }
        if (estaPrimero && !estaSegundo) { // si aparece el primer valor en el array
            System.out.println(valor1 + " esta en el array");
            System.out.println(valor2 + " no esta en el array");
            
            System.out.println(valor1 + " aparece por primera vez en la posicion: " + prim1);
            System.out.println(valor1 + " aparece por ultima vez en la posicion: " + ult1);
            
        }
        else if (!estaPrimero && estaSegundo) { // si aparece el segundo valor en el array
            System.out.println(valor1 + " no esta en el array");
            System.out.println(valor2 + " esta en el array");
            
            System.out.println(valor2 + " aparece por primera vez en la posicion: " + prim2);
            System.out.println(valor2 + " aparece por ultima vez en la posicion: " + ult2);
        }
        else {
            System.out.println(valor1 + " esta en el array");
            System.out.println(valor2 + " esta en el array");
            
            tmp = original[prim2]; // almaceno la primera posicion del segundo valor en una variable auxiliar
            original[prim2] = original[prim1]; // sustituyo lo que hay en el cajon "prim2" con el cajon del "prim1"
            original[prim1] = tmp; // sustituyo el cajon "prim1" con el "tmp (cajon prim2)" 
            
            if (prim1 != ult1) { // si son diferentes el valor de la primera posicion y el de la ultima posicion se sustituyen, sino es innecesario
                tmp = original[ult2]; // almaceno la ultima posicion del segundo valor en una variable
                original[ult2] = original[ult1]; // sustituyo el cajon "ult2" con el cajon "ult1"
                original[ult1] = tmp; // "sustituyo el cajon "ult1" con el "tmp (cajon ult2)"
            }
            
            for (int i = 0; i < original.length; i++) {
                System.out.print(original[i]+ " ");
            }
            
        }
        teclado.close();
        
        // Apartado D
        
        System.out.println();
        System.out.println("\nApartado D");
        
        int aux;
        for (int i = original.length - 1; i > 0; i--) {
            aux = original[i];
            original[i] = original[i - 1];
            original[i - 1] = aux;
        }
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + " ");
        }
    }

}
