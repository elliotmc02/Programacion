/*
70.- Crea la clase Rectángulo, la cual almacenará la base y la altura. Estos atributos
serán privados y no deben poder accederse desde el exterior. Además, la clase tendrá los
métodos necesarios para calcular el área (base * altura), el perímetro (2*(b+h)) del
rectángulo y un método para representar en texto la clase:
*/

package E70;


public class E70 {

    public static void main(String[] args) {

        Rectangulo figura1 = new Rectangulo(6, 5);
        
        figura1.cArea();
        figura1.cPerimetro();
        System.out.println(figura1);

    }

}
