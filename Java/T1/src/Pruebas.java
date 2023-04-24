import java.util.Scanner;
public class Pruebas {

    public static void main(String[] args) {
        //Condicionales
        /*int num1, num2, res;
        Scanner teclado=new Scanner(System.in);
        System.out.print("Dame el primer valor: ");
        num1=teclado.nextInt();
        System.out.print("Dame el segundo valor: ");
        num2=teclado.nextInt();
        teclado.close();
        if (num2==0) {
            res=0;
        }
        else{
            res=num1/num2;
            }
        System.out.println("La division es:"+res);*/
        
        //Switch
        int lista[] = new int[5];
        lista[0] = 1;
        lista[1] = 1;
        lista[2] = 1;
        lista[3] = 1;
        lista[4] = 1;
        
        int num = 1196;
        int primero = num % 10000 / 1000;
        int ultimo = num % 10;
        int dostres = num % 1000 / 10;
        System.out.println(primero);
        System.out.println(dostres);
        System.out.println(ultimo);
        
    
    }
    
}
