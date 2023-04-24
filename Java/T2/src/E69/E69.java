package E69;

/*
69.- Crear una clase llamada Hora, con los atributos horas, minutos y segundos. Dicha
clase podrá ser construida indicando los tres atributos, solo las horas y los minutos o
sólo las horas. La clase tendrá los métodos necesarios para modificar la hora en
cualquier momento de forma manual y para mostrar la hora que tiene en un momento
dado. Hay que mantener los atributos con valores correctos en todo momento.
*/

import E69.Hora;
import java.util.Scanner;

public class E69 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Hora casio = new Hora(17,23);
        
        casio.mostrarHora();
        

        System.out.print("Hora: ");
        int hora = teclado.nextInt();
        System.out.print("Minuto: ");
        int minuto = teclado.nextInt();
        System.out.print("Segundo: ");
        int segundo = teclado.nextInt();
        
        casio.cambiarHora(hora, minuto, segundo);
        casio.mostrarHora();
    }

}
