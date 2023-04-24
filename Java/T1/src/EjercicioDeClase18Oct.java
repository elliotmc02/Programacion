/*
Pedir dos numeros positivos
Base y exponente
Si ponen negativos
Calcular la potencia
*/

import java.util.Scanner;

public class EjercicioDeClase18Oct {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int i, exp, base, res;
        System.out.print("Dame la base: ");
        base = teclado.nextInt();
        System.out.print("Dame el exponente: ");
        exp = teclado.nextInt();
        
        while (base<0||exp<0) {
            if (base<0) {
                System.out.print("Incorrecto, dame un numero positivo (base): ");
                base = teclado.nextInt();
            }
            if (exp<0) {
                System.out.print("Incorrecto, dame un numero positivo (exponente): ");
                exp = teclado.nextInt(); 
            }
        }
        
        res=base;
        
        for (i = 1; i<exp; i++) {
            res*=base;
        }
        
        teclado.close();
        
        if (exp==0) {
            System.out.println(res=1);
        }
        
        else {
            System.out.println(res);
            
        }
    }
}
