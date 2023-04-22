package T3P1;

import java.util.Scanner;
import java.util.Objects;
import java.util.InputMismatchException;

public class mainNumeroE {

    public static void main(String[] args) {

        //Variables
        String nombre = "Elliot Moyano"; //PON AQUI TU NOMBRE Y PRIMER APELLIDO

        Scanner entrada = new Scanner(System.in);
        int v1 = -100, v2 = -100; //valores que se piden al usuario
        int cociente = 0; //resultado de la division
        double raiz = 0; //resultado de la raiz cuadrada
        boolean todoCorrecto = false; // Si todo esta bien
        boolean correcto1 = false; // para comprobar el v1
        boolean correcto2 = false; // para comprobar el v2
        NumeroE n1 = null; // inicializo a null los dos objetos
        NumeroE n2 = null;

        do {
            try {
                //Solicito el un valor y creo el primer número
                while (!correcto1) { // si el v1 esta mal, me lo pide
                    System.out.print("Introduce primer valor positivo: ");
                    v1 = entrada.nextInt();
                    n1 = new NumeroE(v1);
                    correcto1 = true;
                }

                //Solicito el otro valor y creo el segundo número
                while (!correcto2) { // si v2 esta mal, me lo pide
                    System.out.print("Introduce segundo valor positivo: ");
                    v2 = entrada.nextInt();
                    n2 = new NumeroE(v2);
                    correcto2 = true;
                }

                //Realizo las operaciones
                cociente = n1.getNumero() / n2.getNumero();
                raiz = Math.sqrt(n1.getNumero() - n2.getNumero());
                System.out.println("El cociente da como resultado: " + cociente);
                System.out.println("La raiz de la suma da como resultado: " + raiz);

                todoCorrecto = true;

            } catch (NumeroError e) {
                System.out.println("El numero no puede ser negativo");
            } catch (ArithmeticException e) {
                System.out.println("Error, division por 0");
                if (v2 == 0) { // hago esto para que me vuelva a pedir el numero si ha introducido el 0
                    correcto2 = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Introduzca un numero positivo, no una cadena");
                entrada.nextLine(); // limpiar el buffer
            } catch (Exception e) {
                System.out.println("Error");
            }
        } while (!todoCorrecto); // si todo esta bien, ya no entra en el bucle
        entrada.close();

        //Fin del programa
        //----------------------------------------------
        //Linea de comprobación: NO HACER CASO y NO TOCAR
        System.out.print("\n Codigo de chequeo de alumno: ");
        System.out.println(checkNumber(nombre, v1, v2));
        //----------------------------------------------

    }

    //NO HACER CASO y NO TOCAR
    public static int checkNumber(String n, int a, int b) {
        return Objects.hash(String.valueOf(n), Integer.valueOf(a), Integer.valueOf(b));
    }

}

// Errores

/*
* Se te pide que la excepción herede de RUNTIMEEXCEPTION, no de Exception.

MAIN

- No necesitas dos variables booleanas para controlar los bucles. Con una es suficiente. Piénsalo.

* Meto un 0 como segundo valor (el 0 es correcto), me da error de división por cero y me vuelve a pedir el número!!. Eso no es correcto

- La raiz devuelve NaN si el operador es negativo, no lanza ninguna excepción. Se controla con un IF

Has hecho un codigo muy enrevesado porque has querido controlarlo todo a la vez. Como resultado, si una operación sale mal, vuelves a pedir el último numero... (si la raiz lanzara excepciones, volverías pedir el segundo valor también)
*/
