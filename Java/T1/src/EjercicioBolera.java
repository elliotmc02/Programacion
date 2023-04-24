import java.util.Scanner;
public class EjercicioBolera {

    public static void main(String[] args) {
        int edad;
        double precio=9;
        double niñatos=1; //Precio menores 5 años
        double niños=25; //Porcentaje niños
        double precioniños=precio-(precio*niños/100); //Resultado precio niños
        double mayores=75; //Porcentaje mayores 50 hasta 70
        double preciomayores=precio-(precio*mayores/100); //Resultado mayores
        double viejos=1; //Precio mayores 70
       
        Scanner teclado=new Scanner(System.in);
        System.out.print("Cual es su edad?:");
        edad=teclado.nextInt();
        teclado.close();
        if (edad<=5) {
            System.out.println("Debes pagar "+niñatos+" euros");
        }
        else if (edad>5&&edad<=14) {
            System.out.println("Debes pagar "+precioniños+" euros");
        }
        else if (edad>14&&edad<=50) {
            System.out.println("Debes pagar "+precio+" euros");
        }
        else if (edad>50&&edad<=70) {
            System.out.println("Debes pagar "+preciomayores+" euros");
        }
        else if (edad>70) {
            System.out.println("Debes pagar "+viejos+" euros");
        }
    }

}
