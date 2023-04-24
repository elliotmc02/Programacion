/*1.Calcular la suma entre 1 y 10
b) Calcular la suma entre 1 y el numero que meta el usuario (mayor que 1)


2. Contar los numeros pares entre 1 y 100
(sale por pantalla: hay__numeros pares)

3. Pide un numero entero positivo al usuario
muestra la tabla de multiplicar de ese numero
Ej: mete numero: 2
2x0=0
2x1=2...
*/

import java.util.Scanner;

public class EjercicioFORClase {

    public static void main(String[] args) {
        
        //Ejercicio 1
        
        /*Scanner teclado=new Scanner(System.in);
        int i, num;
        int suma=0;
        System.out.print("Introduzca un número: ");
        num=teclado.nextInt();
        teclado.close();
        for (i=1; i<=num; i++) {
            suma+=i;
            System.out.println("Suma es: "+suma);
        }*/
        
        //Ejercicio 2
        
        /*int i;
        int pares=0;
        for (i=1; i<=100; i++) {
            if (i%2==0){
                pares++;
            }
        }
        System.out.println("Hay "+pares+" numeros pares");*/
        
        //Ejercicio 3
        
        Scanner teclado=new Scanner(System.in);
        int i, num; 
        System.out.print("dame un numero: ");
        num=teclado.nextInt();
        teclado.close();
        for (i=0; i<=10; i++) {
            System.out.println(num+"x"+i+"="+(num*i));
        }
    }
}
