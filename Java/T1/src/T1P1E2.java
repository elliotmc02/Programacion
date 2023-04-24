/*Realiza un programa pida al usuario un tres calificaciones (valores enteros entre 0 y
10). Si alguna de esas notas no es correcta, el programa mostrará un mensaje de
error indicando que nota o notas no son correctas y terminará.
A continuación calculará la media de esas tres notas (sin decimales) y mostrará por
pantalla si la media es INSUFICIENTE, SUFICIENTE, NOTABLE o SOBRESALIENTE
(nada más).*/


import java.util.Scanner;
public class T1P1E2 {

    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner teclado=new Scanner(System.in);
        System.out.print("Introduzca una calificación: ");
        n1=teclado.nextInt();
        System.out.print("Introduzca una calificación: ");
        n2=teclado.nextInt();
        System.out.print("Introduzca una calificación: ");
        n3=teclado.nextInt();
        teclado.close();
        
        int media=(int)(n1+n2+n3)/3;
        
        if (n1<0||n1>10) {
            System.out.println("Error, la primera nota no es correcta.");
        }
        if (n2<0||n2>10) {
            System.out.println("Error, la segunda nota no es correcta.");
        }
        if (n3<0||n3>10) {
            System.out.println("Error, la tercera nota no es correcta.");
        }
        if ((n1>=0&&n1<=10)&&(n2>=0&&n2<=10)&&(n3>=0&&n3<=10)) {
            if (media>=0&&media<=4){
                System.out.println("La media es INSUFICIENTE");
            }
            else if (media==5||media==6){
                System.out.println("La media es SUFICIENTE");
            }
            else if (media==7||media==8){
                System.out.println("La media es NOTABLE");
            }
            else if (media==9||media==10){
                System.out.println("La media es SOBRESALIENTE");
            }
        }
    }
}
