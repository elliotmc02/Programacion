/*Realiza un programa que dada una cantidad de dinero en Euros, realice un desglose 
en billetes y monedas

Introduce cantidad a desglosar: 434
El desglose obtenido es...
2 billetes de 200€
1 billete de 20€
1 billete de 10€
2 monedas de 2€

Los billetes disponibles son de 500,200,100,50,20,10 y 5€ y las monedas de 2 y 1€.*/

import java.util.Scanner;

public class Ejercicio28 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int uno, dos, cinco, diez, veinte, cincuenta, cien, doscientos, quinientos, cantidad, res;
        System.out.print("Introduzca la cantidad a desglosar: ");
        cantidad=sc.nextInt();
        
        quinientos=cantidad/500;
        res=cantidad%500;
        doscientos=res/200;
        res=res%200;
        cien=res/100;
        res=res%100;
        cincuenta=res/50;
        res=res%50;
        veinte=res/20;
        res=res%20;
        diez=res/10;
        res=res%10;
        cinco=res/5;
        res=res%5;
        dos=res/2;
        res=res%2;
        uno=res/1;
        

        System.out.println(quinientos+" billetes de 500");
        System.out.println(doscientos+" billetes de 200");
        System.out.println(cien+" billetes de 100");
        System.out.println(cincuenta+" billetes de 50");
        System.out.println(veinte+" billetes de 20");
        System.out.println(diez+" billetes de 10");
        System.out.println(cinco+" billetes de 5");
        System.out.println(dos+" monedas de 2");
        System.out.println(uno+" monedas de 1");
    }
}
